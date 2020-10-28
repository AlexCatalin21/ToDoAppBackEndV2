package com.example.todoappbackend.todos.api;

import com.example.todoappbackend.todos.dto.ToDoDto;
import com.example.todoappbackend.todos.model.ToDo;
import com.example.todoappbackend.todos.model.ToDoStatus;
import com.example.todoappbackend.todos.model.ToDoType;
import com.example.todoappbackend.todos.service.ToDoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public List<ToDo> getAllToDos(){
        return toDoService.getAllToDos();
    }

    @GetMapping("/statuses")
    public List<ToDoStatus> getAllStatuses(){
        return toDoService.getAllStatuses();
    }

    @GetMapping("/types")
    public List<ToDoType> getAllTypes(){
        return toDoService.getAllTypes();
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteToDo(@PathVariable("id") Long Id){
        toDoService.deleteToDo(Id);
        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
