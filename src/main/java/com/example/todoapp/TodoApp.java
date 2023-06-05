package com.example.todoapp;

import com.example.todoapp.model.Task;
import com.example.todoapp.service.TaskService;

public class TodoApp {

    public static void main(String[] args) {
        TaskService taskService = new TaskService();

        // Dodajemy zadania
        Task task1 = new Task(1, "Kupić mleko", false);
        Task task2 = new Task(2, "Umyć naczynia", false);

        taskService.addTask(task1);
        taskService.addTask(task2);

        // Wyświetlamy listę zadań
        System.out.println("Lista zadań:");
        for (Task task : taskService.getTasks()) {
            System.out.println(task.getId() + ". " + task.getTitle() + " (wykonane: " + task.isCompleted() + ")");
        }

        // Usuwamy jedno zadanie
        taskService.removeTask(1);

        // Wyświetlamy listę zadań po usunięciu
        System.out.println("\nLista zadań po usunięciu zadania:");
        for (Task task : taskService.getTasks()) {
            System.out.println(task.getId() + ". " + task.getTitle() + " (wykonane: " + task.isCompleted() + ")");
        }
    }
}