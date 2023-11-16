package ru.sakhapov.spring_jwt_auth.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sakhapov.spring_jwt_auth.store.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>  {

    Optional<User> findByUsername(String username);

    boolean existsByUsername(String username);

}
