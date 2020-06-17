import java.time.LocalDate;

public class Voucher {
    String estado;
    String desconto;
    LocalDate data_expiracao;
    Biblioteca biblioteca;

    Integer id;
    public Voucher(String estado, String desconto, LocalDate data_expiracao, Biblioteca biblioteca) {
        this.estado = estado;
        this.desconto = desconto;
        this.data_expiracao = data_expiracao;
        this.biblioteca = biblioteca;

        this.id =  getNextId();
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

    public String getDesconto() {
        return desconto;
    }

    public void setDesconto(String desconto) {
        this.desconto = desconto;
    }

    public LocalDate getData_expiracao() {
        return data_expiracao;
    }

    public void setData_expiracao(LocalDate data_expiracao) {
        this.data_expiracao = data_expiracao;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }


    protected static int index = 0;

    protected static int getNextId() {
        return ++index;
    }
}
