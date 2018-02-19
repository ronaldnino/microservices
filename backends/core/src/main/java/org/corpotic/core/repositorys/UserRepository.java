package org.corpotic.core.repositorys;

import org.corpotic.core.models.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Niño Ronald
 */


public interface UserRepository extends CrudRepository<User, Long>{
    
}
