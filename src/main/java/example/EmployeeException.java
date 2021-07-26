package example;

@SuppressWarnings("serial")
public class EmployeeException extends RuntimeException {

	EmployeeException(int id){
		super("Employee with ID number " + id + " not found");
	}
}
