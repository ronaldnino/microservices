package org.corpotic.core.services;

import org.corpotic.core.models.User;
import org.springframework.stereotype.Service;

/**
 *
 * @author Niño Ronald
 */

public interface UserService {
    
    public Iterable<User> all();
    
    public User findById(Long id);
    
    public boolean save(User user);
    
    public void delete(Long id);
}
