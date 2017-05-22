package com.greetgo;

import com.greetgo.mappers.DataMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication /*implements CommandLineRunner*/ {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

//	final private DataMapper mapper;
//
//	public HelloworldApplication(DataMapper cityMapper) {
//		this.mapper = cityMapper;
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		for (int i = 1; i <= mapper.numberOfRows(); i++) {
//			System.out.println(mapper.getById(i));
//		}
//
//
//	}

}
