package com.example.todoappbackend.boards.repository;

import com.example.todoappbackend.boards.model.BoardsType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardsTypeRepository extends JpaRepository<BoardsType, Long> {
}
