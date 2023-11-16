package ru.sakhapov.spring_jwt_auth.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.sakhapov.spring_jwt_auth.store.entities.Token;

import java.util.List;

public interface TokenRepository extends JpaRepository<Token, Integer> {

    @Query(value = """
      select t from Token t inner join User u\s
      on t.user.id = u.id\s
      where u.id = :id and (t.expired = false or t.revoked = false)\s
      """)

    List<Token> findAllValidTokenByUser(Long id);

    Token findByToken(String token);

}
