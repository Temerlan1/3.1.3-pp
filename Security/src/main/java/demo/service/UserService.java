package demo.service;

import demo.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;


import java.util.List;

public interface UserService extends UserDetailsService {
    void saveUser(User user, Long [] id);

    void removeUserById(long id);

    List<User> findAll();

    User findById(long id);

    void update(User user,Long[]id);

    User findByUsername(String name);
}
