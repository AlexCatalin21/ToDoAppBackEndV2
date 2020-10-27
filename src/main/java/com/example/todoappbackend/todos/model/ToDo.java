package com.example.todoappbackend.todos.model;

import com.example.todoappbackend.boards.model.Boards;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "todos")
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @Lob
    private String description;
    @NotNull
    private Date creationDate;
    @NotNull
    private Date expiringDate;
    @NotNull
    private long estimatedDays;
    @NotNull
    private long allocatedTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "todos_status_id", referencedColumnName = "Id")
    @NotNull
    private ToDoStatus status;

    @ManyToOne
    @JoinColumn(name = "board_id" ,referencedColumnName = "Id")
    private Boards board;
}
