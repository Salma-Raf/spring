package org.sid;

import org.sid.dao.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Filiere1Application implements CommandLineRunner{
	@Autowired
	ClientRepository CL;
	public static void main(String[] args) {
		SpringApplication.run(Filiere1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {

		System.out.print(CL.findAll().size());
		
		}catch(Exception e) {
			System.out.print(e.getMessage());
			
		}		
	}

}
