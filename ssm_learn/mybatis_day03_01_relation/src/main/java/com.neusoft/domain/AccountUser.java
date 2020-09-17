package com.neusoft.domain;

public class AccountUser extends Account {
    private String username;
    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAdrress() {
        return address;
    }

    public void setAdrress(String adrress) {
        this.address = adrress;
    }

    @Override
    public String toString() {
        return  super.toString() + "AccountUser{" +
                "username='" + username + '\'' +
                ", adrress='" + address + '\'' +
                '}';
    }
}