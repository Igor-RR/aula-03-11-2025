package application;

import lombok.Getter;
import lombok.Setter;
import lombok.AccessLevel;

@Getter
@Setter
public class NotificacaoSms extends Notificacao {

    private String numeroTelefone;
    private String mensagem;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private int nivelPrioridade;

    public NotificacaoSms(
        String remetente,
        String numeroTelefone,
        String mensagem, 
        int prioridade)
        {

        super(remetente);
        this.numeroTelefone = numeroTelefone;
        this.mensagem = mensagem;
        this.nivelPrioridade = prioridade;

    }

    @Override
    public void enviar(){
        System.out.println("Enviando SMS (Prioridade" + this.nivelPrioridade + ") para " + this.numeroTelefone);
    }

    public void registrarLog(){
        System.out.println(
            "[LOG] SMS (" +
            "Prioridade" +
            this.nivelPrioridade +
            ") para " +
            this.numeroTelefone);
    }


}
