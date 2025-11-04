package application;

public class Main {
    public static void main(String[] args) {
        NotificacaoSms notifSMS = new NotificacaoSms("Marco","12345678","Mensagem de Teste",1);
        
        notifSMS.exibirInformacoesRemetente();
        notifSMS.enviar();
        notifSMS.registrarLog();
        notifSMS.definirPrioridade(8);
        notifSMS.obterNivelPrioridade();
        notifSMS.definirPrioridade(0);
    }
}

