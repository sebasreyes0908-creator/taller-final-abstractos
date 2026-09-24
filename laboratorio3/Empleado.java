public abstract class Empleado {

    public static final double SALARIO_MINIMO = 1423500;
    public static final double VALOR_HORA_EXTRA = 8000;

    protected final String cedula;
    protected String nombre;

    public Empleado(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public abstract double calcularSalario();

    public abstract double calcularSalario(int horasExtra);

    public final void mostrarCedula() {
        System.out.println("Cedula: " + cedula);
    }
}
