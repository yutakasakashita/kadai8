package com.sakashita.nameapp;

public class Name {
    private Integer id;

    private String name;

    public Name(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }
}
