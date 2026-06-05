package com.waszeciak.issuetracker.service;

import com.waszeciak.issuetracker.dto.TaskRequest;
import com.waszeciak.issuetracker.entity.Task;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.waszeciak.issuetracker.repository.TaskRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task createTask(TaskRequest request) {
        Task task = Task.builder()
                .title(request.getTitle())
                .description(request.getDescription())
                .status(request.getStatus())
                .priority(request.getPriority())
                .createdAt(LocalDateTime.now())
                .build();

        return taskRepository.save(task);
    }

}
