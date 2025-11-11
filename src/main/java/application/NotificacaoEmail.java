package application;

import lombok.Getter;
import lombok.Setter;
import lombok.AccessLevel;

@Getter
@Setter
public class NotificacaoEmail extends Notificacao implements Priorizavel, Arquivavel {

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

    @Override
    public int obterNivelPrioridade(){
        return 1;
    }

    @Override
    public void definirPrioridade(int nivel){
        System.out.println("Oi");
    }

    @Override
    public boolean estaArquivado(){
        return this.estaArquivado;
    }
    @Override
    public void arquivar(){
        if (!this.estaArquivado){
            this.estaArquivado = true;
            System.out.println("E-mail arquivado");
        }
        else{
            System.out.println("E-mal já está arquivado");
        }
    }

    @Override
    public void desarquivar(){
        if (estaArquivado){
            this.estaArquivado = false;
            System.out.println("E-mail desarquivado");
        }
        else{
            System.out.println("E-mail não arquivado");
        }

    }

}
