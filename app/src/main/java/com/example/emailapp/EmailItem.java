package com.example.emailapp;

public class EmailItem {
    private String userImg; // User avatar
    private String userName; // User name
    private String emailSubject; // Email subject
    private String emailCompose; // Compose email
    private String emailDate; // Email date

    public EmailItem(String userImg, String userName, String emailSubject, String emailCompose, String emailDate) {
        this.userImg = userImg;
        this.userName = userName;
        this.emailSubject = emailSubject;
        this.emailCompose = emailCompose;
        this.emailDate = emailDate;
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

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public String getEmailCompose() {
        return emailCompose;
    }

    public void setEmailCompose(String emailCompose) {
        this.emailCompose = emailCompose;
    }

    public String getEmailDate() {
        return emailDate;
    }

    public void setEmailDate(String emailDate) {
        this.emailDate = emailDate;
    }
}
