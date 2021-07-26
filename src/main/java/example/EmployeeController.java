package example;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/* Controller for REST API 
 */
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	//Get All Employees
	@GetMapping("/employees")	
	public List<Employee> findAllEmployees(){
		return service.findAllEmployees();
	}
	
	//Get Employee by ID
	@GetMapping("/employees/{id}")
	public Employee findEmployeeById( @PathVariable(value = "id") int id ){
		return service.findEmployeeById(id);
	}
	
	//Add New Employee
	@PostMapping("/employees")
	public Employee addEmployee( @RequestBody Employee e ){
		return service.addEmployee(e);
	}
	
	//Update Employee Info
	@PutMapping("/employees/{id}")
	public Employee updateEmployee( @RequestBody Employee e, @PathVariable int id ){
		return service.updateEmployee(e, id);
	}
	
}
