package com.example.springbootbaeldung.dao;

import com.example.springbootbaeldung.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
