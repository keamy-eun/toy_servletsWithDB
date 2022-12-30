package com.midleterm.midle_term;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class MidleTermApplication {

	public static void main(String[] args) {
		SpringApplication.run(MidleTermApplication.class, args);
	}

}
