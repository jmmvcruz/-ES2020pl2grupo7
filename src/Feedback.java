public class Feedback {
    Integer valor;
    String comentario;
   Entrega entrega;
    Responsavel_biblioteca responsavel_biblioteca;
    Integer id;
    public Feedback(Integer valor, String comentario, Entrega entrega, Responsavel_biblioteca responsavel_biblioteca) {
        this.valor = valor;
        this.comentario = comentario;
        this.entrega = entrega;
        this.responsavel_biblioteca = responsavel_biblioteca;
        this.id =  getNextId();
    }

    public Integer getId() {
        return id;
    }
    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public Responsavel_biblioteca getResponsavel_biblioteca() {
        return responsavel_biblioteca;
    }

    public void setResponsavel_biblioteca(Responsavel_biblioteca responsavel_biblioteca) {
        this.responsavel_biblioteca = responsavel_biblioteca;
    }
    protected static int index = 0;

    protected static int getNextId() {
        return ++index;
    }
}

