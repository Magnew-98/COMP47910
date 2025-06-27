package org.example.assignment1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.assignment1.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends     JpaRepository<User, Long> { }
