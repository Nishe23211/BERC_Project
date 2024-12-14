package oop.berc_oop_project.Nishe_2321153;

public class ComplianceReports {
    private String reportid;
    private String reporttype;
    private String reportdata;

    public ComplianceReports(String reportid, String reporttype, String reportdata) {
        this.reportid = reportid;
        this.reporttype = reporttype;
        this.reportdata = reportdata;
    }

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid;
    }

    public String getReporttype() {
        return reporttype;
    }

    public void setReporttype(String reporttype) {
        this.reporttype = reporttype;
    }

    public String getReportdata() {
        return reportdata;
    }

    public void setReportdata(String reportdata) {
        this.reportdata = reportdata;
    }

    @Override
    public String toString() {
        return "ComplianceReports{" +
                "reportid='" + reportid + '\'' +
                ", reporttype='" + reporttype + '\'' +
                ", reportdata='" + reportdata + '\'' +
                '}';
    }
}
