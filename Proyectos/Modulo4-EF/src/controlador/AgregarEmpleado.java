package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmpleadoDao;
import modelo.Empleado;

/**
 * Servlet implementation class AgregarCliente
 */
@WebServlet("/AgregarEmpleado")
public class AgregarEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarEmpleado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("CrearEmpleado.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String nombre = request.getParameter("nombre");
		String especialidad = request.getParameter("especialidad");
		
		Empleado emp = new Empleado(nombre,especialidad);
		EmpleadoDao empledao = new EmpleadoDao();
		
		boolean agregar = false;
		agregar = empledao.agregar(emp);
		
		String mensaje = "";
		
		if (agregar)
			mensaje = "El empleado ha sido agregado exitosamente.";
		else
			mensaje = "Ocurrió un error al procesar la solicitud";
		
		request.setAttribute("ccmensaje", mensaje);
		request.getRequestDispatcher("CrearEmpleado.jsp").forward(request, response);		
		
	}

}
