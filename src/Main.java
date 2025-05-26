public class Main {
    public static void main(String[] args) {
        Email email = new Email("Mensagem via email", "remetente@gmail.com", "destino@gmail.com", "Assunto");
        SMS sms = new SMS("Mensagem via SMS", "912341234", "923452345");
        WhatsApp whatsApp = new WhatsApp("Mensagem via WhatsApp", "912341234", "923452345");

        email.enviar();
        sms.enviar();
        whatsApp.enviar();
    }
}