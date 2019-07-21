package com.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}