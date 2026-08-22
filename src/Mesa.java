public class Mesa {
    private int numeroMesa;
    private String mesero;

    Mesa(){

    }

    public Mesa(int numeroMesa, String mesero){
        this.numeroMesa=numeroMesa;
        this.mesero=mesero;
    }

    //GET y SET
    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public String getMesero() {
        return mesero;
    }

    public void setMesero(String mesero) {
        this.mesero = mesero;
    }
}
