package com.example.restspring.HelloWorld.service;

import java.util.List;

import com.example.restspring.HelloWorld.entity.Department;

public interface DepartmentInterface {

	Department saveDepartment(Department department);

	List<Department> allDepartmentetails();

	Department getDepartmentByID(Long id);

	void deleteDepartmentByID(Long id);

	Department updateDepartment(Long id, Department department);

	Department getDepartmentByName(String name);



}
