package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AsesoriaDao;
import modelo.Asesoria;


/**
 * Servlet implementation class AgregarAsesoria
 */
@WebServlet("/AgregarAsesoria")
public class AgregarAsesoria extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarAsesoria() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("AgregarAsesoria.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String detalle = request.getParameter("detalle");
		String gestion = request.getParameter("gestion");
		String propuestas = request.getParameter("propuestas");
		String fecha = request.getParameter("fecha");
		String especial = request.getParameter("especial");
		int visitaid = Integer.parseInt(request.getParameter("visitaid"));
				
		Asesoria ase = new Asesoria(detalle, gestion,propuestas,fecha,especial,visitaid);
		AsesoriaDao asesoriadao = new AsesoriaDao();
		
		boolean registrar = false;
		registrar = asesoriadao.agregar(ase);
		
		String mensaje = "";
		
		if (registrar)
			mensaje = "Agregado exitosamente.";
		else
			mensaje = "Ocurrió un error al procesar la solicitud";
		
		request.setAttribute("aamensaje", mensaje);
		request.getRequestDispatcher("AgregarAsesoria.jsp").forward(request, response);	
	}

}
