package com.hoangengland.testpai;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hoangengland.model.Person;
import com.hoangengland.util.HttpUtil;
@WebServlet(urlPatterns = "/api-demo")
public class NewAPI extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 890102656705402807L;

	/**
	 * 
	 */


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		
		Person p = HttpUtil.of(req.getReader()).toModel(Person.class);
		System.out.println(p);
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValue(resp.getOutputStream(), p);
		System.out.println("Hello");
		System.out.println("Hello");
	}
}
