package main.java.com.erenkov.aleksandr.se2.model.service.impl;

import main.java.com.erenkov.aleksandr.se2.model.entity.User;
import main.java.com.erenkov.aleksandr.se2.model.repository.UserRepository;
import main.java.com.erenkov.aleksandr.se2.model.repository.impl.SimpleUserRepository;
import main.java.com.erenkov.aleksandr.se2.model.service.UserService;

public class SimpleUserService implements UserService {

    private UserRepository userRepo = new SimpleUserRepository();


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
}
