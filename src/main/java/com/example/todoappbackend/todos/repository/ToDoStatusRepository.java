package com.example.todoappbackend.todos.repository;

import com.example.todoappbackend.todos.model.ToDoStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoStatusRepository extends JpaRepository<ToDoStatus, Long> {
}
