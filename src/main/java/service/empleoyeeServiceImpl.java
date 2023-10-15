package service;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import model.empleoyee;


@Primary
@Service
public class empleoyeeServiceImpl implements empleoyeeService {

	ArrayList<empleoyee> listaEmpleados = (new ArrayList<>(
			Arrays.asList(new empleoyee(1, "Juanito", "juanitoarias@gmail.com", "EMP-PRO-123"),new empleoyee(2, "Jorge", "jorgito@hotmail.com", "EMP-FSJ-456"),new empleoyee(3, "Carlos", "carlitos89@hotmail.com", "EMP-PBL-789"))));

	@Override
	public ArrayList<empleoyee> muestraEmpleado() {
		return listaEmpleados;
	}

	@Override
	public empleoyee crearEmpleado(empleoyee a) {
		listaEmpleados.add(a);
		return a;
	}

	@Override
	public empleoyee modificarEmpleado(empleoyee a) {
		for (empleoyee emple : listaEmpleados) {
			if (emple.getId() == a.getId()) {
				emple.setName(a.getName());
				emple.setEmail(a.getEmail());
				return a;
			}
		}
		return null; 
	}

	@Override
	public void eliminarEmpleado(int id) {
		for (empleoyee emple : new ArrayList<>(listaEmpleados)) {
			if (emple.getId() == id) {
				listaEmpleados.remove(emple);
			}
		}
	}

}