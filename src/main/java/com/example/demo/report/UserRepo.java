package com.example.demo.report;

import com.example.demo.domin.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {

    User findByUserName(String userName);
}
