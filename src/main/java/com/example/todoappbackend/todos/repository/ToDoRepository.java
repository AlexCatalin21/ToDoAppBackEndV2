package com.example.todoappbackend.todos.repository;

import com.example.todoappbackend.todos.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
