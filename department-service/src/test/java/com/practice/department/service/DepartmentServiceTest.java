package com.practice.department.service;

import static org.mockito.ArgumentMatchers.any;

import com.practice.department.entity.Department;
import com.practice.department.repository.DepartmentRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@ExtendWith(MockitoExtension.class)
public class DepartmentServiceTest {

  @Mock
  private DepartmentRepository departmentRepository;

  @InjectMocks
  DepartmentService departmentService;

  @Test
  void findByDepartmentId_Test() {
    Mockito.when(departmentRepository.findByDepartmentId(any())).thenReturn(Department.builder().build());
    departmentService.findDepartmentById(1L);
  }

  @Test
  void saveDepartment_Test() {
    Mockito.when(departmentRepository.save(any())).thenReturn(Department.builder().build());
    var department = Department.builder().departmentName("test").departmentAddress("test").departmentCode("test").build();
    departmentService.saveDepartment(department);
  }
}
