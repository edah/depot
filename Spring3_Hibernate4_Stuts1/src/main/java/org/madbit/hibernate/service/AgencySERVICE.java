package org.madbit.hibernate.service;

import java.util.List;

import org.madbit.hibernate.dao.AgencyDAO;
import org.madbit.hibernate.entity.Agency;


public class AgencySERVICE {
	AgencyDAO AgencyDAO ;
public void addAgency (Agency u)
{ AgencyDAO.addAgency (u);
	}
public AgencyDAO getAgencyDAO() {
	return AgencyDAO;
}
public void setAgencyDAO(AgencyDAO AgencyDAO) {
	this.AgencyDAO = AgencyDAO;
}

public List<Agency> findAllAgency()
{return this.AgencyDAO.findAllAgency();
	}
}
