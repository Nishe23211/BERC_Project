package oop.berc_oop_project.Sayma_2320543;

public class UserP7 {
    private String policyreformationfilename;
    private String policyid;
    private String application;

    public UserP7(String policyreformationfilename, String policyid, String application) {
        this.policyreformationfilename = policyreformationfilename;
        this.policyid = policyid;
        this.application = application;
    }

    public String getPolicyreformationfilename() {
        return policyreformationfilename;
    }

    public void setPolicyreformationfilename(String policyreformationfilename) {
        this.policyreformationfilename = policyreformationfilename;
    }

    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }
}
