package com.example.demo_user.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "user_name", schema = "quanlywebthoitrang", catalog = "")
public class UserNameEntity {
    private long id;
    private String usename;
    private String password;
    private String email;

    public static List<UserNameEntity> getAll() {
        return null;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "usename")
    public String getUsename(String username) {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    @Basic
    @Column(name = "password")
    public String getPassword(String password) {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "email")
    public String getEmail(String email) {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
