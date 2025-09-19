package ar.edu.up.empleados.domain;

import org.springframework.stereotype.Component;

@Component
public class EmpleadoSueldoFijo extends Empleado {

    public EmpleadoSueldoFijo(String nombre, String apellido, int edad, int salario) {
        super(nombre, apellido, edad, salario);
        if (nombre == null || nombre.isEmpty() || apellido == null || apellido.isEmpty() || edad <= 0) {
            throw new IllegalArgumentException("Error: datos inválidos");
        }
    }

    @Override
    public int calcularSalario(int uno, int dos) {
        // Para sueldo fijo, simplemente devolvemos el salario asignado
        return getSalario();
    }
}