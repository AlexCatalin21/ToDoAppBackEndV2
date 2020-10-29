package com.example.todoappbackend.todos.service;


import com.example.todoappbackend.todos.dto.ToDoDto;
import com.example.todoappbackend.todos.model.ToDo;
import com.example.todoappbackend.todos.model.ToDoStatus;
import com.example.todoappbackend.todos.model.ToDoType;
import com.example.todoappbackend.todos.repository.ToDoRepository;
import com.example.todoappbackend.todos.repository.ToDoStatusRepository;
import com.example.todoappbackend.todos.repository.ToDoTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class ToDoService {
    private final ToDoStatusRepository toDoStatusRepository;
    private final ToDoTypeRepository toDoTypeRepository;
    private final ToDoRepository toDoRepository;

    public ToDoStatus getStatusById(Long ID){
        return toDoStatusRepository.getOne(ID);
    }
    public ToDoType getTypeById(Long ID){
        return toDoTypeRepository.getOne(ID); }



    public void addNewToDo(ToDoDto toDoDto){
        ToDo newToDo=new ToDo();
        newToDo.setDescription(toDoDto.getDescription());
        newToDo.setCreationDate(new Date());
        newToDo.setExpiringDate(toDoDto.getExpiringDate());
        newToDo.setEstimatedDays(toDoDto.getEstimatedDays());
        newToDo.setAllocatedTime(toDoDto.getAllocatedTime());
        newToDo.setStatus(getStatusById(toDoDto.getStatusId()));
        newToDo.setType(getTypeById(toDoDto.getTypeId()));

        toDoRepository.save(newToDo);






    }
    public List<ToDo> getAllToDos(){
        return toDoRepository.findAll();
    }

    public List<ToDoStatus> getAllStatuses(){
        return toDoStatusRepository.findAll();
    }

    public List<ToDoType> getAllTypes(){
        return toDoTypeRepository.findAll();
    }

    public void deleteToDo(Long Id){
        toDoRepository.deleteById(Id);
    }

    public void updateToDo(Long Id, @RequestBody ToDoDto toDoDetails){
        ToDo toDo= toDoRepository.getOne(Id);
        toDo.setCompletionDate(toDoDetails.getCompletionDate());
        toDo.setStatus(getStatusById(toDoDetails.getStatusId()));
        ToDo updatedToDo= toDoRepository.save(toDo);
    }

}
