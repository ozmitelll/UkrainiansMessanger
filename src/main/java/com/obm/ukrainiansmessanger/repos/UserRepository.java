package com.obm.ukrainiansmessanger.repos;

import com.obm.ukrainiansmessanger.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
    User findById(long id);
}
