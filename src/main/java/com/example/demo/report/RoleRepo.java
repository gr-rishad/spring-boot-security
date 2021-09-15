package com.example.demo.report;

import com.example.demo.domin.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Long> {

    Role findByName(String userName);
}
