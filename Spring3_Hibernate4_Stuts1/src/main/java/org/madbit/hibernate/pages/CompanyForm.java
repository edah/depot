package org.madbit.hibernate.pages;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;


import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import org.madbit.hibernate.entity.Agency;

public class CompanyForm extends ActionForm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private Set<Agency> agencies = new HashSet<Agency>(0);
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Agency> getAgencies() {
		return agencies;
	}
	public void setAgencies(Set<Agency> agencies) {
		this.agencies = agencies;
	}
	@Override
	public ActionErrors validate(ActionMapping mapping,
	HttpServletRequest request) {
 
	    ActionErrors errors = new ActionErrors();
 
	    if( getName() == null || ("".equals(getName()))) {
	       errors.add("company.err.name",
              new ActionMessage("company.err.name.required"));
	    }
	    
	   

	    return errors;
	}
 
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// reset properties
		
		name = "" ;
	}	
	
	
}
