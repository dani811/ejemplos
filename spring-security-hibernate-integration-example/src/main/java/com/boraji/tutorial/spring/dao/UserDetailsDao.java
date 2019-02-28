package com.boraji.tutorial.spring.dao;

import org.springframework.stereotype.Service;

import com.boraji.tutorial.spring.model.User;

@Service("userDetailsDao")
public interface UserDetailsDao {
  User findUserByUsername(String username);
}
