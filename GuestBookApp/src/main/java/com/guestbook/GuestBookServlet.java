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
    
    // Serial version UID para evitar advertencias
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Configuración de la respuesta
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Muestra la lista de mensajes
        out.println("<html><body>");
        out.println("<h1>Libro de Visitas</h1>");
        out.println("<form method='POST' action='" + request.getContextPath() + "/guestbook'>");
        out.println("Nombre: <input type='text' name='name'><br>");
        out.println("Mensaje: <textarea name='message'></textarea><br>");
        out.println("<input type='submit' value='Añadir Mensaje'>");
        out.println("</form>");

        // Obtener mensajes guardados en el contexto
        List<String> messages = (List<String>) getServletContext().getAttribute("messages");
        
        // Comprobar si hay mensajes
        if (messages != null && !messages.isEmpty()) {
            for (String message : messages) {
                out.println("<p>" + message + "</p>");
            }
        } else {
            out.println("<p>No hay mensajes aún.</p>");
        }
        
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Leer los parámetros enviados por el formulario
        String name = request.getParameter("name");
        String message = request.getParameter("message");

        // Validar que los campos no estén vacíos
        if (name == null || name.trim().isEmpty() || message == null || message.trim().isEmpty()) {
            response.sendRedirect(request.getContextPath() + "/guestbook");
            return;
        }

        // Obtener o crear la lista de mensajes en el contexto de la aplicación
        List<String> messages = (List<String>) getServletContext().getAttribute("messages");
        if (messages == null) {
            messages = new ArrayList<>();
            getServletContext().setAttribute("messages", messages);
        }

        // Añadir el nuevo mensaje
        messages.add("Nombre: " + name + " - Mensaje: " + message);

        // Redireccionar al mismo servlet para mostrar los mensajes
        response.sendRedirect(request.getContextPath() + "/guestbook");
    }
}