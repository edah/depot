package org.madbit.hibernate.pages;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.madbit.hibernate.entity.Agency;
import org.madbit.hibernate.service.AgencySERVICE;



public class ListAgencyAction extends Action {
	AgencySERVICE AgencySERVICE = null ;
	 
	public ActionForward execute(ActionMapping mapping,ActionForm form,
		HttpServletRequest request,HttpServletResponse response) 
	        throws Exception {
	 
		
	 
		DynaActionForm dynaAgencyListForm = (DynaActionForm)form;
		 
		List<Agency> list = AgencySERVICE.findAllAgency();
	 
		dynaAgencyListForm.set("AgencyList", list);
	 
		return mapping.findForward("success");
	 
	  }

	public AgencySERVICE getAgencySERVICE() {
		return AgencySERVICE;
	}

	public void setAgencySERVICE(AgencySERVICE AgencySERVICE) {
		this.AgencySERVICE = AgencySERVICE;
	}

}
 