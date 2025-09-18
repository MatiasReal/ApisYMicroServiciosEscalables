package Service;

import Domain.EmpleadoSueldoFijo;
import DAO.EmpleadoDao;
public class EmpleadoService {

    private static final int   EDAD_MINIMA = 18;
    private EmpleadoDao empleadoDAO;

    public void crearEmpleado(String nombre, String apellido, int edad, int salario){
        EmpleadoSueldoFijo sueldoFijo = new EmpleadoSueldoFijo(nombre, apellido, edad, salario);
    }
}