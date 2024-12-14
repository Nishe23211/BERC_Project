package oop.berc_oop_project.Nishe_2321153;

public class Case {
    private String caseId;
    private String caseName;
    private String status;

    public Case(String caseId, String caseName, String status) {
        this.caseId = caseId;
        this.caseName = caseName;
        this.status = status;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Case{" +
                "caseId='" + caseId + '\'' +
                ", caseName='" + caseName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
