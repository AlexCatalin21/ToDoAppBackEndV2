package com.example.todoappbackend.todos.repository;

import com.example.todoappbackend.todos.model.ToDoType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoTypeRepository extends JpaRepository<ToDoType, Long> {
}
