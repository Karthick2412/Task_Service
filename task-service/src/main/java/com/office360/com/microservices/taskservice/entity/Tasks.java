package com.office360.com.microservices.taskservice.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="app_tasks")
public class Tasks {
	
	@Id
//	@Column(columnDefinition = "BINARY(16)")
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID taskId;
	
//	@Column(columnDefinition = "BINARY(16)")
	private UUID userId;
	
	@Column(name="date")
	private LocalDateTime date;
	
//	@Column(columnDefinition = "BINARY(16)")
	private UUID projectId;
	
	@Column(name="description",columnDefinition = "VARCHAR(300)")
	private String description;
	
	private int statusPercentage;
	
	@Column(columnDefinition = "VARCHAR(10)")
	private String taskFromTime;
	
	@Column(columnDefinition = "VARCHAR(10)")
	private String taskToTime;

	public Tasks() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tasks(UUID taskId, UUID userId, LocalDateTime date, UUID projectId, String description, int statusPercentage,
			String taskFromTime, String taskToTime) {
		super();
		this.taskId = taskId;
		this.userId = userId;
		this.date = date;
		this.projectId = projectId;
		this.description = description;
		this.statusPercentage = statusPercentage;
		this.taskFromTime = taskFromTime;
		this.taskToTime = taskToTime;
	}

	public UUID getTaskId() {
		return taskId;
	}

	public void setTaskId(UUID taskId) {
		this.taskId = taskId;
	}

	public UUID getUserId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
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
	
	
}
