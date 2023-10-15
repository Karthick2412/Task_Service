package com.office360.com.microservices.taskservice.dto;

import java.util.UUID;

public class AddTaskReq {
	
	private String date;
	
	private UUID projectId;
	
	private String description;
	
	private int statusPercentage;
	
	private String taskFromTime;
	
	private String taskToTime;
	
	private UUID userId;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public UUID getProjectId() {
		return projectId;
	}

	public void setProjectId(UUID projectId) {
		this.projectId = projectId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStatusPercentage() {
		return statusPercentage;
	}

	public void setStatusPercentage(int statusPercentage) {
		this.statusPercentage = statusPercentage;
	}

	public String getTaskFromTime() {
		return taskFromTime;
	}

	public void setTaskFromTime(String taskFromTime) {
		this.taskFromTime = taskFromTime;
	}

	public String getTaskToTime() {
		return taskToTime;
	}

	public void setTaskToTime(String taskToTime) {
		this.taskToTime = taskToTime;
	}

	public UUID getUserId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}
	
	

}
