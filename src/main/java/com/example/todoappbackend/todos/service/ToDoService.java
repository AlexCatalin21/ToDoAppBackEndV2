package com.example.todoappbackend.todos.service;

import com.example.todoappbackend.boards.model.Boards;
import com.example.todoappbackend.boards.repository.BoardsRepository;
import com.example.todoappbackend.todos.dto.ToDoDto;
import com.example.todoappbackend.todos.model.ToDo;
import com.example.todoappbackend.todos.model.ToDoStatus;
import com.example.todoappbackend.todos.repository.ToDoRepository;
import com.example.todoappbackend.todos.repository.ToDoStatusRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@AllArgsConstructor
public class ToDoService {
    private final ToDoStatusRepository toDoStatusRepository;
    private final BoardsRepository boardsRepository;
    private final ToDoRepository toDoRepository;

    public ToDoStatus getStatusById(Long ID){
        return toDoStatusRepository.getOne(ID);
    }

    public Boards getBoardById(Long Id){
        return boardsRepository.getOne(Id);
    }

//    public ToDo createToDoFromDto(ToDo toDo, ToDoDto toDoDto){
//        toDo.setDescription(toDoDto.getDescription());
//        toDo.setCreationDate(toDoDto.getCreationTime());
//        toDo.setExpiringDate(toDoDto.getExpiringDate());
//        toDo.setEstimatedDays(toDoDto.getEstimatedDays());
//        toDo.setAllocatedTime(toDoDto.getAllocatedTime());
//        toDo.setStatus(getStatusById(toDoDto.getStatusId()));
//        return toDo;
//    }

    public void addNewToDo(ToDoDto toDoDto){
        ToDo newToDo=new ToDo();
        newToDo.setDescription(toDoDto.getDescription());
        newToDo.setCreationDate(new Date());
        newToDo.setExpiringDate(toDoDto.getExpiringDate());
        newToDo.setEstimatedDays(toDoDto.getEstimatedDays());
        newToDo.setAllocatedTime(toDoDto.getAllocatedTime());
        newToDo.setStatus(getStatusById(toDoDto.getStatusId()));
        newToDo.setBoard(getBoardById(toDoDto.getBoardId()));
//        boards.addToDo(newToDo);


        toDoRepository.save(newToDo);
    }

//    public void save(ToDo toDo) {
//        toDoRepository.save(toDo);
//    }
}
