package servlets;

package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class PromedioServlet extends HttpServlet {

    // Método que maneja las solicitudes GET
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Redirige al formulario JSP
        RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/formulario.jsp");
        dispatcher.forward(request, response);
    }

    // Método que maneja las solicitudes POST
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los datos del formulario
        String nombre = request.getParameter("nombre");
        double nota1 = Double.parseDouble(request.getParameter("nota1"));
        double nota2 = Double.parseDouble(request.getParameter("nota2"));
        double nota3 = Double.parseDouble(request.getParameter("nota3"));

        // Calcular el promedio
        double promedio = (nota1 + nota2 + nota3) / 3;

        // Determinar si el estudiante está aprobado o no
        String estado = (promedio >= 6) ? "Aprobado" : "Desaprobado";

        // Guardar los resultados en el request
        request.setAttribute("nombre", nombre);
        request.setAttribute("nota1", nota1);
        request.setAttribute("nota2", nota2);
        request.setAttribute("nota3", nota3);
        request.setAttribute("promedio", promedio);
        request.setAttribute("estado", estado);

        // Redirigir a la página de resultados
        RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/resultados.jsp");
        dispatcher.forward(request, response);
    }
}

