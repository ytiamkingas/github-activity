package com.example.githubactivity.exception;

@SuppressWarnings("serial")
public class GithubUserNotFoundException extends RuntimeException {
	public GithubUserNotFoundException(String message) {
		super(message);
	}
}