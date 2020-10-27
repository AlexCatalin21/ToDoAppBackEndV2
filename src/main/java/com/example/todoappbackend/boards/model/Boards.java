package com.example.todoappbackend.boards.model;

import com.example.todoappbackend.boards.model.BoardsType;
import com.example.todoappbackend.todos.model.ToDo;
import com.example.todoappbackend.todos.model.ToDoStatus;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "boards")

public class Boards {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @NotNull
    private String name;

    @OneToMany
    private List<ToDo> toDos= new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "boards_type_id", referencedColumnName = "Id")
    @NotNull
    private BoardsType type;

    public void addToDo(ToDo toDo){
        toDos.add(toDo);
    }


}