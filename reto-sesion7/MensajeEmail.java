public class MensajeEmail extends Mensaje {

    @Override
    public void enviar() {
        enviar("Sin destinatario", 1);
    }

    @Override
    public void enviar(String destinatario) {
        enviar(destinatario, 1);
    }

    @Override
    public void enviar(String destinatario, int prioridad) {
        System.out.println("Email enviado a " + destinatario + " (prioridad " + prioridad + ")");
    }
}
