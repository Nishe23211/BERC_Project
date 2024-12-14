package oop.berc_oop_project.Epthi_2330813.Auditor;

public class Alertitem {
    private String companyName;
    private String issueType;

    public Alertitem(String companyName, String issueType) {
        this.companyName = companyName;
        this.issueType = issueType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }
}
