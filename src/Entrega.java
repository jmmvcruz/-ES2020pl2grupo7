import java.time.LocalDate;

public class Entrega {
    LocalDate dataenvio;
    String estado;

    Integer NlivrosEntreges;
    LocalDate dataEntrege;
    Transportadora transportadora;
    Encomenda encomenda;


    Integer id;


    public Entrega(Encomenda encomenda, Transportadora transportadora) {
        this.dataenvio = LocalDate.now();
        this.estado = "enviado";
        this.encomenda=encomenda;
        this.NlivrosEntreges = 0;

        this.transportadora = transportadora;

        this.id = getNextId();
    }
    public Integer getId() {
        return id;
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

    public Transportadora getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
    }




    public Encomenda getEncomenda() {
        return encomenda;
    }

    public void setEncomenda(Encomenda encomenda) {
        this.encomenda = encomenda;
    }

    protected static int index = 0;

    protected static int getNextId() {
        return ++index;
    }
}
