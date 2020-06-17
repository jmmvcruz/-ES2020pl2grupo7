import java.time.LocalDate;

public class Livro {
    String titulo;
    Integer ISBN;
    String autor;
    LocalDate datalacamento;
    Integer id;
    Integer preco;

    public Livro(String titulo, Integer ISBN, String autor, LocalDate datalacamento, Integer preco) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
        this.datalacamento = datalacamento;
        this.preco = preco;
        this.id =  getNextId();
    }
    public Integer getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getDatalacamento() {
        return datalacamento;
    }

    public void setDatalacamento(LocalDate datalacamento) {
        this.datalacamento = datalacamento;
    }

    public Integer getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    protected static int index = 0;

    protected static int getNextId() {
        return ++index;
    }
}
