package oop.berc_oop_project.Sayma_2320543;

public class SystemAdministratorU7 {
    private String useraccount;
    private String typeoftask;

    public SystemAdministratorU7(String useraccount, String typeoftask) {
        this.useraccount = useraccount;
        this.typeoftask = typeoftask;
    }

    public String getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(String useraccount) {
        this.useraccount = useraccount;
    }

    public String getTypeoftask() {
        return typeoftask;
    }

    public void setTypeoftask(String typeoftask) {
        this.typeoftask = typeoftask;
    }
}
