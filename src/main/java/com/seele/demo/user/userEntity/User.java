package com.seele.demo.user.userEntity;

public class User {
//com.seele.demo.user 实体类

    private int id;

    private String username;

    private String pwd;

    public int getId() {
        return id;
    }

    public User() {
    }

    public User(int id, String username, String pwd) {
        this.id = id;
        this.username = username;
        this.pwd = pwd;
    }

    public User(String username, String pwd) {
        this.username = username;
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "com.seele.demo.user{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
