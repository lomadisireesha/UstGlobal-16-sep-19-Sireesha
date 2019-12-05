package com.ustglobal.springmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.springmvc.dto.Order;
import com.ustglobal.springmvc.dto.Product;
import com.ustglobal.springmvc.dto.RetailBean;
import com.ustglobal.springmvc.service.RetailService;
@Controller
public class RetailerController {

	@Autowired
	private RetailService service ;
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
		RetailBean bean = service.login(id, password);
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
	public String register(RetailBean bean,ModelMap map) {
		int check = service.register(bean);
		if(check>0) {
			map.addAttribute("msg", "you are Registered and ID i "+check);
		}else {
			map.addAttribute("msg","Email is repeated");
		}
		return "login";
	}
	
	@GetMapping("/home")
	public  String home(ModelMap map , @SessionAttribute(name="bean" , required= false) RetailBean bean) {
		if(bean==null) {
			map.addAttribute("msg", "Login First!!!");
			return "login";
		}else {
			return "home";
		}
	}//end od home()
	@PostMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/searchproduct")
	public String search() {
		
		return "searchproduct";
	}
	@PostMapping("/searchproduct")
	public String searchproduct(@SessionAttribute(name= "user", required = false) RetailBean user,ModelMap map,String pname) {
		if(user!=null) {
			
			Product product=service.searchproduct(pname);
			if(product!=null) {
			map.addAttribute("product",product);
			return "searchproduct";
			}else {
				map.addAttribute("msg", "product not found");
				return "searchproduct";
			}
		}/*else {
			map.addAttribute("msg", "First Login!!!");
		return "login";
		}*/
		return "home";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}//end of logout
	

	@GetMapping("/buy")
	public String buy(@SessionAttribute(name= "user", required = false) RetailBean user,ModelMap map,Product product) {
		if(user!=null) {
			map.addAttribute("buy", product);
			return "buyproduct";
		}else {
			map.addAttribute("msg", "First Login");
			return "login";
		}
	}
	@PostMapping("/buy")
	public String buyproduct(@SessionAttribute(name= "user", required = false) RetailBean user,ModelMap map,Product product, int quantity) {
		if(user!=null) {
			service.buyProduct(user, product, quantity);
			map.addAttribute("msg", "product added");
			return "home";
		}else {
			map.addAttribute("msg", "First Login");
			return "login";
		}
	}
	@GetMapping("/order")
	public String order(@SessionAttribute(name= "user", required = false) RetailBean user,ModelMap map) {
		if(user!=null) {
			List<Order> list=service.getProducts(user.getEmail());
			if(list.isEmpty()) {
				map.addAttribute("msg", "No Product You Have");
				return "home";
			}else {
				map.addAttribute("orders", list);
				return "orders";
			}
		}else {
			map.addAttribute("msg", "First Login");
			return "login";
		}
	
	}
	@GetMapping("/updatepassword")
	public String updatePassword(HttpServletRequest req) {
		HttpSession session = req.getSession(false);
		if(session!= null) {
		return "updatepassword";
	}else {
		return "login";
	}
	}//end of updatepassword()
	
	@PostMapping("/updatepassword")
	public String updatePassword(String password,String confirmpassword, 
		@SessionAttribute(name="bean")RetailBean bean ,ModelMap map) {
		
		if(password.equals(confirmpassword)) {
		service.updatePassword(bean.getId(), password);
		map.addAttribute("msg","password change");
	}else {
		map.addAttribute("msg", "password not matching");
	}
		return "home";
}

	
	

}
