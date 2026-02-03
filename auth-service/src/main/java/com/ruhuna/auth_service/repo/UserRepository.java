package com.ruhuna.auth_service.repo;

import com.ruhuna.auth_service.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByEmail(String email); //login
    boolean existsByEmail(String email);  //sign up

}
