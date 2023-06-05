package com.example.todoapp.service;

import com.example.todoapp.model.Task;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasa zarządzająca zadaniami do wykonania.
 */
public class TaskService {
    private static final Logger logger = Logger.getLogger(TaskService.class);

    private List<Task> tasks = new ArrayList<>();

    /**
     * Dodaje zadanie do listy zadań.
     *
     * @param task zadanie do dodania
     */
    public void addTask(Task task) {
        tasks.add(task);
        logger.info("Dodano zadanie: " + task.getTitle());
    }

    /**
     * Usuwa zadanie o podanym identyfikatorze.
     *
     * @param id identyfikator zadania do usunięcia
     */
    public void removeTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
        logger.info("Usunięto zadanie o ID: " + id);
    }

    /**
     * Zwraca listę zadań do wykonania.
     *
     * @return lista zadań
     */
    public List<Task> getTasks() {
        return tasks;
    }
}
