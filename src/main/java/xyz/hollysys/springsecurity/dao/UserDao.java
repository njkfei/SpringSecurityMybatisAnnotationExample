package xyz.hollysys.springsecurity.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import xyz.hollysys.springsecurity.model.User;

//@Repository("userDao")
public interface UserDao {

	@Select("select * from app_user where id=#{id}")
	User findById(@Param("id") int id);
	
	@Select("select * from app_user where sso_id=#{sso_id}")
	User findBySSO(@Param("sso_id")String sso_id);
}

