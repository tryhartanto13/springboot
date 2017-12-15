package com.anime.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.anime")
public class AnimeMain {
	
	public static void main (String [] args) {
		SpringApplication.run(AnimeMain.class, args);
	}
	
}
