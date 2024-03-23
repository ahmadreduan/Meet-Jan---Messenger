package com.quantumquestlabs.meetjan.Models;

public class Users {

    String profilepoc , userName , mail , password , userID , lastMessage;
    public Users(String profilepoc, String userName, String mail, String password, String userID, String lastMessage) {
        this.profilepoc = profilepoc;
        this.userName = userName;
        this.mail = mail;
        this.password = password;
        this.userID = userID;
        this.lastMessage = lastMessage;
    }

    public  Users(){}
    //SignUp Constructor

    public Users( String userName, String mail, String password) {
        this.userName = userName;
        this.mail = mail;
        this.password = password;

    }


    public String getProfilepoc() {
        return profilepoc;
    }

    public void setProfilepoc(String profilepoc) {
        this.profilepoc = profilepoc;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }
}
