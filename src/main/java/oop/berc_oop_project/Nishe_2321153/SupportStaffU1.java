package oop.berc_oop_project.Nishe_2321153;

import java.util.Calendar;

public class SupportStaffU1 {
    private int LogId;
    private String IncidentType;

    public int getLogId() {
        return LogId;
    }

    public void setLogId(int logId) {
        LogId = logId;
    }

    public String getIncidentType() {
        return IncidentType;
    }

    public void setIncidentType(String incidentType) {
        IncidentType = incidentType;
    }

    public SupportStaffU1(int logId, String incidentType) {
        LogId = logId;
        IncidentType = incidentType;
    }

    @Override
    public String toString() {
        return "SupportStaffU1{" +
                "LogId=" + LogId +
                ", IncidentType='" + IncidentType + '\'' +
                '}';
    }
}