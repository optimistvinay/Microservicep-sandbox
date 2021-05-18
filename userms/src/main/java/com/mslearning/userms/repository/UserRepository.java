package com.mslearning.userms.repository;


import com.mslearning.userms.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
