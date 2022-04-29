package basic;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import basic.module.Departement;
import basic.module.Professeur;

@SpringBootApplication
public class ProjetspringgApplication {
	
	public static void main(String[] args) {
		
	   
		SpringApplication.run(ProjetspringgApplication.class, args);
		
		
			
		
			}
	
	@Bean
    public ModelMapper modelMapper() {
    	return new ModelMapper();
    }
	

}
