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
 * Servlet implementation class EditarCliente
 */
@WebServlet("/EditarEmpleado")
public class EditarEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarEmpleado() {
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
		EmpleadoDao empleadodao = new EmpleadoDao();
		Empleado emp = empleadodao.buscar(empleadoid);
		request.setAttribute("regemp", emp);
		request.getRequestDispatcher("EditarEmpleado.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		Empleado emp = new Empleado();
		
		int idempleado = Integer.parseInt(request.getParameter("idempleado"));
		String nombre = request.getParameter("nombre");
		String especialidad = request.getParameter("especialidad");
		
		emp.setIdempleado(idempleado);
		emp.setNombreempleado(nombre);
		emp.setEspecialidad(especialidad);
		
		
		EmpleadoDao empleadodao = new EmpleadoDao();
		boolean editar = false;
		editar = empleadodao.actualizar(emp);
		
		String mensaje = "";
		
		if (editar)
			mensaje = "El empleado ha sido actualizado exitosamente.";
		else
			mensaje = "Ocurri� un error al procesar la solicitud";
		
		request.setAttribute("ccmensaje", mensaje);
		request.setAttribute("regemp", emp);
		request.getRequestDispatcher("EditarEmpleado.jsp").forward(request, response);		

	}

}
