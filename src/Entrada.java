public class Entrada extends Producto {

    public Entrada(String nombre, String descripcion, double precio){
        super(nombre, descripcion, precio);
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio();
    }
}
