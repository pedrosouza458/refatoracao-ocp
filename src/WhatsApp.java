public class WhatsApp extends Notificador {
    private String numeroRemetente;
    private String numeroDestino;

    public WhatsApp(String mensagem, String numeroRemetente, String numeroDestino) {
        super(mensagem);
        this.numeroRemetente = numeroRemetente;
        this.numeroDestino = numeroDestino;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando notificação via WhatsApp");
    }

    public String getNumeroRemetente() {
        return numeroRemetente;
    }

    public void setNumeroRemetente(String numeroRemetente) {
        this.numeroRemetente = numeroRemetente;
    }

    public String getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(String numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

}
