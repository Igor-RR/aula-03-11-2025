package application;

import lombok.Getter;
import lombok.Setter;
import lombok.AccessLevel;

@Getter
@Setter
public class NotificacaoEmail extends Notificacao {

    private String destinatario;
    private String assunto;
    private String corpo;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private String nivelPrioridade;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private boolean estaArquivado;

    public NotificacaoEmail(
        String remetente, String destinatario, String assunto,
        String corpo, String nivelPrioridade
    ){
        super(remetente);
        this.destinatario = destinatario;
        this.assunto = assunto;
        this.corpo = corpo;
        this.nivelPrioridade = nivelPrioridade;
        this.estaArquivado = false;

    }

    @Override
    public void enviar(){
        System.out.println("Enviando E-mail(Prioridade " + this.nivelPrioridade + " ) para " + this.destinatario);
    }

    @Override
    public void registrarLog(){
        System.out.println("Registrado");
    }

}
