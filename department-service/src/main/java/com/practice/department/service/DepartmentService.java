package com.practice.department.service;

import com.practice.department.entity.Department;
import com.practice.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside findDepartmentById method of department service");
        return departmentRepository.findByDepartmentId(departmentId);
    }

    public Department saveDepartment(Department department) {
        log.info("Inside save department method of department service");
        return departmentRepository.save(department);
    }
}
