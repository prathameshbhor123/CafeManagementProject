package com.inn.cafe.dao;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.inn.cafe.POJO.User;

public interface UserDao extends JpaRepository<User,Integer>{
User findByEmailId11(@Param("email")Map<String, String> requestMap);

void save();

User findByEmailId(String string);




}
