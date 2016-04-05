package com.blob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlobServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlobServiceApplication.class, args);
		
		System.out.println(" BlobServiceApplication ... ");
	}
}
