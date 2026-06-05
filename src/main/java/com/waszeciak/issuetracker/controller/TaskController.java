package com.waszeciak.issuetracker.controller;

import com.waszeciak.issuetracker.dto.TaskRequest;
import com.waszeciak.issuetracker.entity.Task;
import com.waszeciak.issuetracker.enums.Priority;
import com.waszeciak.issuetracker.enums.TaskStatus;
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
    public List<Task> getTasks(
            @RequestParam(required = false) TaskStatus status,
            @RequestParam(required = false)Priority priority) {
        return taskService.getFilteredTasks(status, priority);
    }

    @PostMapping
    public Task createTask(@Valid @RequestBody TaskRequest request) {
        return taskService.createTask(request);
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @Valid @RequestBody TaskRequest request) {
        return taskService.updateTask(id, request);
    }
}
