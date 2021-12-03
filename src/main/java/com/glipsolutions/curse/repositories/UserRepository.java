package com.glipsolutions.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glipsolutions.curse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
