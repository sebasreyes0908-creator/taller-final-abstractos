public class Vendedor extends Empleado {

    private double comision;

    public Vendedor(String cedula, String nombre, double comision) {
        super(cedula, nombre);
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return SALARIO_MINIMO + comision;
    }

    @Override
    public double calcularSalario(int horasExtra) {
        return calcularSalario() + horasExtra * VALOR_HORA_EXTRA;
    }
}
