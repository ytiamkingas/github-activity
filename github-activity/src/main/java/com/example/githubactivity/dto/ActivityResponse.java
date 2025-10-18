package com.example.githubactivity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActivityResponse {
	private String description;
	private String repoName;
	private String eventType;
	private String createdAt;
}