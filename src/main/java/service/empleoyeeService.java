package service;
import java.util.ArrayList;

import model.empleoyee;

public interface empleoyeeService {
	
	public ArrayList<empleoyee> muestraEmpleado();

	public empleoyee crearEmpleado(empleoyee p);

	public empleoyee modificarEmpleado(empleoyee p);

	public void eliminarEmpleado(int id);

	

}
