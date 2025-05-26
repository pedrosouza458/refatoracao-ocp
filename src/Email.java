public class Email extends Notificador {
    private String emailRemetente;
    private String emailDestino;
    private String assunto;

    public Email(String mensagem, String emailRemetente, String emailDestino, String assunto) {
        super(mensagem);
        this.emailRemetente = emailRemetente;
        this.emailDestino = emailDestino;
        this.assunto = assunto;
    }

    public String getEmailRemetente() {
        return emailRemetente;
    }

    public void setEmailRemetente(String emailRemetente) {
        this.emailRemetente = emailRemetente;
    }

    public String getEmailDestino() {
        return emailDestino;
    }

    public void setEmailDestino(String emailDestino) {
        this.emailDestino = emailDestino;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getMensagem(){
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando notificação via Email");
    }
}
