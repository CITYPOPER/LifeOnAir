package com.jhj.lifeonair.domain.user.dto;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserRegisterRequestDto {
	
//	@Schema(description = "닉네임")
	@Length(max = 15)
	@NotBlank
	private String nickname;
}
