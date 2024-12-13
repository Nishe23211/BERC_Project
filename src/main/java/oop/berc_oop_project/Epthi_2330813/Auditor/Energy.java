package oop.berc_oop_project.Epthi_2330813.Auditor;

public class Energy {
    private final String companyName;
    private final double energyLoss;
    private final int complaintsCount;
    private final String revenue;

    public Energy(String companyName, double energyLoss, int complaintsCount, String revenue) {
        this.companyName = companyName;
        this.energyLoss = energyLoss;
        this.complaintsCount = complaintsCount;
        this.revenue = revenue;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getEnergyLoss() {
        return energyLoss;
    }

    public int getComplaintsCount() {
        return complaintsCount;
    }

    public String getRevenue() {
        return revenue;
    }


}
