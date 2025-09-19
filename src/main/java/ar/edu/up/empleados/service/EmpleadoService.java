package ar.edu.up.empleados.service;

import ar.edu.up.empleados.domain.EmpleadoSueldoFijo;
import ar.edu.up.empleados.dao.EmpleadoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoDao empleadoDAO;

    @Autowired
    private EmpleadoSueldoFijo empleadoSueldoFijo;

    public void crearEmpleado(String nombre, String apellido, int edad, int salario){
        empleadoSueldoFijo.setNombre(nombre);
        empleadoSueldoFijo.setApellido(apellido);
        empleadoSueldoFijo.setEdad(edad);
        empleadoSueldoFijo.setSalario(salario);

        // Guardarlo usando el DAO
        empleadoDAO.guardarEmpleado(empleadoSueldoFijo);
    }
}