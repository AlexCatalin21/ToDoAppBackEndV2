//package com.example.todoappbackend.boards.api;
//
//import com.example.todoappbackend.boards.dto.BoardsDto;
//import com.example.todoappbackend.boards.model.Boards;
//import com.example.todoappbackend.boards.repository.BoardsRepository;
//import com.example.todoappbackend.boards.service.BoardsService;
//import lombok.AllArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@AllArgsConstructor
//@RequestMapping("/api/v1/boards")
//public class BoardsApi {
//
//    private final BoardsService boardsService;
//    private final BoardsRepository boardsRepository;
//
//    @PostMapping
//    public ResponseEntity<String> addNewBoard(@RequestBody BoardsDto boardsDto){
//        boardsService.addNewBoard(boardsDto);
//        return new ResponseEntity<>("", HttpStatus.OK);
//    }
//
//    @GetMapping("/type/{id}")
//    public List<Boards>getBoardsByType(@PathVariable("id") Long typeId){
//        return boardsRepository.findAllByTypeId(typeId);
//    }
//}
