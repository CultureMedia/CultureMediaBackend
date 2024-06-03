package culturemedia.dao;

import culturemedia.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {

    User findByUsername(String username);

    User findByEmail(String email);
}