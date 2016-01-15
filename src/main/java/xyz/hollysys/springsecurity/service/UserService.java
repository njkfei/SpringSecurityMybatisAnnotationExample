package xyz.hollysys.springsecurity.service;

import java.util.List;

import xyz.hollysys.springsecurity.model.User;
import xyz.hollysys.springsecurity.model.UserProfile;

public interface UserService {

	User findById(int id);
	
	User findBySso(String sso);
	
	List<UserProfile> getUserProfiles(int user_id);
}