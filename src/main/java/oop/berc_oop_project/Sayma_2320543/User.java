package oop.berc_oop_project.Sayma_2320543;

public class User {
    private String usertype;
    private String username;
    private String password;

    public User(String usertype, String username, String password) {
        this.usertype = usertype;
        this.username = username;
        this.password = password;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
