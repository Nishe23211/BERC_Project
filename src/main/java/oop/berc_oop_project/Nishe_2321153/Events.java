package oop.berc_oop_project.Nishe_2321153;

import java.time.LocalDate;

public class Events {
    private String eventTitle;
    private String eventTypebox;
    private LocalDate doe;

    public Events(String eventTitle, String eventTypebox, LocalDate doe) {
        this.eventTitle = eventTitle;
        this.eventTypebox = eventTypebox;
        this.doe = doe;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getEventTypebox() {
        return eventTypebox;
    }

    public void setEventTypebox(String eventTypebox) {
        this.eventTypebox = eventTypebox;
    }

    public LocalDate getDoe() {
        return doe;
    }

    public void setDoe(LocalDate doe) {
        this.doe = doe;
    }

    @Override
    public String toString() {
        return "Events{" +
                "eventTitle='" + eventTitle + '\'' +
                ", eventTypebox='" + eventTypebox + '\'' +
                ", doe=" + doe +
                '}';
    }
}
