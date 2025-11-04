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

        /* Filhos se comportando como o pai */

        Notificacao notif = new NotificacaoSms("Fulano","1234567890","Testando",3);
        
        notif.exibirInformacoesRemetente();
        notif.enviar();

        Priorizavel objPriorizavel = new NotificacaoSms(
            "Ciclano","123457890","Novo teste",2);

        objPriorizavel.definirPrioridade(0);

    }
}

