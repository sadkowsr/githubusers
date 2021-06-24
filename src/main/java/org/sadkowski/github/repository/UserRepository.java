package org.sadkowski.github.repository;



import org.sadkowski.github.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

    @Modifying
    @Query("UPDATE User u set u.requestCount = u.requestCount + 1 WHERE u.login = :login")
    void incrementCounterByLogin(String login);
}
