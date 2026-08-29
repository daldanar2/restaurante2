public class Entrada extends Producto {

    public Entrada(String nombre, String descripcion, double precioBase) {
        super(nombre, descripcion, precioBase);
    }

    @Override
    public double calcularPrecioFinal() {

        // La entrada tiene 5% de descuento
        return getPrecioBase() * 0.95;
    }
}