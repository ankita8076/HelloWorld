package com.example.restspring.HelloWorld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restspring.HelloWorld.entity.Department;
import com.example.restspring.HelloWorld.repository.DepartmentRepository;

@Service
public class DepartmentInterfaceImplementation  implements DepartmentInterface{
	
	@Autowired 
	public DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		
		return departmentRepository.save(department);
		
	}

	@Override
	public List<Department> allDepartmentetails() {
		return departmentRepository.findAll();
	}

	@Override
	public Department getDepartmentByID(Long id) {
		
		return departmentRepository.findById(id).get();
		
		
	}

	@Override
	public void deleteDepartmentByID(Long id) {
		departmentRepository.deleteById(id);

}

	@Override
	public Department updateDepartment(Long id, Department department) {
		
		department.setDepartmentId(id);
		departmentRepository.save(department);
		return department;
		
	}

	@Override
	public Department getDepartmentByName(String departmentName) {
		
		return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
		
	}

}

