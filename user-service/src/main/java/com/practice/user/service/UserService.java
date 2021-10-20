package com.practice.user.service;

import com.practice.user.VO.Department;
import com.practice.user.VO.ResponseTemplateVO;
import com.practice.user.entity.User;
import com.practice.user.repository.UserRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private RestTemplate restTemplate;

  public User saveUser(User user) {
    log.info("Inside saveUser method of User Service");
    return userRepository.save(user);
  }

  public ResponseTemplateVO getUserWithDepartment(Long userId) {
    log.info("Inside getUserWithDepartment method of User Service");
    ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
    User user = userRepository.findByUserId(userId);
    Department department = restTemplate
        .getForObject("http://API-GATEWAY/departments/" + user.getDepartmentId(), Department.class);
    responseTemplateVO.setUser(user);
    responseTemplateVO.setDepartment(department);
    return responseTemplateVO;
  }

  public List<User> getUsersOfDepartment(Long departmentId) {
    return userRepository.findAllByDepartmentId(departmentId);
  }

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  public void deleteUserById(Long userId) {
    userRepository.deleteById(userId);
  }

  public void updateUser(User user) {
    userRepository.save(user);
  }
}
