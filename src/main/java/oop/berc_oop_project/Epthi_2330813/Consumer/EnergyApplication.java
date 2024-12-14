package oop.berc_oop_project.Epthi_2330813.Consumer;

public class EnergyApplication {
    private int applicationID;
    private String incomeDetails;
    private String householdSize;
    private String energyUsageHistory;

    public EnergyApplication(int applicationID, String incomeDetails, String householdSize, String energyUsageHistory) {
        this.applicationID = applicationID;
        this.incomeDetails = incomeDetails;
        this.householdSize = householdSize;
        this.energyUsageHistory = energyUsageHistory;
    }

    public int getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(int applicationID) {
        this.applicationID = applicationID;
    }

    public String getIncomeDetails() {
        return incomeDetails;
    }

    public void setIncomeDetails(String incomeDetails) {
        this.incomeDetails = incomeDetails;
    }

    public String getHouseholdSize() {
        return householdSize;
    }

    public void setHouseholdSize(String householdSize) {
        this.householdSize = householdSize;
    }

    public String getEnergyUsageHistory() {
        return energyUsageHistory;
    }

    public void setEnergyUsageHistory(String energyUsageHistory) {
        this.energyUsageHistory = energyUsageHistory;
    }
}
