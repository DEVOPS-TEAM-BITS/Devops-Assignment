package com.practice.department.controller;

import com.practice.department.dto.User;
import com.practice.department.entity.Department;
import com.practice.department.service.DepartmentService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/departments/")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside save department method of department controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("Inside findDepartmentById method of department controller");
        return departmentService.findDepartmentById(departmentId);
    }

    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @DeleteMapping("{id}")
    public void deleteDepartmentById(@PathVariable("id") Long departmentId) {
        departmentService.deletedDepartmentById(departmentId);
    }

    @PutMapping
    public Department EditDepartment(@RequestBody Department department) {
        return departmentService.editDepartment(department);
    }

    @GetMapping("{departmentId}/users")
    public void getAllUsersOfDepartment(@PathVariable("departmentId") Long departmentId) {
        departmentService.getAllUsersOfDepartment(departmentId);
    }
}
