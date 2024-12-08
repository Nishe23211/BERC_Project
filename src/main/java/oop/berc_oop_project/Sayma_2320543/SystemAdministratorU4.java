package oop.berc_oop_project.Sayma_2320543;

public class SystemAdministratorU4 {
    private String typeofdata;
    private String typeofbackup;
    private String storebackup;

    public SystemAdministratorU4(String typeofdata, String typeofbackup, String storebackup) {
        this.typeofdata = typeofdata;
        this.typeofbackup = typeofbackup;
        this.storebackup = storebackup;
    }

    public String getTypeofdata() {
        return typeofdata;
    }

    public void setTypeofdata(String typeofdata) {
        this.typeofdata = typeofdata;
    }

    public String getTypeofbackup() {
        return typeofbackup;
    }

    public void setTypeofbackup(String typeofbackup) {
        this.typeofbackup = typeofbackup;
    }

    public String getStorebackup() {
        return storebackup;
    }

    public void setStorebackup(String storebackup) {
        this.storebackup = storebackup;
    }
}
