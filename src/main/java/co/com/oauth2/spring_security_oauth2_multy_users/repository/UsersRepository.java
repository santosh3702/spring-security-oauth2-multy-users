package co.com.oauth2.spring_security_oauth2_multy_users.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.oauth2.spring_security_oauth2_multy_users.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByName(String username);
}
