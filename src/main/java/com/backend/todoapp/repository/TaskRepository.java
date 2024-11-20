package com.backend.todoapp.repository;

import com.backend.todoapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByCategory(String category);
    List<Task> findByDueDateBetween(LocalDateTime start, LocalDateTime end);
}
