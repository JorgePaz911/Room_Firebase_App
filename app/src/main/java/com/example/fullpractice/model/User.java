package com.example.fullpractice.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "contact_table")
public class User {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private int userId;

    @ColumnInfo
    private String name;

    @ColumnInfo
    private String email;

    @ColumnInfo
    private int age;

    public User() {
    }

    public User(@NonNull String name, @NonNull String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
