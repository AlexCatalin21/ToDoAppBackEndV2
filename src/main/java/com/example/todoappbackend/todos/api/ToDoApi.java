package com.example.todoappbackend.todos.api;

import com.example.todoappbackend.todos.dto.ToDoDto;
import com.example.todoappbackend.todos.service.ToDoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/todos")
public class ToDoApi {
    public final ToDoService toDoService;

    @PostMapping
    public ResponseEntity<String> addNewToDo(@RequestBody ToDoDto toDoDto){
        toDoService.addNewToDo(toDoDto);
        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
