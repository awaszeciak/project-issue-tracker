package com.waszeciak.issuetracker.service;

import com.waszeciak.issuetracker.entity.Task;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.waszeciak.issuetracker.repository.TaskRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

}
