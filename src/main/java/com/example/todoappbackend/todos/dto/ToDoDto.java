package com.example.todoappbackend.todos.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ToDoDto {

    private String description;
    private Date creationTime;
    private Date expiringDate;
    private long estimatedDays;
    private long allocatedTime;
    private long statusId;
    private long boardId;

}
