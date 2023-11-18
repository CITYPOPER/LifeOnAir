package com.jhj.lifeonair.domain.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhj.lifeonair.domain.user.entity.Provider;
import com.jhj.lifeonair.domain.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	Optional<User> findByUserId(Long userId);
	
	Optional<User> findByProviderAndOauthId(Provider provider, String oauthId);
}
