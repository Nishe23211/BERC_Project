package oop.berc_oop_project.Epthi_2330813.Consumer;

public class Bill {
       private String billid;
       private double amount;
       private String duedate;
       private String status;
       public Bill(String billid, double amount, String duedate, String status) {
           this.billid = billid;
           this.amount = amount;
           this.duedate = duedate;
           this.status = status;

       }

    public String getBillid() {
        return billid;
    }

    public void setBillid(String billid) {
        this.billid = billid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
