package com.example.exercice2.bo;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private int bestScore;

    public static List<User> list = new ArrayList<User>();



    public User(String firstName, String lastName, String userName, String password, int BestScore){
        this.firstName  = firstName;
        this.lastName   = lastName;
        this.userName   = userName;
        this.password  = password;
        this.bestScore      = bestScore;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassworld() {
        return password;
    }

    public void setPassworld(String passworld) {
        this.password = passworld;
    }

    public int getScore() {
        return bestScore;
    }

    public void setBestScore(int score) {
        this.bestScore = score;
    }
}
