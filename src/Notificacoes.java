public class Notificacoes {
    String mensagem;
    Responsavel_biblioteca responsavel;
    Integer id;

    public Notificacoes(String mensagem, Responsavel_biblioteca responsavel) {
        this.mensagem = mensagem;
        this.responsavel = responsavel;
        this.id =  getNextId();
    }

    public Integer getId() {
        return id;
    }
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Responsavel_biblioteca getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel_biblioteca responsavel) {
        this.responsavel = responsavel;
    }

    protected static int index = 0;

    protected static int getNextId() {
        return ++index;
    }
}
