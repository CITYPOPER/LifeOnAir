package com.jhj.lifeonair.domain.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	@Column(length = 15)
	private String nickname;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Provider provider;
	
	@Column(nullable = false)
	private String oauthId;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Role role;
	
	@Builder
	public User(String nickname, Provider provider, String oauthId, Role role) {
		this.nickname = nickname;
		this.provider = provider;
		this.oauthId = oauthId;
		this.role = role;
	}
	
}
