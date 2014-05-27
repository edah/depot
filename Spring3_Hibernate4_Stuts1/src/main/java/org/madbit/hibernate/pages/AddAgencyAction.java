package org.madbit.hibernate.pages;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.madbit.hibernate.entity.Agency;
import org.madbit.hibernate.service.AgencySERVICE;

public class AddAgencyAction extends Action {
	 AgencySERVICE AgencySERVICE = null ;
	public ActionForward execute(ActionMapping mapping,ActionForm form,
		HttpServletRequest request,HttpServletResponse response) 
	        throws Exception {
	 
		
	 
		AgencyForm AgencyForm = (AgencyForm)form;
		Agency Agency = new Agency();
		// System.out.print("000++++++++++++++++++++++ login" + AgencyForm.getLogin() + "+++++++fulname :" + AgencyForm.getFullname());
		//copy Agencyform to model
		Agency.setName(AgencyForm.getName());
	 System.out.print("++++++++++++++++++++++ AgencyName" + Agency.getName() );
		//save it
		AgencySERVICE.addAgency(Agency);
	 
		return mapping.findForward("success");
	 
	  }
	
	
	
	public AgencySERVICE getAgencySERVICE() {
		return AgencySERVICE;
	}
	public void setAgencySERVICE(AgencySERVICE AgencySERVICE) {
		this.AgencySERVICE = AgencySERVICE;
	}
	}