public abstract class Notificador {
    protected String mensagem;

    public Notificador(String mensagem){
        this.mensagem = mensagem;
    }

    public abstract void enviar();
}
