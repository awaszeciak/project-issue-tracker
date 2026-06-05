package com.waszeciak.issuetracker.repository;

import com.waszeciak.issuetracker.entity.Task;
import com.waszeciak.issuetracker.enums.Priority;
import com.waszeciak.issuetracker.enums.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(TaskStatus status);

    List<Task> findByPriority(Priority priority);
}
