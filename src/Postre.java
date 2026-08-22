public class Postre extends Producto {

    public Postre(String nombre, String descripcion, double precio){
        super(nombre, descripcion, precio);
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio();
    }
}
