package com.example.batura.wishlist.model;

import java.io.Serializable;
import java.util.List;

public class Family implements Serializable {

    private String name;
    private List<User> members;

    public Family() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", members=" + members.toString() +
                '}';
    }
}
