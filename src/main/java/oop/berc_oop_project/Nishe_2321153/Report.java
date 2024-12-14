package oop.berc_oop_project.Nishe_2321153;

import java.time.LocalDate;

public class Report {
    private String reportname;
    private String reporttype;
    private String date;

    public Report(String reportname, String reporttype, String date) {
        this.reportname = reportname;
        this.reporttype = reporttype;
        this.date = date;
    }

    public String getReportname() {
        return reportname;
    }

    public void setReportname(String reportname) {
        this.reportname = reportname;
    }

    public String getReporttype() {
        return reporttype;
    }

    public void setReporttype(String reporttype) {
        this.reporttype = reporttype;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Report{" +
                "reportname='" + reportname + '\'' +
                ", reporttype='" + reporttype + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
