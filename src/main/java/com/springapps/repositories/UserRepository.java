package com.springapps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springapps.entities.User;



public interface UserRepository extends JpaRepository<User, String> {
  public User findUserByUsername(String username);
}
