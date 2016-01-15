package xyz.hollysys.springsecurity.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import xyz.hollysys.springsecurity.model.UserProfile;
import xyz.hollysys.springsecurity.service.UserService;

@RestController
public class JsonController {
	static Logger logger = Logger.getLogger(JsonController.class);

	@Autowired
	@Qualifier("userService")
	private UserService userService;

	@RequestMapping(value = "/json/{user_id}", method = RequestMethod.GET)
	public @ResponseBody List<UserProfile> jsonPage(@PathVariable int user_id) {
		logger.info("json");
		return userService.getUserProfiles(user_id);
	}

}