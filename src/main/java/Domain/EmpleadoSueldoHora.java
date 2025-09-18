package Domain;

public class EmpleadoSueldoHora extends Empleado {

    private int precioHora;
    private int horasTrabajadas;

    public EmpleadoSueldoHora(String nombre, String apellido, int edad, int precioHora, int horasTrabajadas) {
        // Llamamos al constructor padre con salario 0, porque lo calculamos después
        super(nombre, apellido, edad, 0);

        if (nombre == null || nombre.isEmpty() || apellido == null || apellido.isEmpty() || edad <= 0) {
            throw new IllegalArgumentException("Error: datos inválidos");
        }

        this.precioHora = precioHora;
        this.horasTrabajadas = horasTrabajadas;

        // Calculamos salario en base a los valores recibidos
        calcularSalario(this.precioHora, this.horasTrabajadas);
    }

    @Override
    public int calcularSalario(int precioHora, int horasTrabajadas) {
        int salario = precioHora * horasTrabajadas;
        setSalario(salario);
        return salario;
    }

    public int getPrecioHora() {
        return precioHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
}