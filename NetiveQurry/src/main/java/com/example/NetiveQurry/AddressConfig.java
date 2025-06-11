package com.example.NetiveQurry;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressConfig {
	
//	@Bean
//	public AddressService employeeBean()
//	{
//		return new AddressService();
//	}
	@Bean
	public ModelMapper modelmapper()
	{
		return new ModelMapper();
	}
	
	

}
