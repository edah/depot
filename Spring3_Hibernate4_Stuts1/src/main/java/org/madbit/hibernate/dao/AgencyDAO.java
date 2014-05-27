package org.madbit.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.madbit.hibernate.entity.Agency;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class AgencyDAO {

	/**
	 * @param args
	 */
private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional(readOnly=false)
	public void addAgency(Agency Agency) {
		//Session session = sessionFactory.openSession();
		 System.out.print("222++++++++++++++++++++++ name" + Agency.getName() );
		Session session = sessionFactory.getCurrentSession();
		session.save(Agency);
		//session.close();		
	}

	@SuppressWarnings("unchecked")
	public List<Agency> findAllAgency()
	{
		 System.out.print("222++++++++++++++++++++++ AgencyDaoListAgency");
		 
		 Session session = sessionFactory.getCurrentSession();
		 return  session.createQuery("from Agency").list() ;
	
		 
		 
		
		
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}