package com.scott.learning_springboot;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@Cacheable(value = "user")
	public User view(@PathVariable("id") Long id) {
		User user = new User();
		user.setId(id);
		user.setName("zhang");
		return user;
	}
}
