package oop.berc_oop_project.Ikhtara_1910374;

import java.time.LocalDate;

public class Task {
    private String task;
    private String user;
    private LocalDate deadline;

    public Task(String task, String user, LocalDate deadline) {
        this.task = task;
        this.user = user;
        this.deadline = deadline;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Task{" +
                "task='" + task + '\'' +
                ", user='" + user + '\'' +
                ", deadline=" + deadline +
                '}';
    }
}
