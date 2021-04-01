package ua.com.shami.onemorewishlist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController()
public class Hello {
	@GetMapping("/hello")
	private Mono<String> hello() {
		return Mono.just("HELLO");
	}
}
