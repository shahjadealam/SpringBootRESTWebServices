package spring.boot.base.crud.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import spring.boot.base.crud.exception.CustomException;
import spring.boot.base.crud.model.Employee;

@Service
public class EmpService {

	// Arrays.asList makes a fixed size List
	public List<Employee> empList = new ArrayList<>(
			Arrays.asList(new Employee(101, "Mohneesh", "88882225", "moni@gmail.com", "Block Chain", "Agra"),
					new Employee(102, "Rohan", "9999444", "rohan@gmail.com", "DBA.", "Pune"),
					new Employee(103, "Himanshu", "778855669", "himanshu@gmail.com", "OTA Server.", "Shirsha")));

	public List<Employee> getAll() {
		return empList;
	}

	public Employee getById(int id) throws CustomException {

		if (id == 101) {
			throw new CustomException("Id mismatched!!!");
		}

		return empList.stream().filter(a -> a.getId() == id).findFirst().get();
	}

	public void addEmployee(Employee employee) {

		empList.add(employee);

	}

	public void updateEmployee(int id, Employee employee) {

		for (int i = 0; i < empList.size(); i++) {
			Employee e = empList.get(i);
			if (e.getId() == id) {
				empList.set(i, employee);
			}
		}

	}

	public void deleteEmployee(int id) {

		// using java8 methods
		empList.removeIf(r -> r.getId() == id);

		// Without Using Java8
		/*
		 * for(int i=0;i<empList.size();i++) { Employee e=empList.get(i);
		 * if(e.getId()==id) { empList.remove(i); } }
		 */
	}

	/*
	 * public List<Employee> getAll() {
	 * 
	 * Employee emp = new
	 * Employee(101,"Mohneesh","88882225","moni@gmail.com","Block Chain", "Agra");
	 * List<Employee> list = new ArrayList<>(); list.add(emp);//way 1 to add
	 * Employee data into List list.add(new
	 * Employee(102,"Rohan","9999444","rohan@gmail.com","DBA.", "Pune"));// way 2 to
	 * add Employee data in List list.add(new
	 * Employee(103,"Himanshu","778855669","himanshu@gmail.com","OTA Server.",
	 * "Shirsha"));
	 * 
	 * return list; }
	 */

}
