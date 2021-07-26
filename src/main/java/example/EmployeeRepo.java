package example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* Employee Repository 
 * ===============================================================
 * Create repository implementation from interface.
 * Extends CrudRepository to inherit save, delete, 
 * search, etc. CrudRepository uses JRA EntityManager.
 */
@Repository
public interface EmployeeRepo extends JpaRepository<Employee /*Entity*/, Integer /*ID*/>{
	
//	List<Employee> findAllEmployees();
//	Employee findEmployeeById(int id);
//	Employee addEmployee(Employee e);
//	Employee updateEmployee(Employee e, int id);
	
}
