package com.example.githubactivity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.githubactivity.dto.ActivityResponse;
import com.example.githubactivity.service.GithubService;

@RestController
@RequestMapping("/activity")
public class GithubController {
	@GetMapping("/demotest")
	public String test() {
		return "Okay!";
	}
	
	@Autowired
	private GithubService githubService;
	
	// Example 1: /activity/{userName}
	// Example 2: /activity/{userName}?type=PushEvent
	// Example 3: /activity/{userName}?page=2&per_page=10&type=PushEvent
	@GetMapping("/{userName}")
	public List<ActivityResponse> getGithubActivity(
			@PathVariable String userName,
			@RequestParam(required = false) String type,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "10") int per_page) {
		return githubService.fetchUserActivity(userName, type, page, per_page);
	}
}