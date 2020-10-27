package com.example.todoappbackend.boards.service;

import com.example.todoappbackend.boards.dto.BoardsDto;
import com.example.todoappbackend.boards.model.Boards;
import com.example.todoappbackend.boards.model.BoardsType;
import com.example.todoappbackend.boards.repository.BoardsRepository;
import com.example.todoappbackend.boards.repository.BoardsTypeRepository;
import com.example.todoappbackend.todos.model.ToDo;
import com.example.todoappbackend.todos.service.ToDoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BoardsService {

    private final BoardsTypeRepository boardsTypeRepository;
    private final ToDoService toDoService;
    private final BoardsRepository boardsRepository;

    public BoardsType getBoardTypeById(Long Id){
        return boardsTypeRepository.getOne(Id);
    }

    public void addNewBoard(BoardsDto boardsDto){
        Boards board = new Boards();
        board.setName(boardsDto.getName());
        board.setType(getBoardTypeById(boardsDto.getBoardTypeId()));

        boardsRepository.save(board);

//        boardsDto.getToDoDtoList().forEach(toDoDto -> {
//            ToDo toDo=toDoService.createToDoFromDto(new ToDo(),toDoDto);
//            toDoService.save(toDo);
//            board.addToDo(toDo);
//        });
//
//        Boards savedBoard = boardsRepository.save(board);
//        boardsRepository.flush();
//
//        savedBoard.getToDos().forEach(toDo -> {
//            toDo.setBoard(savedBoard);
//        });

//        Boards newSavedBoard=boardsRepository.save(savedBoard);
//        boardsRepository.flush();
    }


}
