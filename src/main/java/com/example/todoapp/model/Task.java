package com.example.todoapp.model;

/**
 * Klasa reprezentująca pojedyncze zadanie do wykonania.
 */
public class Task {
    private int id;
    private String title;
    private boolean completed;

    /**
     * Konstruktor klasy Task.
     *
     * @param id        identyfikator zadania
     * @param title     tytuł zadania
     * @param completed czy zadanie zostało wykonane
     */
    public Task(int id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    /**
     * Zwraca identyfikator zadania.
     *
     * @return identyfikator zadania
     */
    public int getId() {
        return id;
    }

    /**
     * Ustawia identyfikator zadania.
     *
     * @param id identyfikator zadania
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Zwraca tytuł zadania.
     *
     * @return tytuł zadania
     */
    public String getTitle() {
        return title;
    }

    /**
     * Ustawia tytuł zadania.
     *
     * @param title tytuł zadania
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sprawdza, czy zadanie zostało wykonane.
     *
     * @return true, jeśli zadanie zostało wykonane, w przeciwnym razie false
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * Ustawia stan wykonania zadania.
     *
     * @param completed true, jeśli zadanie zostało wykonane, w przeciwnym razie false
     */
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}