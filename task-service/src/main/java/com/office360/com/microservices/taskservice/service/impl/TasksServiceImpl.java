package com.office360.com.microservices.taskservice.service.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.office360.com.microservices.taskservice.common.APIResponse;
import com.office360.com.microservices.taskservice.dto.AddTaskReq;
import com.office360.com.microservices.taskservice.dto.AddTaskRes;
import com.office360.com.microservices.taskservice.entity.Tasks;
import com.office360.com.microservices.taskservice.repository.TasksRepository;
import com.office360.com.microservices.taskservice.service.TasksService;

@Service
public class TasksServiceImpl implements TasksService{
	
	@Autowired
	private TasksRepository taskRepo;

	@Override
	public APIResponse addTask(AddTaskReq newTask) {
		
		Tasks task=new Tasks();
		
		DateTimeFormatter DATEFORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    LocalDate ld = LocalDate.parse(newTask.getDate(), DATEFORMATTER);
	    LocalDateTime taskDate = LocalDateTime.of(ld, LocalDateTime.now().toLocalTime());
		
		task.setDate(taskDate);
		
		task.setDescription(newTask.getDescription());
		
		task.setProjectId(newTask.getProjectId());
		
		task.setStatusPercentage(newTask.getStatusPercentage());
		
		task.setTaskFromTime(newTask.getTaskFromTime());
		
		task.setTaskToTime(newTask.getTaskToTime());
		
		task.setUserId(newTask.getUserId());
		
		taskRepo.save(task);
		
		AddTaskRes res=new AddTaskRes();
		
		res.setTaskId(task.getTaskId());
		
		APIResponse api=new APIResponse();
		api.setData(res);
		
		return api;
	}

}
