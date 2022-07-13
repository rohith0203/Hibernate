package com.org.crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter p = resp.getWriter();
		/* String id1 = req.getParameter("id"); */
		/*
		 * int id = Integer.parseInt(id1);
		 */
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String country = req.getParameter("country");

		EmpSetGet e = new EmpSetGet();
		e.setName(name);
		e.setPassword(password);
		e.setCountry(country);
		int status;
		try {
			status = EmpDao.save(e);

			if (status > 0) {
				p.print("saved sucessfully");
				req.getRequestDispatcher("emp.html").include(req, resp);
				System.out.println("sucessfully assigned");
			} else {
				p.print("sorry! unable to save");
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}
