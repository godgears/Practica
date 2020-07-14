package idao;
import java.util.List;
import modelo.Empleado;
public interface IEmpleadoDao {
	
	public boolean agregar(Empleado empleado);
	public List<Empleado> listar();
	public boolean actualizar(Empleado empleado);
	public boolean eliminar (Empleado empleado);
	public Empleado buscar(int empleadoid);

}
