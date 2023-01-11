package com.example.juwapp.helperClases;

public class Storingdata {

    String userID, userName, batch, depart, email, userpass, userType;

    public Storingdata() {
    }

    public Storingdata(String userID, String userName, String batch, String depart, String email, String userpass, String userType) {

        this.userID = userID;
        this.userName = userName;
        this.email = email;
        this.userpass =userpass;
        this.batch = batch;
        this.depart = depart;

    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getUserpass() {

        return userpass;
    }

    public void setUserpass(String userpass) {

        this.userpass = userpass;
    }
}
