package com.example.todoappbackend.boards.repository;

import com.example.todoappbackend.boards.model.Boards;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardsRepository extends JpaRepository<Boards, Long> {
}
