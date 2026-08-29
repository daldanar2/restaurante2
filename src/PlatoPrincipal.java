public class PlatoPrincipal extends Producto {

    public PlatoPrincipal(String nombre, String descripcion, double precioBase) {
        super(nombre, descripcion, precioBase);
    }

    @Override
    public double calcularPrecioFinal() {

        // Plato principal tiene 12% adicional
        return getPrecioBase() * 1.12;
    }
}