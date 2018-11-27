package com.example.batura.wishlist.model;

import java.io.Serializable;

public class Product implements Serializable {

    private int id;
    private String name;
    private String url;
    private String username;

    public Product(int id, String name, String url, String username) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.username = username;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
