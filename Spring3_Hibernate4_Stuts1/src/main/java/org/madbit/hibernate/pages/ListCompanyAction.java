package org.madbit.hibernate.pages;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.madbit.hibernate.entity.Company;
import org.madbit.hibernate.service.CompanySERVICE;



public class ListCompanyAction extends Action {
	CompanySERVICE CompanySERVICE = null ;
	 
	public ActionForward execute(ActionMapping mapping,ActionForm form,
		HttpServletRequest request,HttpServletResponse response) 
	        throws Exception {
	 
		
	 
		DynaActionForm dynaCompanyListForm = (DynaActionForm)form;
		 
		List<Company> list = CompanySERVICE.findAllCompany();
	 
		dynaCompanyListForm.set("CompanyList", list);
	 
		return mapping.findForward("success");
	 
	  }

	public CompanySERVICE getCompanySERVICE() {
		return CompanySERVICE;
	}

	public void setCompanySERVICE(CompanySERVICE CompanySERVICE) {
		this.CompanySERVICE = CompanySERVICE;
	}

}
 