package oop.berc_oop_project.Epthi_2330813.Auditor;

public class Compliance {
    private String companyName;
    private String complianceStatus;
    private String reportDate;
    private String rulesFollowed;

    public Compliance(String companyName, String complianceStatus, String reportDate, String rulesFollowed) {
        this.companyName = companyName;
        this.complianceStatus = complianceStatus;
        this.reportDate = reportDate;
        this.rulesFollowed = rulesFollowed;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getComplianceStatus() {
        return complianceStatus;
    }

    public String getReportDate() {
        return reportDate;
    }

    public String getRulesFollowed() {
        return rulesFollowed;
    }
}
