public class Biblioteca {
    String nome;
    String morada;
    Responsavel_biblioteca responsavel_biblioteca;
    Integer id;
    public Biblioteca(String nome, String morada, Responsavel_biblioteca responsavel_biblioteca) {
        this.nome = nome;
        this.morada = morada;
        this.responsavel_biblioteca = responsavel_biblioteca;
        this.id =  getNextId();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public Integer getId() {
        return id;
    }

    public void setMorada(String morada) {
        this.morada = morada;
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
