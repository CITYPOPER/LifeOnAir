package com.jhj.lifeonair.domain.user.exception.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jhj.lifeonair.domain.user.dto.UserRegisterRequestDto;
import com.jhj.lifeonair.domain.user.entity.User;
import com.jhj.lifeonair.domain.user.exception.exception.UserNotFoundException;
import com.jhj.lifeonair.domain.user.exception.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Service
@Slf4j
public class UserService {
	private final UserRepository userRepository;
	
	@Transactional
	public void registerUser(Long userId, UserRegisterRequestDto requestDto) {
		User user = userRepository.findByUserId(userId)
				.orElseThrow(() -> new UserNotFoundException());
	}
}
