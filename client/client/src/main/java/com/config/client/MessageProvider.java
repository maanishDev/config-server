package com.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/test")
public class MessageProvider {

	@Value("${msg:hutt}")
	private String message;

	@PostMapping
	public String String() {
		return message;
	}

}
