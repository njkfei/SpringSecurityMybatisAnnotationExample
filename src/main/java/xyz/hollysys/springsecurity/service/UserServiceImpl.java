package xyz.hollysys.springsecurity.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import xyz.hollysys.springsecurity.dao.UserDao;
import xyz.hollysys.springsecurity.dao.UserProfileDao;
import xyz.hollysys.springsecurity.model.User;
import xyz.hollysys.springsecurity.model.UserProfile;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	static Logger logger = Logger.getLogger(UserServiceImpl.class);
	@Autowired
	@Qualifier("userDao")
	private UserDao userDao;
	
	@Autowired 
	@Qualifier("userProfileDao")
	UserProfileDao userProfileDao;

	public User findById(int id) {
		logger.info("findById id : " + id);
		return userDao.findById(id);
	}

	public User findBySso(String sso) {
		logger.info("findBySso sso : " + sso);
		return userDao.findBySSO(sso);
	}

	public List<UserProfile> getUserProfiles(int user_id){
		logger.info("getUserProfiles user_id : " + user_id);
		return userProfileDao.getUserProfiles(user_id);
	}
}
