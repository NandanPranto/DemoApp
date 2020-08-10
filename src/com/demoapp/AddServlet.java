package com.demoapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
	
	public void service(HttpServletRequest req, HttpServletResponse res ) throws IOException 
	{
		
		int i = Integer.parseInt(req.getParameter("number1"));
		int j = Integer.parseInt(req.getParameter("number2"));
		
		int k = i + j;
		
		PrintWriter out = res.getWriter();
		out.println("Result is : " +k);
		//System.out.println() korle console e print hobe kintu amra seta chaina amra chai url e print hok
		//tai amra res.getWriter() use korbo jate kore server jhokon run korbe tokhn 
		//jhokhon add korar kotha bolbe tokhoni server asole response korlo tai amra
		// respose er obj res k bebohar korlam
		
		
		
	}

}
