//package com.example.todoappbackend.boards.model;
//
//import com.sun.istack.NotNull;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Setter
//@Getter
//@Entity
//@Table(name = "boards_types")
//public class BoardsType {
//    public enum Type {
//        HOME, WORK, FREE_TIME
//    }
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long Id;
//
//    @NotNull
//    @Enumerated(EnumType.STRING)
//    private Type type;
//}
//
