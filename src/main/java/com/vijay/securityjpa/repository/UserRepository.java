package com.vijay.securityjpa.repository;

import com.vijay.securityjpa.entity.User;
import com.vijay.securityjpa.model.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email,String password);

    List<User> findByNameContaining(String keywords);

    Optional<User> findByName(String username);
}
