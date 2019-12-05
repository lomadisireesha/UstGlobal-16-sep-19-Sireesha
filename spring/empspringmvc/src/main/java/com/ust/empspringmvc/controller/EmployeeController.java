package com.ust.empspringmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ust.empspringmvc.dto.EmployeeBean;
import com.ust.empspringmvc.service.EmployeeService;
import com.ust.empspringmvc.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service ;
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
		
	}
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}//end of login page
	@PostMapping("/login")
	public String login(int id,String password,HttpServletRequest req) {
		EmployeeBean bean = service.login(id, password);
		if(bean==null) {
			req.setAttribute("msg","Invalid Crendentials");
			return "login";
		}else {
			HttpSession session =req.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}
	}//end of login
	@GetMapping("/register")
	public String registerPage() {
		return "register";
		
	}//end of registerpage
	
	@PostMapping("/register")
	public String register(EmployeeBean bean,ModelMap map) {
		int check = service.register(bean);
		if(check>0) {
			map.addAttribute("msg", "you are Registered and ID i "+check);
		}else {
			map.addAttribute("msg","Email is repeated");
		}
		return "login";
	}
	
	@GetMapping("/home")
	public  String home(ModelMap map , @SessionAttribute(name="bean" , required= false) EmployeeBean bean) {
		if(bean==null) {
			map.addAttribute("msg", "Login First!!!");
			return "login";
		}else {
			return "home";
		}
	}//end of home()
	@PostMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam("id") int id,ModelMap map) {
		EmployeeBean bean = service.searchEmployee(id);
		if(bean==null) {
			map.addAttribute("msg","Data Not Found");
		}else {
			map.addAttribute("bean", bean);
		}
		return "home";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}//end of logout
	
	
	@GetMapping("/delete")
	public String deleteProfile(HttpSession session) {
		EmployeeBean bean = (EmployeeBean) session.getAttribute("bean");
		try {
		service.deleteEmployee(bean.getId());
		}catch(Exception e) {
			e.printStackTrace();
		}
		session.invalidate();
		return "login";
	}//end of deleteprofile
	
	@GetMapping("/changepassword")
	public String changePassword(HttpServletRequest req) {
		HttpSession session = req.getSession(false);
		if(session!= null) {
		return "changepassword";
	}else {
		return "login";
	}
	}//end of changepassword()
	
	@PostMapping("/changepassword")
	public String changePassword(String password,String confirmpassword, 
		@SessionAttribute(name="bean")EmployeeBean bean ,ModelMap map) {
		
		if(password.equals(confirmpassword)) {
		service.changePassword(bean.getId(), password);
		map.addAttribute("msg","password change");
	}else {
		map.addAttribute("msg", "password not matching");
	}
		return "home";
}
	
	@GetMapping("/update")
	public String updateProfile(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if(session!= null) {
		return "update";
	}else {
		return "login";
	}
	}
	
	@PostMapping("/update")
	public String updateProfile(String password,String name,Date doj,String gender, 
			@SessionAttribute(name="bean")EmployeeBean bean ,ModelMap map) {
			bean.setName(name);
			bean.setPassword(password);
			bean.setDoj(doj);
			bean.setGender(gender);
			boolean check = service.updateEmployee(bean);
			if(check) {
				map.addAttribute("msg", "updatedSuccessfully");
			}else {
				map.addAttribute("msg", "not updatedSuccessfully");
			}
			
			
			return "home";
	}
	
	
	
	
	
	
	
	
	
	
	
}
