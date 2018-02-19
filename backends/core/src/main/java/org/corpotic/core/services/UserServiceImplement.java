package org.corpotic.core.services;

import org.corpotic.core.models.User;
import org.corpotic.core.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ronald Niño
 */
@Service("userService")
public class UserServiceImplement implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public Iterable<User> all() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public boolean save(User user) {
        boolean result = false;
        User userUpdate = null;
        userUpdate = userRepository.save(user);
        if (userUpdate != null) {
            result = true;
        }
        return result;
    }

    @Override
    public void delete(Long id) {

        userRepository.delete(id);

    }

}
