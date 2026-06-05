package com.waszeciak.issuetracker.controller;

import com.waszeciak.issuetracker.dto.TaskRequest;
import com.waszeciak.issuetracker.entity.Task;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.waszeciak.issuetracker.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @GetMapping
    public List<Task> getAllTask() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public Task createTask(@Valid @RequestBody TaskRequest request) {
        return taskService.createTask(request);
    }

    @GetMapping("/test")
    public String test() {
        return "Task controller works";
    }
}
