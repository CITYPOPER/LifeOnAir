package com.jhj.lifeonair.global.security.oauth.dto;

import java.util.Map;

import com.jhj.lifeonair.domain.user.entity.Provider;
import com.jhj.lifeonair.domain.user.entity.Role;
import com.jhj.lifeonair.domain.user.entity.User;

import lombok.Builder;
import lombok.Getter;

@Getter
public class OAuthAttributes {

	private String nameAttributeKey;
	private OAuth2UserInfo oauth2UserInfo;
	
	@Builder
	public OAuthAttributes(String nameAttributeKey, OAuth2UserInfo oauth2UserInfo) {
		this.nameAttributeKey = nameAttributeKey;
		this.oauth2UserInfo = oauth2UserInfo;
	}
	
	public static OAuthAttributes of(Provider provider,
			String userNameAttributeName, Map<String, Object> attributes) {
		
		if (provider == Provider.GOOGLE) {
			return ofGoogle(userNameAttributeName, attributes);
		}
		return ofKakao(userNameAttributeName, attributes);
	}
	
	private static OAuthAttributes ofKakao(String userNameAttributeName, Map<String, Object> attributes) {
		return OAuthAttributes.builder()
				.nameAttributeKey(userNameAttributeName)
				.oauth2UserInfo(new KakaoOAuth2UserInfo(attributes))
				.build();
	}
	
	public static OAuthAttributes ofGoogle(String userNameAttributeName, Map<String, Object> attributes) {
		return OAuthAttributes.builder()
				.nameAttributeKey(userNameAttributeName)
				.oauth2UserInfo(new GoogleOAuth2UserInfo(attributes))
				.build();
	}
	
	public User toEntity(Provider provider, OAuth2UserInfo oauth2UserInfo) {
		return User.builder()
				.provider(provider)
				.oauthId(oauth2UserInfo.getId())
				.role(Role.GUEST)
				.build();
	}
}
