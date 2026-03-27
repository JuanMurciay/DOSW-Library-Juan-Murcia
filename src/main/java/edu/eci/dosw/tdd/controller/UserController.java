package edu.eci.dosw.tdd.controller;
import edu.eci.dosw.tdd.model.user;
import edu.eci.dosw.tdd.service.UserService;
import org.apache.catalina.User;

import java.util.List;

public class UserController {

    private final UserService userService;

    public UserController() {
        this.userService = new UserService();
    }

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void addUser(User user) {
        userService.addUser(user);
    }

    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    public User getUserById(String id) {
        return userService.getUserById(id);
    }

    public UserService getUserService() {
        return userService;
    }
}