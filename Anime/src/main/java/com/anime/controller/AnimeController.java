package com.anime.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anime.model.*;

@RestController
public class AnimeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ResponseEntity<Response> AnimeService() {
		Response response = new Response();
		response.setResponseCode("00");
		response.setResponseDesc("success");
		response.setResult(AnimeMessage.createInstance("Hello World!"));
		return ResponseEntity.accepted().body(response);
	}
	
}
