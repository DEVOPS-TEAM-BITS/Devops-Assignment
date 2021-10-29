package com.practice.department.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.practice.department.entity.Department;
import com.practice.department.repository.DepartmentRepository;
import com.practice.department.service.DepartmentService;
import org.apache.http.entity.ContentType;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class DepartmentControllerTest {

  private String URL = "/departments/";
  @Autowired
  private MockMvc mockMvc;
  @MockBean
  private DepartmentRepository departmentRepository;

  @Test
  void saveDepartment_Test() throws Exception {
    var department = Department.builder().departmentName("test").departmentAddress("test")
        .departmentCode("test").build();
    mockMvc.perform(post(URL).contentType(MediaType.APPLICATION_JSON).content(new ObjectMapper().writeValueAsString(department))).andExpect(status().is2xxSuccessful());
  }

  @Test
  void findByDepartmentId_Test() throws Exception {
    Mockito.when(departmentRepository.findByDepartmentId(any())).thenReturn(Department.builder()
        .build());
    mockMvc.perform(get(URL + "1")).andExpect(status().is2xxSuccessful());
  }
}

