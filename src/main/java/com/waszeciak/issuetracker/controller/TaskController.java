package com.waszeciak.issuetracker.controller;

import com.waszeciak.issuetracker.entity.Task;
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
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @GetMapping("/test")
    public String test() {
        return "Task controller works";
    }
}
