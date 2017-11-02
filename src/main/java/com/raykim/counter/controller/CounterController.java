package com.raykim.counter.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@RequestMapping("")
	public String index(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws ServletException, IOException {
		if(session.getAttribute("views") == null) {
			session.setAttribute("views", 0);
		}
		session.setAttribute("views", (int)session.getAttribute("views")+1);
		System.out.println(session.getAttribute("views"));
		return "index";
	}
	
	@RequestMapping("/counter")
	public String counter(Model model, HttpServletRequest request, HttpServletResponse response, HttpSession session) throws ServletException, IOException {
		model.addAttribute("count", session.getAttribute("views"));
		return "counter";
	}
	
}

