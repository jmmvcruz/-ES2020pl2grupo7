public class Responsavel_empresa {
    String nome;
    String morada;
    Integer idade;
    Integer nif;
    Integer id;
    public Responsavel_empresa(String nome, String morada, Integer idade, Integer nif) {
        this.nome = nome;
        this.morada = morada;
        this.idade = idade;
        this.nif = nif;
        this.id =  getNextId();
    }

    public Integer getId() {
        return id;
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

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getNif() {
        return nif;
    }

    public void setNif(Integer nif) {
        this.nif = nif;
    }
    protected static int index = 0;

    protected static int getNextId() {
        return ++index;
    }
}
