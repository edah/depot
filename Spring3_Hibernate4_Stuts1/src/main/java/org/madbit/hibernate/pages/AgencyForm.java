package org.madbit.hibernate.pages;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;


import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import org.madbit.hibernate.entity.Agency;
import org.madbit.hibernate.entity.Company;

public class AgencyForm extends ActionForm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private Set<Company> companies = new HashSet<Company>(0);
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping,
	HttpServletRequest request) {
 
	    ActionErrors errors = new ActionErrors();
 
	    if( getName() == null || ("".equals(getName()))) {
	       errors.add("Agency.err.name",
              new ActionMessage("Agency.err.name.required"));
	    }
	    
	   

	    return errors;
	}
 
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// reset properties
		
		name = "" ;
	}
	public Set<Company> getCompanies() {
		return companies;
	}
	public void setCompanies(Set<Company> companies) {
		this.companies = companies;
	}	
	
	
}
