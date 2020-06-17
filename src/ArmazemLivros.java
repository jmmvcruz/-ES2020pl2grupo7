public class ArmazemLivros {
    Livro livro;
    Integer quantidade;
    Integer id;
    public ArmazemLivros(Livro livro, Integer quantidade) {
        this.id =  getNextId();
        this.livro = livro;
        this.quantidade = quantidade;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Integer getId() {
        return id;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    protected static int index = 0;

    protected static int getNextId() {
        return ++index;
    }
}
