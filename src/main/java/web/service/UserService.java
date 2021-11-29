package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void createUser(User user);

    User readUser(int id);

    void updateUser(User user);

    void deleteUser(int id);

    List<User> getUsers();

    User getUserByName(String name);
}