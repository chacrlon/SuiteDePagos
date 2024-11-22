package com.suitepagos.backend.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;
import com.suitepagos.backend.models.entity.Users;
import com.suitepagos.backend.models.services.IUserService;

@Component
public class InfoAdicionalToken implements TokenEnhancer{
	
	@Autowired
	private IUserService userService;

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		
		Users user2 = userService.findByUsername(authentication.getName());
		Map<String, Object> info = new HashMap<>();
		
		info.put("username", authentication.getName());
		info.put("name", user2.getName());
		info.put("surname", user2.getSurname());
		info.put("email", user2.getEmail());
		info.put("id", user2.getId());
		info.put("role", authentication.getAuthorities());
		info.put("companyId", user2.getCompany().getCompanyid());
		info.put("companyName", user2.getCompany().getName());
		info.put("companyCustomerId", user2.getCompany().getCustomerid());
		
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		
		return accessToken;
	}

}
