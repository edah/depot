package org.madbit.hibernate.pages;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.madbit.hibernate.entity.User;
import org.madbit.hibernate.service.UserSERVICE;



public class ListUserAction extends Action {
	UserSERVICE userSERVICE = null ;
	 
	public ActionForward execute(ActionMapping mapping,ActionForm form,
		HttpServletRequest request,HttpServletResponse response) 
	        throws Exception {
	 
		
	 
		DynaActionForm dynaUserListForm = (DynaActionForm)form;
		 
		List<User> list = userSERVICE.findAllUser();
	 
		dynaUserListForm.set("userList", list);
	 
		return mapping.findForward("success");
	 
	  }

	public UserSERVICE getUserSERVICE() {
		return userSERVICE;
	}

	public void setUserSERVICE(UserSERVICE userSERVICE) {
		this.userSERVICE = userSERVICE;
	}

}
