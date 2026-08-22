public class PlatoPrincipal extends Producto {

    public PlatoPrincipal(String nombre, String descripcion, double precio){
        super(nombre, descripcion, precio);
    }

    @Override
    public double calcularPrecioFinal() {
        double iva;
        double precioFinal;

        iva = getPrecio() * 0.12;
        precioFinal = getPrecio() + iva;

        return precioFinal;
    }
}
