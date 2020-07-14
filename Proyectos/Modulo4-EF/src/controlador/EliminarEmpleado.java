package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmpleadoDao;
import modelo.Empleado;

/**
 * Servlet implementation class EliminarCliente
 */
@WebServlet("/EliminarEmpleado")
public class EliminarEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarEmpleado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int empleadoid = Integer.parseInt(request.getParameter("id"));
		
		Empleado emp = new Empleado();
		emp.setIdempleado(empleadoid);
		EmpleadoDao empleadodao = new EmpleadoDao();
		boolean eliminar = false;
		eliminar = empleadodao.eliminar(emp);

		String mensaje = "";
		
		if (eliminar)
			mensaje = "El Empleado ha sido eliminado exitosamente.";
		else
			mensaje = "Ocurrió un error al procesar la solicitud";

		List<Empleado> listaemp = new ArrayList<Empleado>();
		listaemp = empleadodao.listar();				
		request.setAttribute("listarempleados", listaemp);
		
		request.setAttribute("ccmensaje", mensaje);
		request.getRequestDispatcher("/ListadoEmpleados").forward(request, response);		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
