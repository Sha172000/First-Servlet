package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/first")
public class Servlet_app1 implements Servlet {
public void init(ServletConfig sc)throws ServletException{
	//NoCode
}
public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
String name=req.getParameter("uname");
String mailid=req.getParameter("mid");
pw.println("****Display from Servlet****");
pw.println("<br>Username:"+name);
pw.println("<br>MailiD:"+mailid);
}

public ServletConfig getServletConfig() {
	return this.getServletConfig();//Demo Code
}
@Override
public void destroy() {
	// TODO Auto-generated method stub
	
}
@Override
public String getServletInfo() {
	// TODO Auto-generated method stub
	return null;
}
}
