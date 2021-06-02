package model;

import java.util.ArrayList;

public class Login {
    private static Login singleton;
    private User user;

    private ArrayList<User> users = new ArrayList<>();

    private Login() {
//        user = new User("derman","a","0123","da@da.nl");
        user = null;
    }

    public static Login getInstance() {
        if (singleton == null) {
            return new Login();
        }

        return singleton;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
        users.add(user);
    }
}
