package oop.berc_oop_project.Ikhtara_1910374;

import java.time.LocalDate;

public class Incident {
    private String name;
    private LocalDate date;
    private String incident;

    public Incident(String name, LocalDate date, String incident) {
        this.name = name;
        this.date = date;
        this.incident = incident;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getIncident() {
        return incident;
    }

    public void setIncident(String incident) {
        this.incident = incident;
    }

    @Override
    public String toString() {
        return "Incident{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", incident='" + incident + '\'' +
                '}';
    }
}


