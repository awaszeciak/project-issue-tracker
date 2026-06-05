package com.waszeciak.issuetracker.repository;

import com.waszeciak.issuetracker.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
