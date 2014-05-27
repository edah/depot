package org.madbit.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.madbit.hibernate.entity.User;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class UserDAO {

	/**
	 * @param args
	 */
private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional(readOnly=false)
	public void addUser(User user) {
		//Session session = sessionFactory.openSession();
		 System.out.print("222++++++++++++++++++++++ login" + user.getLogin() + "+++++++fulname :" + user.getFullname());
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		//session.close();		
	}

	@SuppressWarnings("unchecked")
	public List<User> findAllUser()
	{
		 System.out.print("222++++++++++++++++++++++ UserDaoListUser");
		 
		 Session session = sessionFactory.getCurrentSession();
		 return  session.createQuery("from User").list() ;
	
		 
		 
		
		
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
