package com.overfunc.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.overfunc.dao.UserDao;
import com.overfunc.vo.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int userInsert( User user) {
		return sqlSession.insert( "users.insertUser", user );
	}
}
