package example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/* Simple Payroll Service by Emily Winkleman
 * ===============================================================
 * Manages employees of a company. Employees are accessed via JPA.
 * Employee object contains ID, name, role. Supported functions:
 * GET ALL EMPLOYEES
 * FIND EMPLOYEE BY ID
 * ADD NEW EMPLOYEE
 * UPDATE EMPLOYEE DETAILS
 */
@SpringBootApplication
public class SpringBootMain {
	
	public static void main(String[] args){
		SpringApplication.run(SpringBootMain.class); //launch
	}
	
	@Bean
	public CommandLineRunner example(EmployeeRepo repo){
		return (args) -> {
			
			//Add a few base employees
			repo.save( new Employee("Emily", "Winkleman", "Full Stack Developer") );
			repo.save( new Employee("Jing", "Fang", "Squad Architect") );
			repo.save( new Employee("Todd", "Schultz", "Software Developer") );
		
		}; //end of return
	}
}
