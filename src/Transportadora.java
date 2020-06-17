public class Transportadora {
    String nome;
    String sede;
    String contacto;
    Integer id;
    public Transportadora(String nome, String sede, String contacto) {
        this.nome = nome;
        this.sede = sede;
        this.contacto = contacto;
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

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    protected static int index = 0;

    protected static int getNextId() {
        return ++index;
    }
}
