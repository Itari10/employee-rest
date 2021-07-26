package example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/* Employee Entity
 * ===============================================================
 * Employee object contains ID, name, role.  Contains getters
 * and setters for fields.
 */
@Entity
@Table
public class Employee {
	
	@Id //"key" of "table" Employee
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) //ID generated automatically
	private int id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String role;
	
	//Constructors: Empty constructor for JPA's use (protected)
	protected Employee(){}
	
	public Employee(String firstName, String lastName, String role){
		this.firstName = firstName;
		this.lastName  = lastName;
		this.role      = role;
	}
	
	@Override
	public String toString(){
		return "[" + id + " | " + firstName + " " + lastName + " | " + role + "]";
	}

	//Getters
	public int getID(){
		return id;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String getRole(){
		return role;
	}
	
	//Setters	
	public void setID(int id){
		this.id = id;
	}	
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setRole(String role){
		this.role     = role;
	}	

}
