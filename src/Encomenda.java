import java.time.LocalDate;

public class Encomenda {
    LocalDate dataenvio;
    String estado;
    Integer nlivros;
    Integer NlivrosEntreges;
    LocalDate dataEntrege;

    Biblioteca biblioteca;
    Voucher voucher;
    Integer preco;
    Integer id;
    public Encomenda( Integer nlivros, Biblioteca biblioteca, Voucher voucher, Integer preco) {

        this.estado = "por processar";
        this.nlivros = nlivros;
        this.NlivrosEntreges = 0;

        this.biblioteca = biblioteca;
        this.voucher = voucher;
        this.preco = preco;
        this.id =  getNextId();
    }

    public LocalDate getDataenvio() {
        return dataenvio;
    }

    public void setDataenvio(LocalDate dataenvio) {
        this.dataenvio = dataenvio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getNlivros() {
        return nlivros;
    }
    public Integer getId() {
        return id;
    }

    public void setNlivros(Integer nlivros) {
        this.nlivros = nlivros;
    }

    public Integer getNlivrosEntreges() {
        return NlivrosEntreges;
    }

    public void setNlivrosEntreges(Integer nlivrosEntreges) {
        NlivrosEntreges = nlivrosEntreges;
    }

    public LocalDate getDataEntrege() {
        return dataEntrege;
    }

    public void setDataEntrege(LocalDate dataEntrege) {
        this.dataEntrege = dataEntrege;
    }




    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public Voucher getVoucher() {
        return voucher;
    }

    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
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
