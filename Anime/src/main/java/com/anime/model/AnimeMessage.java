package com.anime.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AnimeMessage implements Serializable{

	private static final long serialVersionUID = -6358381915366283196L;

    public static AnimeMessage createInstance(String message) {
        AnimeMessage animeMessage = new AnimeMessage();
        animeMessage.setMessage(message);
        return animeMessage;
    }

    @JsonProperty("message")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
	
}
