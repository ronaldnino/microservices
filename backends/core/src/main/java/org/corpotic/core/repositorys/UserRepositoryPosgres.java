
package org.corpotic.core.repositorys;

import org.corpotic.core.models.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ronald
 */
public interface UserRepositoryPosgres extends CrudRepository<User, Long> {
    
}
