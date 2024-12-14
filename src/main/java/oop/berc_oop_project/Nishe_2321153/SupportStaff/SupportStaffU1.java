package oop.berc_oop_project.Nishe_2321153.SupportStaff;

public class SupportStaffU1 {
    private String LogId;
    private String IncidentType;

    public SupportStaffU1(String logId, String incidentType) {
        LogId = logId;
        IncidentType = incidentType;
    }

    public String getLogId() {
        return LogId;
    }

    public void setLogId(String logId) {
        LogId = logId;
    }

    public String getIncidentType() {
        return IncidentType;
    }

    public void setIncidentType(String incidentType) {
        IncidentType = incidentType;
    }

    @Override
    public String toString() {
        return "SupportStaffU1{" +
                "LogId='" + LogId + '\'' +
                ", IncidentType='" + IncidentType + '\'' +
                '}';
    }
}