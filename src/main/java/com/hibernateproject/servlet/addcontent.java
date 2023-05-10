package com.hibernateproject.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernateproject.usertodolist;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class addcontent extends HttpServlet  {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String name = request.getParameter("name");
			String content = request.getParameter("content");
			String date = request.getParameter("date");
			String problem = request.getParameter("problem");
		Configuration configuration = new Configuration().configure().addAnnotatedClass(usertodolist.class);
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
 			Transaction txTransaction =  session.beginTransaction();
 			usertodolist usertodolist = new usertodolist(name,content,date,problem);
			session.save(usertodolist);
			txTransaction.commit();
			session.close();
			PrintWriter out = response.getWriter();
			out.println("Hello the content is safely added");
			out.println("Go Back and We Can Connect With You Soon");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}


}
