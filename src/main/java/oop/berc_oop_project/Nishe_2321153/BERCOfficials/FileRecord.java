package oop.berc_oop_project.Nishe_2321153.BERCOfficials;

import java.time.LocalDate;

public class FileRecord {
    private String fileid;
    private String filename;
    private LocalDate date;

    public FileRecord(String fileid, String filename, LocalDate date) {
        this.fileid = fileid;
        this.filename = filename;
        this.date = date;
    }

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "FileRecord{" +
                "fileid='" + fileid + '\'' +
                ", filename='" + filename + '\'' +
                ", date=" + date +
                '}';
    }
}
