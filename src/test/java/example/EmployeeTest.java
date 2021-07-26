package example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class EmployeeTest {

	@Autowired
	private EmployeeController controller;
	
	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate template;
	
	@Test
	public void contextLoads() throws Exception{
		//Check application context
		assertThat(controller).isNotNull();
	}

//	@Test
//	public void check() throws Exception{
//		assertThat(this.template.getForObject("localhost:8090/", String.class).);
//	}
}

