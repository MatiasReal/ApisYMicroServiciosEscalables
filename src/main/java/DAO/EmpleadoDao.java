package DAO;

import Domain.Empleado;
import Domain.EmpleadoSueldoFijo;
import Domain.EmpleadoSueldoHora;

import java.util.List;

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
