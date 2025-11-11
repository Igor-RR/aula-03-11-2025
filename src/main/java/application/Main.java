package application;
import java.util.List;
import java.util.ArrayList;

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

        objPriorizavel.definirPrioridade(6);

        objPriorizavel = new NotificacaoEmail("Beltrano", "beltrano@gmail.com", "Teste", "Olá Mundo","3");

        Arquivavel objArquivavel = new NotificacaoEmail("Marco","marco@gmail.com","Novo Teste","olá mundo","5");

        ((Notificacao) objArquivavel).enviar();

        System.out.println("============");
        List<Priorizavel> objetos = new ArrayList<Priorizavel>();

        objetos.add(objPriorizavel);
        objetos.add(new NotificacaoSms("Ciclano","3445567","Novo Teste",1));
        objetos.add(new NotificacaoSms("MARIA", "1246789", "cHUPA PALMEIRAS", 1));



    }


}

