package com.abit8;

import java.util.Optional;

public class UserDao {
    public Optional<User> findById(Long id){
        User user = new User();
        user.setName("Ishenaly");
        return Optional.of(user);
    }
}
