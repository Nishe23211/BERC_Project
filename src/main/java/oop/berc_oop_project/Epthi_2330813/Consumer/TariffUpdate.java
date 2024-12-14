package oop.berc_oop_project.Epthi_2330813.Consumer;

public class TariffUpdate {
    private String tariffType;
    private String currentRate;
    private String prevRate;
    private String date;

    public TariffUpdate(String tariffType, String currentRate, String prevRate, String date) {
        this.tariffType = tariffType;
        this.currentRate = currentRate;
        this.prevRate = prevRate;
        this.date = date;
    }

    public String getTariffType() {
        return tariffType;
    }

    public String getCurrentRate() {
        return currentRate;
    }

    public String getPrevRate() {
        return prevRate;
    }

    public String getDate() {
        return date;
    }
}
