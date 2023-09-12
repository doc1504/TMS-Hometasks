package com.tms.hometask18.domain;

public class Student {
    private Integer id;
    private String login;
    private Boolean isMan;
    private String city_name;

    public Student(Integer id, String login, Boolean isMan, String city_name) {
        this.id = id;
        this.login = login;
        this.isMan = isMan;
        this.city_name = city_name;
    }

    public Student(String login, Boolean isMan, String city_name) {
        this.login = login;
        this.isMan = isMan;
        this.city_name = city_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Boolean getMan() {
        return isMan;
    }

    public void setMan(Boolean man) {
        isMan = man;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", isMan=" + isMan +
                ", city_name='" + city_name + '\'' +
                '}';
    }
}