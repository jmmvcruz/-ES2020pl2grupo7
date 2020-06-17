public class LivrosEncomenda {
    String estado;
    Livro livro;
    Encomenda encomenda;
    Integer id;
    Integer nlivros;
    public LivrosEncomenda( Livro livro, Encomenda encomenda,Integer nlivros) {
        this.estado = "por enviar";
        this.livro = livro;
        this.encomenda = encomenda;
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

    public Encomenda getEncomenda() {
        return encomenda;
    }

    public void setEncomenda(Encomenda encomenda) {
        this.encomenda = encomenda;
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
