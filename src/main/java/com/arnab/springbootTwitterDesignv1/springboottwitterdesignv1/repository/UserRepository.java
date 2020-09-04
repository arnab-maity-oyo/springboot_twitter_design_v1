package com.arnab.springbootTwitterDesignv1.springboottwitterdesignv1.repository;

import com.arnab.springbootTwitterDesignv1.springboottwitterdesignv1.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
