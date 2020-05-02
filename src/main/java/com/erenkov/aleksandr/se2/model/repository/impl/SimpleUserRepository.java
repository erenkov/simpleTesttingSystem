package main.java.com.erenkov.aleksandr.se2.model.repository.impl;

import main.java.com.erenkov.aleksandr.se2.model.entity.User;
import main.java.com.erenkov.aleksandr.se2.model.repository.UserRepository;
import main.java.com.erenkov.aleksandr.se2.utils.Generator;

import java.util.Set;

public class SimpleUserRepository implements UserRepository {

    private final Set<User> users = Generator.generateUsers();

    @Override
    public User findUserByTelephoneNumber(String number) {
        return users.stream()
                .filter(u -> u.getTelephone().equals(number))
                .findFirst()
                .orElse(new User());
    }

    @Override
    public User findUserById(Long id) {
        return users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElse(new User());
    }

    @Override//todo
    public boolean saveAndFlushUser(User user) {
        return users.add(user);
    }

    @Override//todo
    public boolean deleteUser(User user) {
        return users.remove(user);
    }

    @Override
    public Set<User> getAllUsers() {
        return users;
    }

}
