package org.madbit.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.madbit.hibernate.entity.Company;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class CompanyDAO {

	/**
	 * @param args
	 */
private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional(readOnly=false)
	public void addCompany(Company Company) {
		//Session session = sessionFactory.openSession();
		 System.out.print("222++++++++++++++++++++++ name" + Company.getName() );
		Session session = sessionFactory.getCurrentSession();
		session.save(Company);
		//session.close();		
	}

	@SuppressWarnings("unchecked")
	public List<Company> findAllCompany()
	{
		 System.out.print("222++++++++++++++++++++++ CompanyDaoListCompany");
		 
		 Session session = sessionFactory.getCurrentSession();
		 return  session.createQuery("from Company").list() ;
	
		 
		 
		
		
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}