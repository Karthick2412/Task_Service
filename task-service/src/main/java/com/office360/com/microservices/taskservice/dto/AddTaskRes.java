package com.office360.com.microservices.taskservice.dto;

import java.util.UUID;

public class AddTaskRes {
	
	private UUID taskId;

	public UUID getTaskId() {
		return taskId;
	}

	public void setTaskId(UUID taskId) {
		this.taskId = taskId;
	}
	 

}
