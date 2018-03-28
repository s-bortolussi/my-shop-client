package com.example.myshopclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.oauth2.client.filter.OAuth2ClientAuthenticationProcessingFilter;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class MyShopClientApplication {

	@GetMapping("/me")
	public Map<String,String> home(Principal user) {
        OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails) ((OAuth2Authentication) user).getDetails();
        String tokenValue = details.getTokenValue();
        HashMap res = new HashMap();
        res.put("user",user.getName());
        res.put("access_token",tokenValue);
        return res;
	}

	public static void main(String[] args) {
		SpringApplication.run(MyShopClientApplication.class, args);
	}
}
