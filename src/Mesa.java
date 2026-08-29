public class Mesa {

    private int numeroMesa;
    private String idMesero;

    public Mesa(int numeroMesa, String idMesero) {
        this.numeroMesa = numeroMesa;
        this.idMesero = idMesero;
    }

    // GET y SET

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public String getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(String idMesero) {
        this.idMesero = idMesero;
    }
}