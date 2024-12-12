package oop.berc_oop_project.Sayma_2320543;

public class Device {
    private String deviceName;
    private String userName;
    private String password;

    public Device(String deviceName, String userName, String password) {
        this.deviceName = deviceName;
        this.userName = userName;
        this.password = password;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

