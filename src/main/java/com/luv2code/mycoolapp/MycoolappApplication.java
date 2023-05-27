package com.luv2code.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Additional component scanning
/*@SpringBootApplication(scanBasePackages = {
		"com.luv2code.mycoolapp",
		"com.luv2code.util"})
*/

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

}
