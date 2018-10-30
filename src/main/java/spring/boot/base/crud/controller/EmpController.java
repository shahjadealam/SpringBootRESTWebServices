package spring.boot.base.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.base.crud.exception.CustomException;
import spring.boot.base.crud.model.Employee;
import spring.boot.base.crud.service.EmpService;

@RestController
public class EmpController {

	@Autowired
	EmpService empservice;

	@RequestMapping("/")
	String start() {
		return "You Are Welcome!!";
	}

	@RequestMapping("/getall")
	public List<Employee> getAll() {
		return empservice.getAll();
	}

	// Get A single element From List
	@RequestMapping("/getall/{id}")
	public Employee getById(@PathVariable int id) throws CustomException {
		/*
		 * if(id==101) { throw new CustomException("Id mismatched!!!"); }
		 */
		return empservice.getById(id);
	}

	// Add new Object to List
	@RequestMapping(method = RequestMethod.POST, value = "/getall")
	public void addEmployee(@RequestBody Employee employee) {

		empservice.addEmployee(employee);
	}

	// Update Existing element of List
	@RequestMapping(method = RequestMethod.PUT, value = "getall/{id}")
	public void updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
		empservice.updateEmployee(id, employee);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "getall/{id}")
	public void deleteEmployee(@PathVariable int id) {
		empservice.deleteEmployee(id);
	}

}
