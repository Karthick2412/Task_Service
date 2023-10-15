package com.office360.com.microservices.taskservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.office360.com.microservices.taskservice.common.APIResponse;
import com.office360.com.microservices.taskservice.dto.AddTaskReq;
import com.office360.com.microservices.taskservice.service.impl.TasksServiceImpl;

@RequestMapping("tasks")
@RestController()
public class TaskController {
	
	@GetMapping("testJWT")
	public String JWTTest() {
		return "JWT WORKS";
	}
	
	@Autowired
	private TasksServiceImpl taskService;
	
	@PostMapping("new")
	public APIResponse newTask(@RequestBody AddTaskReq newTask) {
		return taskService.addTask(newTask);
	}

}
