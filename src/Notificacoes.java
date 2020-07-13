public class Notificacoes {
    String mensagem;
    Responsavel_biblioteca responsavel;
    Integer id;
    Responsavel_empresa responsavel_empresa;
    public Notificacoes(String mensagem, Responsavel_biblioteca responsavel,Responsavel_empresa responsavel_empresa) {
        this.mensagem = mensagem;
        this.responsavel = responsavel;
        this.responsavel_empresa= responsavel_empresa;
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

    public Responsavel_empresa getResponsavel_empresa() {
        return responsavel_empresa;
    }

    public void setResponsavel_empresa(Responsavel_empresa responsavel_empresa) {
        this.responsavel_empresa = responsavel_empresa;
    }

    protected static int index = 0;

    protected static int getNextId() {
        return ++index;
    }
}
