package com.example.todoappbackend.boards.api;

import com.example.todoappbackend.boards.dto.BoardsDto;
import com.example.todoappbackend.boards.service.BoardsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/boards")
public class BoardsApi {

    public final BoardsService boardsService;

    @PostMapping
    public ResponseEntity<String> addNewBoard(@RequestBody BoardsDto boardsDto){
        boardsService.addNewBoard(boardsDto);
        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
