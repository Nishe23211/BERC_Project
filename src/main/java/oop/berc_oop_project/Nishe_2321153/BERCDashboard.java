package oop.berc_oop_project.Nishe_2321153;

import java.time.LocalDate;

public class BERCDashboard {
    private String name;
    private String id;
    private String status;
    private LocalDate date;

    public BERCDashboard(String name, String id, String status, LocalDate date) {
        this.name = name;
        this.id = id;
        this.status = status;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "BERCDashboard{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", status='" + status + '\'' +
                ", date=" + date +
                '}';
    }
}
