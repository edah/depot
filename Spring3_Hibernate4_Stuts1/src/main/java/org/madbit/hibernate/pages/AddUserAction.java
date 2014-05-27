package org.madbit.hibernate.pages;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.madbit.hibernate.entity.User;
import org.madbit.hibernate.service.UserSERVICE;

public class AddUserAction extends Action {
	 UserSERVICE userSERVICE = null ;
	public ActionForward execute(ActionMapping mapping,ActionForm form,
		HttpServletRequest request,HttpServletResponse response) 
	        throws Exception {
	 
		
	 
		UserForm userForm = (UserForm)form;
		User user = new User();
		 System.out.print("000++++++++++++++++++++++ login" + userForm.getLogin() + "+++++++fulname :" + userForm.getFullname());
		//copy userform to model
		user.setLogin(userForm.getLogin());
		user.setFullname(userForm.getFullname());
		user.setPassword("****");
	 System.out.print("++++++++++++++++++++++ login" + user.getLogin() + "+++++++fulname :" + user.getFullname());
		//save it
		userSERVICE.addUser(user);
	 
		return mapping.findForward("success");
	 
	  }
	
	
	
	public UserSERVICE getUserSERVICE() {
		return userSERVICE;
	}
	public void setUserSERVICE(UserSERVICE userSERVICE) {
		this.userSERVICE = userSERVICE;
	}
	}