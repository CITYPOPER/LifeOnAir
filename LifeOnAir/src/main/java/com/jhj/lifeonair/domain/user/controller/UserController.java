package com.jhj.lifeonair.domain.user.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jhj.lifeonair.domain.user.dto.UserRegisterRequestDto;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	
	@Operation(summary = "유저 기본 정보 입력 요청")
	@ApiResponse(responseCode = "201", description = "요청 성공")
	@ApiResponse(responseCode = "404", description = "해당 유저가 없는 상태일 때")
	@PatchMapping("/join")
	@ResponseStatus(HttpStatus.CREATED)
	public void registerUser(@RequestBody @Valid UserRegisterRequestDto requestDto) {
		
	}
}
