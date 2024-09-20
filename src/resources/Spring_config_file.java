package resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import bean.Address;
import bean.Student;



@Configuration
public class Spring_config_file {
	
	@Bean
	public Address createAddrObj() {
		Address addr=new Address(200,"ghaziabad",201010);
		
		return addr;
	}
	
	@Bean
	public Student createStdObj() {
		
		Student std =new Student(22,"gaurav",createAddrObj());
		
		return std;
	}

}


