package com.example.emailapp;

public class EmailItem {
    private String userImg, userName, emailHeader, emailText, emailTimePassed;

    public EmailItem(String userImg, String userName, String emailHeader, String emailText, String emailTimePassed) {
        this.userImg = userImg;
        this.userName = userName;
        this.emailHeader = emailHeader;
        this.emailText = emailText;
        this.emailTimePassed = emailTimePassed;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailHeader() {
        return emailHeader;
    }

    public void setEmailHeader(String emailHeader) {
        this.emailHeader = emailHeader;
    }

    public String getEmailText() {
        return emailText;
    }

    public void setEmailText(String emailText) {
        this.emailText = emailText;
    }

    public String getEmailTimePassed() {
        return emailTimePassed;
    }

    public void setEmailTimePassed(String emailTimePassed) {
        this.emailTimePassed = emailTimePassed;
    }
}
