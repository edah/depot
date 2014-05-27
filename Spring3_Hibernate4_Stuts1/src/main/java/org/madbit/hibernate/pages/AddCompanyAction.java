package org.madbit.hibernate.pages;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.madbit.hibernate.entity.Company;
import org.madbit.hibernate.service.CompanySERVICE;

public class AddCompanyAction extends Action {
	 CompanySERVICE CompanySERVICE = null ;
	public ActionForward execute(ActionMapping mapping,ActionForm form,
		HttpServletRequest request,HttpServletResponse response) 
	        throws Exception {
	 
		
	 
		CompanyForm CompanyForm = (CompanyForm)form;
		Company Company = new Company();
		// System.out.print("000++++++++++++++++++++++ login" + CompanyForm.getLogin() + "+++++++fulname :" + CompanyForm.getFullname());
		//copy Companyform to model
		Company.setName(CompanyForm.getName());
	 System.out.print("++++++++++++++++++++++ CompanyName" + Company.getName() );
		//save it
		CompanySERVICE.addCompany(Company);
	 
		return mapping.findForward("success");
	 
	  }
	
	
	
	public CompanySERVICE getCompanySERVICE() {
		return CompanySERVICE;
	}
	public void setCompanySERVICE(CompanySERVICE CompanySERVICE) {
		this.CompanySERVICE = CompanySERVICE;
	}
	}