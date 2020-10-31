package com.pavan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

	@Autowired
	private EmpRepository empRepository;

	public List<Emp> getAllEmployees() {

		List<Emp> list = new ArrayList<>();
		empRepository.findAll().forEach(list::add);
		return list;
	}
	public Emp getEmployee(int id) {

		return empRepository.findOne(id);

	}
	public void addEmployee(Emp emp) {

        empRepository.save(emp);
	}

	public void updateEmployee(Emp emp, int id) {
		empRepository.save(emp);

	}
	public void deleteEmployee(int id) {
		empRepository.delete(id);

	}


}
