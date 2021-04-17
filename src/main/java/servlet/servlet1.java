package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pedido")
public class servlet1 extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        String p1 = req.getParameter("prod1");
        
        response(resp, p1);
       
      
        
    }
    
     private void response(HttpServletResponse resp, String mensaje)
         throws IOException{
        
         resp.setContentType("text/html;charset=UTF-8");
         try (PrintWriter out = resp.getWriter()) {
             out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>"+ mensaje + "</h1>");
            out.println("</body>");
            out.println("</html>");
           }
     
     }

}
