package oop.berc_oop_project.Nishe_2321153.SupportStaff;

public class SSDashboard extends SupportStaffDashboard {
    private String caseid;
    private String issuedescription;
    private String statusbox;

    public SSDashboard(String caseid, String issuedescription, String statusbox) {
        this.caseid = caseid;
        this.issuedescription = issuedescription;
        this.statusbox = statusbox;
    }

    public String getCaseid() {
        return caseid;
    }

    public void setCaseid(String caseid) {
        this.caseid = caseid;
    }

    public String getIssuedescription() {
        return issuedescription;
    }

    public void setIssuedescription(String issuedescription) {
        this.issuedescription = issuedescription;
    }

    public String getStatusbox() {
        return statusbox;
    }

    public void setStatusbox(String statusbox) {
        this.statusbox = statusbox;
    }

    @Override
    public String toString() {
        return "SSDashboard{" +
                "caseid='" + caseid + '\'' +
                ", issuedescription='" + issuedescription + '\'' +
                ", statusbox='" + statusbox + '\'' +
                '}';
    }
}
