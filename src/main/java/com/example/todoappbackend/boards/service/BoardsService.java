//package com.example.todoappbackend.boards.service;
//
//import com.example.todoappbackend.boards.dto.BoardsDto;
//import com.example.todoappbackend.boards.model.Boards;
//import com.example.todoappbackend.boards.model.BoardsType;
//import com.example.todoappbackend.boards.repository.BoardsRepository;
//import com.example.todoappbackend.boards.repository.BoardsTypeRepository;
//import com.example.todoappbackend.todos.model.ToDo;
//import com.example.todoappbackend.todos.service.ToDoService;
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@AllArgsConstructor
//public class BoardsService {
//
//    private final BoardsTypeRepository boardsTypeRepository;
//    private final BoardsRepository boardsRepository;
//    private final ToDoService toDoService;
//
//    public BoardsType getBoardTypeById(Long Id){
//        return boardsTypeRepository.getOne(Id);
//    }
//
//    public void addNewBoard(BoardsDto boardsDto){
//        Boards board = new Boards();
//        board.setName(boardsDto.getName());
//        board.setType(getBoardTypeById(boardsDto.getBoardTypeId()));
//
//
//
////        boardsDto.getToDoDtoList().forEach(toDoDto -> {
////            ToDo toDo=new ToDo();
////            toDoService.save(toDo);
////            board.addToDo(toDo);
////        });
//        boardsRepository.save(board);
//    }
//
//    public List<Boards> getAllBoards(){
//        return boardsRepository.findAll();
//    }
//
//
//}
