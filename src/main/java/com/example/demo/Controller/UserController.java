package com.example.demo.Controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.UserDAO.UserDao;
import com.example.demo.user.User;

@RestController
public class UserController {

	@Autowired
	UserDao userdao;

	Logger log = LoggerFactory.getLogger(getClass());

	
	@RequestMapping("Alagankulam")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("Alagankulam.jsp");
		log.info("entering into index page");
		return mv;
	}
@RequestMapping("adduser")
public ModelAndView add(User user)
{
	log.info("entered into LoginPage jsp page");
	ModelAndView mv=new ModelAndView("Alagankulam.jsp");
	userdao.save(user);
	return mv;
	}

}