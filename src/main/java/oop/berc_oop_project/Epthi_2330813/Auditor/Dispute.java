package oop.berc_oop_project.Epthi_2330813.Auditor;

public class Dispute {
    private String disputeId;
    private String companyName;
    private String consumerName;
    private String status;
    private String date;

    public Dispute(String disputeId, String companyName, String consumerName, String status, String date) {
        this.disputeId = disputeId;
        this.companyName = companyName;
        this.consumerName = consumerName;
        this.status = status;
        this.date = date;
    }

    public String getDisputeId() {
        return disputeId;
    }

    public void setDisputeId(String disputeId) {
        this.disputeId = disputeId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
