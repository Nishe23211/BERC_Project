package oop.berc_oop_project.Nishe_2321153;

public class SSDashboard extends SupportStaffDashboard {
    private int caseid;
    private String issuedescription;
    private String statusbox;

    @Override
    public String toString() {
        return "SSDashboard{" +
                "caseid=" + caseid +
                ", issuedescription='" + issuedescription + '\'' +
                ", statusbox='" + statusbox + '\'' +
                '}';
    }

    public int getCaseid() {
        return caseid;
    }

    public void setCaseid(int caseid) {
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

    public SSDashboard(int caseid, String issuedescription, String statusbox) {
        this.caseid = caseid;
        this.issuedescription = issuedescription;
        this.statusbox = statusbox;
    }
}
