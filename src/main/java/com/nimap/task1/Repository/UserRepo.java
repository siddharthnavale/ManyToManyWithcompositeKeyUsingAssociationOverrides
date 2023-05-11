package com.nimap.task1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nimap.task1.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
