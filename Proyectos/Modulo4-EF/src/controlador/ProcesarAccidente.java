package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AccidenteDao;
//import dao.ClienteDao;
import modelo.Accidente;
//import modelo.Cliente;

/**
 * Servlet implementation class ProcesarAccidente
 */
@WebServlet("/ProcesarAccidente")
public class ProcesarAccidente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcesarAccidente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//int idAccidente = Integer.parseInt(request.getParameter("IdAccidente"));
		String Fecha =request.getParameter("date");
		String Hora =request.getParameter("hora");
		String Descripcion =request.getParameter("suceso");
		String Lugar =request.getParameter("txtLugar");
		int idCliente = Integer.parseInt(request.getParameter("txtidcliente"));
		Accidente acc = new Accidente(Fecha,Hora,Descripcion,Lugar,idCliente);
		AccidenteDao accidentedao = new AccidenteDao();
		boolean agregar = false;
		agregar = accidentedao.registrar(acc);
		
		String mensaje = "";
		
		if (agregar)
			mensaje = "El accidente se ha sido agregado exitosamente.";
		else
			mensaje = "Ocurrió un error al procesar la solicitud";
		
		request.setAttribute("ccmensaje", mensaje);
		request.getRequestDispatcher("MostrarAccidente.jsp").forward(request, response);
	}

}
