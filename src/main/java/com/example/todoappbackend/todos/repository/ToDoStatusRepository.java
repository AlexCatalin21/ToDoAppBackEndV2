package com.example.todoappbackend.todos.repository;

import com.example.todoappbackend.todos.model.ToDoStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoStatusRepository extends JpaRepository<ToDoStatus, Long> {
}
