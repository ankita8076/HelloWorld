package com.example.restspring.HelloWorld.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.restspring.HelloWorld.entity.Department;
import com.example.restspring.HelloWorld.service.DepartmentInterface;

@RestController
public class DepartmentController {
	@Autowired
	public DepartmentInterface departmentService;
	
	
	@PostMapping("/department")
	public Department saveDepartment ( @Valid @RequestBody Department department ) {
		return departmentService.saveDepartment(department);
		
	}

	
	@GetMapping("/department")
	public List<Department> allDepartmentetails() {
		return departmentService.allDepartmentetails();
	
		}
	
	@GetMapping("/department/{id}")
	public Department getDepartmentByID (@PathVariable Long id) {
		return departmentService.getDepartmentByID(id);
		
	}
	
	@DeleteMapping("/department/{id}")
	public String deleteDepartmentByID(@PathVariable Long id) {
		departmentService.deleteDepartmentByID(id);
		return " Department ID deleted Successfully" ;
		
	}
	

	@PutMapping("/department/{id}")
	public Department updateDepartment(@PathVariable Long id, @RequestBody Department department)
	{
	return departmentService.updateDepartment(id,department);
	
	}	
	
	
	@GetMapping("/department/name/{name}")
	public Department getDepartmentByName(@PathVariable("name") String departmentName)
	{
		return departmentService.getDepartmentByName(departmentName);
	}
	
	
}









