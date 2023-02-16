package com.example.mybatisapi.repository;

import java.util.List;
import java.util.Optional;
import com.example.mybatisapi.model.User;

public interface UserRepository  {

    List<User> findAll();

    Optional<User> findById(Integer id);

    int deleteById(Integer id);

    int insert(User user);

    int update(User user);
}
