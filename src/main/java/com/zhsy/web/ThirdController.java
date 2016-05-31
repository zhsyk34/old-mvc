package com.zhsy.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.LastModified;

public class ThirdController implements Controller, LastModified {
	private long lastModified;

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 点击后再次请求当前页面
		response.getWriter().write("<a href=''>this</a>");
		return null;
	}

	@Override
	public long getLastModified(HttpServletRequest request) {
		if (lastModified == 0L) {
			// TODO 此处更新的条件：如果内容有更新，应该重新返回内容最新修改的时间戳
			lastModified = System.currentTimeMillis();
		}
		return lastModified;
	}

}
