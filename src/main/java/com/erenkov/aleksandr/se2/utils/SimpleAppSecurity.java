package main.java.com.erenkov.aleksandr.se2.utils;

import main.java.com.erenkov.aleksandr.se2.model.entity.Role;
import main.java.com.erenkov.aleksandr.se2.model.entity.User;

public class SimpleAppSecurity {
    //todo add Security

    public  static boolean secure(User user, Role role){
        return user.getRoles().contains(role);
    }


}
