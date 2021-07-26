package example;

//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {
//	
//	@Autowired
//	private MockMvc mock;
//	
//	@MockBean
//	EmployeeService service;
//	
//	@MockBean
//	EmployeeRepo repo;
//	
//	
//	private static String asJsonString(final Employee employee) {
//        try {
//            return new ObjectMapper().writeValueAsString(employee);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//	
//	@Test
//	public void addEmployee() throws Exception{
//		Employee e = new Employee("Test", "Add", "Role");
//		Mockito.when(service.addEmployee(Mockito.any(Employee.class))).thenReturn(e);
//		mock.perform( MockMvcRequestBuilders.post("/employees")
//				.content( asJsonString(e) )
//				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON) )
//		.andExpect(status().isOk());
//	}
//
//	@Test
//	public void getEmployee() throws Exception{
//		addEmployee();
//		addEmployee();
//		mock.perform(MockMvcRequestBuilders.get("/employees/{id}", 2))
//		.andExpect(status().isOk());
//	}
//	
//	@Test
//	public void updateEmployee() throws Exception{
//		Employee upd = new Employee("Update", "Update", "Update");
//		
//		Mockito.when(service.updateEmployee(upd, 1)).thenReturn(upd);
//		mock.perform( MockMvcRequestBuilders.post("/employees")
//				.content( asJsonString(upd) )
//				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON) )
//		.andExpect(status().isOk());
//	}
}
