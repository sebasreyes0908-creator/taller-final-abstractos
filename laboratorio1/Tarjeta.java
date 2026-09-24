public class Tarjeta {

    public static final String BANCO = "Banco Central";

    // numero y titular no cambian nunca, por eso son final
    private final String numero;
    private final String titular;
    // el saldo si cambia con el tiempo, no es final
    private double saldo;

    public Tarjeta(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo = saldo + monto;
    }

    public void mostrar() {
        System.out.println(BANCO + " - " + numero + " - " + titular + " - saldo: " + saldo);
    }

    // Reto extra: este metodo no compila porque numero es final
    // error: cannot assign a value to final variable numero
    // public void cambiarNumero(String nuevoNumero) {
    //     this.numero = nuevoNumero;
    // }
}
