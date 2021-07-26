package example;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo repo;
	
	//Get All Employees
	public List<Employee> findAllEmployees(){
		return (List<Employee>) repo.findAll();
	}

	//Get Employee by ID
	public Employee findEmployeeById(int id){
		checkID(id);
		return repo.findById(id).get();
	}
	
	//Add New Employee
	public Employee addEmployee(Employee e){
		return repo.save(e);
	}
	
	//Update Employee Info
	public Employee updateEmployee( Employee e, int id ){
		checkID(id);
		if (repo.findById(id).isPresent()){ 
			e.setID(id);
			return repo.save(e);
		}else{
			return null;
		}
	}
	
	public void checkID(int id){
		if ( (id > repo.findAll().size()) || (id < 1) ){
			throw new IllegalArgumentException("ID given is invalid");
		}
	}
	
}
