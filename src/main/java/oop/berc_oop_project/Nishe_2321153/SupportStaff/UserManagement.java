package oop.berc_oop_project.Nishe_2321153.SupportStaff;

public class UserManagement {
    private String username;
    private String userrole;

    public UserManagement(String username, String userrole) {
        this.username = username;
        this.userrole = userrole;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserrole() {
        return userrole;
    }

    public void setUserrole(String userrole) {
        this.userrole = userrole;
    }

    @Override
    public String toString() {
        return "UserManagement{" +
                "username='" + username + '\'' +
                ", userrole='" + userrole + '\'' +
                '}';
    }
}