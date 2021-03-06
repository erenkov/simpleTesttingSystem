package main.java.com.erenkov.aleksandr.se2.model.service;

import main.java.com.erenkov.aleksandr.se2.model.entity.User;

import java.util.Set;

public interface UserService {

    User findUserByTelephoneNumber(String number);

    User findUserById(Long id);

    boolean saveAndFlushUser(User user);

    boolean deleteUser(User user);

    Set<User> getAllUsers();

    String getStringRoles(User user);
    }
