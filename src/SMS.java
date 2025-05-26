public class SMS extends Notificador {
    private String numeroRemetente;
    private String numeroDestino;

    public SMS(String numeroRemetente, String numeroDestino, String mensagem) {
        super(mensagem);
        this.numeroRemetente = numeroRemetente;
        this.numeroDestino = numeroDestino;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando notificação via SMS");
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

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
