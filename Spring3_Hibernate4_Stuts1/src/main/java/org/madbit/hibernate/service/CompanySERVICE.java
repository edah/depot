package org.madbit.hibernate.service;

import java.util.List;

import org.madbit.hibernate.dao.CompanyDAO;
import org.madbit.hibernate.entity.Company;


public class CompanySERVICE {
	CompanyDAO CompanyDAO ;
public void addCompany (Company u)
{ CompanyDAO.addCompany (u);
	}
public CompanyDAO getCompanyDAO() {
	return CompanyDAO;
}
public void setCompanyDAO(CompanyDAO CompanyDAO) {
	this.CompanyDAO = CompanyDAO;
}

public List<Company> findAllCompany()
{return this.CompanyDAO.findAllCompany();
	}
}
