package ru.sakhapov.spring_jwt_auth.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sakhapov.spring_jwt_auth.store.entities.Token;

import java.util.List;

public interface TokenRepository extends JpaRepository<Token, Integer> {

    List<Token> findTokensByUserIdAndExpiredIsFalseOrRevokedIsFalse(Long userId);

    List<Token> findAllValidTokenByUser(Long id);

}
