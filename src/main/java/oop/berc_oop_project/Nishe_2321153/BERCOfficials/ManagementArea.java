package oop.berc_oop_project.Nishe_2321153.BERCOfficials;

public class ManagementArea {
    private String title;
    private String description;
    private String guidlines;

    public ManagementArea(String title, String description, String guidlines) {
        this.title = title;
        this.description = description;
        this.guidlines = guidlines;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGuidlines() {
        return guidlines;
    }

    public void setGuidlines(String guidlines) {
        this.guidlines = guidlines;
    }

    @Override
    public String toString() {
        return "ManagementArea{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", guidlines='" + guidlines + '\'' +
                '}';
    }
}
