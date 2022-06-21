package com.mosa.gestion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mosa.gestion.entities.SalleTP;
import com.mosa.gestion.service.SalleTPService;

@SpringBootApplication
public class ReservationApplication {
	@Autowired
	SalleTPService salleTPService;

	public static void main(String[] args) {
		SpringApplication.run(ReservationApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
	salleTPService.saveSalleTP(new SalleTP("ANCU", "111"));
	salleTPService.saveSalleTP(new SalleTP("GOOGLE dev", "123"));

	}

}
