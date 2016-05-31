package com.zhsy.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.zhsy.pojo.User;

@SuppressWarnings("deprecation")
public class CommandController extends AbstractCommandController {

	public CommandController() {
		setCommandClass(User.class);
	}

	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {

		User user = (User) command;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("command");
		mv.addObject("user",user);
		return mv;
	}

}
