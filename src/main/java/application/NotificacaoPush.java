package application;

public final class NotificacaoPush extends Notificacao implements Arquivavel {

    @Override
    public boolean estaArquivado() {
        return true;
    }

    @Override
    public void arquivar() {
        System.out.println("Oi");
    }

    @Override
    public void desarquivar() {
        System.out.println("Oi");
    }

}
