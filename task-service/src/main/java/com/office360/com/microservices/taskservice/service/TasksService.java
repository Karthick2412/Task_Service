package com.office360.com.microservices.taskservice.service;

import com.office360.com.microservices.taskservice.common.APIResponse;
import com.office360.com.microservices.taskservice.dto.AddTaskReq;

public interface TasksService {
	
	APIResponse addTask(AddTaskReq newTask);
	

}
