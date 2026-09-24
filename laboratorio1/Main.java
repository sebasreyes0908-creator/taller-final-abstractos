public class Main {
    public static void main(String[] args) {
        Tarjeta tarjeta = new Tarjeta("1234-5678", "Sebastian Reyes", 50000);
        tarjeta.mostrar();
        tarjeta.depositar(20000);
        tarjeta.mostrar();
    }
}
