public class LivrosEntrega {
    String estado;
    Livro livro;
    Entrega entrega;
    Integer id;
    Integer nlivros;
    public LivrosEntrega( Livro livro, Entrega entrega,Integer nlivros) {
        this.estado = "por enviar";
        this.livro = livro;
        this.entrega = entrega;
        this.id =  getNextId();
        this.nlivros =nlivros;
    }

    public Integer getId() {
        return id;
    }
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public Integer getNlivros() {
        return nlivros;
    }

    public void setNlivros(Integer nlivros) {
        this.nlivros = nlivros;
    }

    protected static int index = 0;

    protected static int getNextId() {
        return ++index;
    }
}
