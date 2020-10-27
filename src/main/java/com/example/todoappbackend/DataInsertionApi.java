package com.example.todoappbackend;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/insert-data")
public class DataInsertionApi {

    private final DataInsertion dataInsertion;

    @GetMapping()
    public void addData(){
        dataInsertion.addTypesAndStatuses();
    }
}