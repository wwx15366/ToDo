package com.example.todoapp.service;

import com.example.todoapp.model.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TaskServiceTest {
    private TaskService taskService;

    @BeforeEach
    void setUp() {
        taskService = new TaskService();
    }

    @Test
    void addTask() {
        Task task = new Task(1, "Test task", false);
        taskService.addTask(task);

        List<Task> tasks = taskService.getTasks();
        assertEquals(1, tasks.size());
        assertEquals(task, tasks.get(0));
    }

    @Test
    void removeTask() {
        Task task1 = new Task(1, "Test task 1", false);
        Task task2 = new Task(2, "Test task 2", false);
        taskService.addTask(task1);
        taskService.addTask(task2);

        taskService.removeTask(1);

        List<Task> tasks = taskService.getTasks();
        assertEquals(1, tasks.size());
        assertTrue(tasks.contains(task2));
    }
}