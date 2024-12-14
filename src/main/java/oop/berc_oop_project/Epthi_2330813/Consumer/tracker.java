package oop.berc_oop_project.Epthi_2330813.Consumer;

public class tracker {
    private String month;
    private String energyUsed;
    private String cost;

    public tracker(String month, String energyUsed, String cost) {
        this.month = month;
        this.energyUsed = energyUsed;
        this.cost = cost;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getEnergyUsed() {
        return energyUsed;
    }

    public void setEnergyUsed(String energyUsed) {
        this.energyUsed = energyUsed;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
