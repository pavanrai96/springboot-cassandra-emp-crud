package com.pavan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@GetMapping("/employees")
	public List<Emp> getAllEmployees()
	{
		return empService.getAllEmployees();
	}

	@GetMapping("/employee/{id}")
	public Emp getEmployee(@PathVariable int id)
	{
		return empService.getEmployee(id);
	}
	
	@PostMapping("/employee")
	public void addEmployee(@RequestBody Emp emp)
	{
		 empService.addEmployee(emp);
	}
	
	@PutMapping("/employee/{id}")
	public void updateEmployee(@RequestBody Emp emp,@PathVariable int id)
	{
		 empService.updateEmployee(emp,id);
	}
	
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable int id)
	{
		 empService.deleteEmployee(id);
	}
}
