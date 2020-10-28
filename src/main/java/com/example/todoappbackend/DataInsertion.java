package com.example.todoappbackend;

import com.example.todoappbackend.todos.model.ToDoStatus;
import com.example.todoappbackend.todos.model.ToDoType;
import com.example.todoappbackend.todos.repository.ToDoStatusRepository;
import com.example.todoappbackend.todos.repository.ToDoTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DataInsertion {

    private final ToDoTypeRepository toDoTypeRepository;
    private final ToDoStatusRepository toDosStatusRepository;

    public void addTypesAndStatuses(){
        ToDoType toDoType1 = new ToDoType();
        toDoType1.setType(ToDoType.Type.HOME);
        toDoTypeRepository.save(toDoType1);

        ToDoType toDoType2 = new ToDoType();
        toDoType2.setType(ToDoType.Type.WORK);
        toDoTypeRepository.save(toDoType2);

        ToDoType toDoType3 = new ToDoType();
        toDoType3.setType(ToDoType.Type.FREE_TIME);
        toDoTypeRepository.save(toDoType3);

        ToDoStatus status1= new ToDoStatus();
        status1.setStatus(ToDoStatus.Status.IN_PROGRESS);
        toDosStatusRepository.save(status1);

        ToDoStatus status2= new ToDoStatus();
        status2.setStatus(ToDoStatus.Status.DONE);
        toDosStatusRepository.save(status2);
    }
}