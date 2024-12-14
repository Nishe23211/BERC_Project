package oop.berc_oop_project.Nishe_2321153;

public class Applications {
    private int applicantid;
    private String applicantname;
    private String status;

    public Applications(int applicantid, String applicantname, String status) {
        this.applicantid = applicantid;
        this.applicantname = applicantname;
        this.status = status;
    }

    public int getApplicantid() {
        return applicantid;
    }

    public void setApplicantid(int applicantid) {
        this.applicantid = applicantid;
    }

    public String getApplicantname() {
        return applicantname;
    }

    public void setApplicantname(String applicantname) {
        this.applicantname = applicantname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Applications{" +
                "applicantid=" + applicantid +
                ", applicantname='" + applicantname + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
