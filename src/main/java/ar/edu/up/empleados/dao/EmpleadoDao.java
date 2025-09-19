package ar.edu.up.empleados.dao;

import ar.edu.up.empleados.domain.Empleado;
import ar.edu.up.empleados.domain.EmpleadoSueldoFijo;
import ar.edu.up.empleados.domain.EmpleadoSueldoHora;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmpleadoDao {

    EmpleadoSueldoFijo empleadosFijo;

    EmpleadoSueldoHora empleadosHora;

    List <EmpleadoSueldoFijo> empleadosSueldoFijo;

    List <EmpleadoSueldoHora> empleadosSueldoHora;

    public void guardarEmpleado(Empleado empleado) {

        if (empleado instanceof EmpleadoSueldoFijo) {
            empleadosSueldoFijo.add((EmpleadoSueldoFijo) empleado);
        } else if (empleado instanceof EmpleadoSueldoHora) {
            empleadosSueldoHora.add((EmpleadoSueldoHora) empleado);
        } else {
            throw new IllegalArgumentException("Tipo de empleado no soportado: " + empleado.getClass().getName());
        }

    }


}
