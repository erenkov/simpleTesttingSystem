package main.java.com.erenkov.aleksandr.se2.model.service.impl;

import main.java.com.erenkov.aleksandr.se2.model.entity.User;
import main.java.com.erenkov.aleksandr.se2.model.repository.UserRepository;
import main.java.com.erenkov.aleksandr.se2.model.repository.impl.SimpleUserRepository;
import main.java.com.erenkov.aleksandr.se2.model.service.UserService;

import java.util.Set;

public class SimpleUserService implements UserService {

    private final UserRepository userRepo = new SimpleUserRepository();


    @Override
    public User findUserByTelephoneNumber(String number) {
        return userRepo.findUserByTelephoneNumber(number);
    }

    @Override
    public User findUserById(Long id) {
        return userRepo.findUserById(id);
    }

    @Override
    public boolean saveAndFlushUser(User user) {
        return userRepo.saveAndFlushUser(user);
    }

    @Override
    public boolean deleteUser(User user) {
        return userRepo.deleteUser(user);
    }

    @Override
    public Set<User> getAllUsers() {
        return userRepo.getAllUsers();
    }

    public String getStringRoles(User user) {
        return user
                .getRoles()
                .stream()
                .map(r -> "\"" + r.ordinal() + "\" - " + r.name() + ", ")
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }

}
