package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.painjson.generator.JsonConverter;


@SpringBootApplication
public class PainJSONServer {
	
	public static void main(String[] args) {
		JsonConverter converter = new JsonConverter();
		SpringApplication.run(PainJSONServer.class, args);
		converter.initConvertJsonToPOJO();
	}
}
