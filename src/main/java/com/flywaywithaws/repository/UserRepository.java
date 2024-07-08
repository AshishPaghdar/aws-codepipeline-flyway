package com.flywaywithaws.repository;

import com.flywaywithaws.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
