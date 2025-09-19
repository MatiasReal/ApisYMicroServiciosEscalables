package ar.edu.up.empleados.domain;


import org.springframework.stereotype.Component;

@Component
public class EmpleadoSueldoHora extends Empleado {

    private int precioHora;
    private int horasTrabajadas;

    public EmpleadoSueldoHora(String nombre, String apellido, int edad, int precioHora, int horasTrabajadas) {
        super(nombre, apellido, edad, 0); // Salario inicial 0, se calculará después

        validarDatos(nombre, apellido, edad, precioHora, horasTrabajadas);

        this.precioHora = precioHora;
        this.horasTrabajadas = horasTrabajadas;

        // Calcular salario inicial
        calcularSalario();
    }

    private void validarDatos(String nombre, String apellido, int edad, int precioHora, int horasTrabajadas) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
        if (apellido == null || apellido.trim().isEmpty()) {
            throw new IllegalArgumentException("El apellido no puede ser nulo o vacío");
        }
        if (edad <= 0) {
            throw new IllegalArgumentException("La edad debe ser mayor a 0");
        }
        if (precioHora <= 0) {
            throw new IllegalArgumentException("El precio por hora debe ser mayor a 0");
        }
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas trabajadas no pueden ser negativas");
        }
    }

    public int calcularSalario() {
        int salario = precioHora * horasTrabajadas;
        setSalario(salario);
        return salario;
    }

    // Método para actualizar horas trabajadas y recalcular salario
    public void actualizarHorasTrabajadas(int nuevasHoras) {
        if (nuevasHoras < 0) {
            throw new IllegalArgumentException("Las horas trabajadas no pueden ser negativas");
        }
        this.horasTrabajadas = nuevasHoras;
        calcularSalario();
    }

    // Método para actualizar precio por hora y recalcular salario
    public void actualizarPrecioHora(int nuevoPrecio) {
        if (nuevoPrecio <= 0) {
            throw new IllegalArgumentException("El precio por hora debe ser mayor a 0");
        }
        this.precioHora = nuevoPrecio;
        calcularSalario();
    }

    public int getPrecioHora() {
        return precioHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    @Override
    public String toString() {
        return String.format("%s [PrecioHora: %d, HorasTrabajadas: %d, Salario: %d]",
                super.toString(), precioHora, horasTrabajadas, getSalario());
    }

    @Override
    public int calcularSalario(int precioHora, int horasTrabajadas) {
        int salario = precioHora * horasTrabajadas;
        setSalario(salario);
        return salario;
    }
}
