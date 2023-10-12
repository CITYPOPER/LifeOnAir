package com.jhj.lifeonair.domain.user.exception.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhj.lifeonair.domain.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
