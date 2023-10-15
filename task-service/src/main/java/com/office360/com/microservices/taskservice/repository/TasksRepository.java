package com.office360.com.microservices.taskservice.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.office360.com.microservices.taskservice.entity.Tasks;

public interface TasksRepository extends JpaRepository<Tasks, UUID>{

}
