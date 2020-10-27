package com.example.todoappbackend;

import com.example.todoappbackend.boards.model.BoardsType;
import com.example.todoappbackend.boards.repository.BoardsTypeRepository;
import com.example.todoappbackend.todos.model.ToDoStatus;
import com.example.todoappbackend.todos.repository.ToDoStatusRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DataInsertion {

    private final BoardsTypeRepository boardsTypeRepository;
    private final ToDoStatusRepository toDosStatusRepository;

    public void addTypesAndStatuses(){
        BoardsType boardType1 = new BoardsType();
        boardType1.setType(BoardsType.Type.HOME);
        boardsTypeRepository.save(boardType1);

        BoardsType boardType2 = new BoardsType();
        boardType2.setType(BoardsType.Type.WORK);
        boardsTypeRepository.save(boardType2);

        BoardsType boardType3 = new BoardsType();
        boardType3.setType(BoardsType.Type.FREE_TIME);
        boardsTypeRepository.save(boardType3);

        ToDoStatus status1= new ToDoStatus();
        status1.setStatus(ToDoStatus.Status.IN_PROGRESS);
        toDosStatusRepository.save(status1);

        ToDoStatus status2= new ToDoStatus();
        status2.setStatus(ToDoStatus.Status.DONE);
        toDosStatusRepository.save(status2);
    }
}