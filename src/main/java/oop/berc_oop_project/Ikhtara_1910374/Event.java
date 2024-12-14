package oop.berc_oop_project.Ikhtara_1910374;

import java.time.LocalDate;

public class Event {
    private String topic;
    private String venue;
    private LocalDate date;

    public Event(String topic, String venue, LocalDate date) {
        this.topic = topic;
        this.venue = venue;
        this.date = date;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Event{" +
                "topic='" + topic + '\'' +
                ", venue='" + venue + '\'' +
                ", date=" + date +
                '}';
    }
}
