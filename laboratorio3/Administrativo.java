// Reto extra: al ser final class, ninguna clase puede heredar de Administrativo.
// Consecuencia: si en el futuro el sistema necesita un tipo especial de administrativo
// (por ejemplo un Coordinador que gane un bono), no se podra hacer "extends Administrativo";
// habria que quitar el final o crear otra clase que herede de Empleado.
public final class Administrativo extends Empleado {

    public Administrativo(String cedula, String nombre) {
        super(cedula, nombre);
    }

    @Override
    public double calcularSalario() {
        return SALARIO_MINIMO;
    }

    @Override
    public double calcularSalario(int horasExtra) {
        return calcularSalario() + horasExtra * VALOR_HORA_EXTRA;
    }
}
