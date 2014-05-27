package org.madbit.hibernate.service;

import java.util.List;

import org.madbit.hibernate.dao.UserDAO;
import org.madbit.hibernate.entity.User;


public class UserSERVICE {
	UserDAO userDAO ;
public void addUser (User u)
{ userDAO.addUser (u);
	}
public UserDAO getUserDAO() {
	return userDAO;
}
public void setUserDAO(UserDAO userDAO) {
	this.userDAO = userDAO;
}

public List<User> findAllUser()
{return this.userDAO.findAllUser();
	}
}
