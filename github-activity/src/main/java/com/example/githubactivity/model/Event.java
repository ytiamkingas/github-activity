package com.example.githubactivity.model;

import lombok.Data;

@Data
public class Event {
	private String type;
	private Repo repo;
	private String created_at;
	
	// Inner static class for repo info
	@Data
	public static class Repo {
		private String name;
	}
}