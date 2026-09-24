public class Main {
    public static void main(String[] args) {
        Mensaje m = new MensajeEmail();
        m.enviar();
        m.enviar("ana@correo.com");
        m.enviar("luis@correo.com", 3);
    }
}
