package com.practice.department.service;

import com.practice.department.dto.User;
import com.practice.department.dto.UserList;
import com.practice.department.entity.Department;
import com.practice.department.repository.DepartmentRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside findDepartmentById method of department service");
        return departmentRepository.findByDepartmentId(departmentId);
    }

    public Department saveDepartment(Department department) {
        log.info("Inside save department method of department service");
        return departmentRepository.save(department);
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public void deletedDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    public Department editDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public void getAllUsersOfDepartment(Long departmentId) {
        var response = restTemplate.getForObject("http://API-GATEWAY/users/department/" + departmentId, User[].class);
        log.info(String.valueOf(response));
    }
}
