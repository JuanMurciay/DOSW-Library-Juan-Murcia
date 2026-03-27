package edu.eci.dosw.tdd.service;

import org.apache.catalina.User;
import java.util.*;

public class UserService {

    private Map<String, User> users = new HashMap<>();

    public void addUser(User user) {
        users.put(user.getName(), user);
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    public User getUserById(String id) {
        return users.get(id);
    }
}