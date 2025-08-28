package servlets;



import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>¡Hola Mundo desde el Servlet!</h1>");
        out.println("<a href='/MiProyectoJSP/index.jsp'>Ir a la página JSP</a>");
        out.println("</body></html>");
    }
}
