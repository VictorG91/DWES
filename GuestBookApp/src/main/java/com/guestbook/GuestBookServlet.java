package com.guestbook;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/guestbook")

public class GuestBookServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
	HttpServletResponse response)
	throws ServletException, IOException {
	// Configuración de respuesta
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	// Muestra la lista de mensajes
	out.println("<html><body>");
	out.println("<h1>Libro de Visitas</h1>");
	out.println("<form method='POST' action='/GuestBookApp/guestbook'>");
	out.println("Nombre: <input type='text' name='name'><br>");
	out.println("Mensaje: <textarea	name='message'></textarea><br>");
	out.println("<input type='submit' value='Añadir Mensaje'>");
	out.println("</form>");
	// Imprimir mensajes guardados
	List<String> messages = (List<String>) getServletContext().getAttribute("messages");
	if (messages != null) {
		for (String message : messages) {
			out.println("<p>" + message + "</p>");
		}
	}
	out.println("</body></html>");
	}
	@Override
	protected void doPost(HttpServletRequest request,
	HttpServletResponse response)
	throws ServletException, IOException {
	// Leer los parámetros enviados por el formulario
	String name = request.getParameter("name");
	String message = request.getParameter("message");
	// Guardar el mensaje en la lista compartida del contexto
	List<String> messages = (List<String>)
	getServletContext().getAttribute("messages");
	if (messages == null) {
	messages = new ArrayList<>();
	getServletContext().setAttribute("messages", messages);
	}
	messages.add("Nombre: " + name + " - Mensaje: " + message);
	// Redireccionar al mismo servlet para mostrar el resultado
	response.sendRedirect("guestbook");
	}

}
