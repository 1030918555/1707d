package com.hq.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hq.dao.UserDAO;
@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserDAO userDAO;
	
	@Override
	public List list() {
		// TODO Auto-generated method stub
		return userDAO.list();
	}

}
