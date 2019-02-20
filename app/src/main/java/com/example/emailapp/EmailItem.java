package com.example.emailapp;

import android.os.Parcel;
import android.os.Parcelable;

public class EmailItem implements Parcelable {

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

    protected EmailItem(Parcel in) {
        userImg = in.readString();
        userName = in.readString();
        emailSubject = in.readString();
        emailCompose = in.readString();
        emailDate = in.readString();
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(userImg);
        dest.writeString(userName);
        dest.writeString(emailSubject);
        dest.writeString(emailCompose);
        dest.writeString(emailDate);
    }

    public static final Creator<EmailItem> CREATOR = new Creator<EmailItem>() {
        @Override
        public EmailItem createFromParcel(Parcel in) {
            return new EmailItem(in);
        }

        @Override
        public EmailItem[] newArray(int size) {
            return new EmailItem[size];
        }
    };
}
