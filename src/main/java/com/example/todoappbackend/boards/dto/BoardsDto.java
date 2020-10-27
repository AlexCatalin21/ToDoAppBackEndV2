package com.example.todoappbackend.boards.dto;

import com.example.todoappbackend.todos.dto.ToDoDto;
import com.example.todoappbackend.todos.model.ToDo;
import lombok.Data;

import java.util.List;

@Data
public class BoardsDto {
    private String name;
    private List<ToDoDto> toDoDtoList;
    private Long boardTypeId;

}
