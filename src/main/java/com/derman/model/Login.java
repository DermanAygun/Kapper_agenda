package com.derman.model;

import java.util.ArrayList;

public class Login {
    private static Login singleton;
    private static User user;

    private ArrayList<User> users = new ArrayList<>();

    private Login() {
        users.add(new User("123","123","derman","a","0123","da@da.nl"));
    }

    public static Login getInstance() {
        if (singleton == null) {
            return new Login();
        }

        return singleton;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
