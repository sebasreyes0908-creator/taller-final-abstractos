public abstract class Mensaje {

    public abstract void enviar();

    public abstract void enviar(String destinatario);

    public abstract void enviar(String destinatario, int prioridad);
}
