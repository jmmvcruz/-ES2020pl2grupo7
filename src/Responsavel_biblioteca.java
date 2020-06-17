public class Responsavel_biblioteca {
    String nome;
    Integer idade;
    Integer nif;
    String email;
    Integer id;
    public Responsavel_biblioteca(String nome, Integer idade, Integer nif, String email) {
        this.nome = nome;
        this.idade = idade;
        this.nif = nif;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    protected static int index = 0;

    protected static int getNextId() {
        return ++index;
    }
}
