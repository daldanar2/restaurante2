public class Postre extends Producto {

    public Postre(String nombre, String descripcion, double precioBase) {
        super(nombre, descripcion, precioBase);
    }

    @Override
    public double calcularPrecioFinal() {

        // El postre tiene 8% adicional
        return getPrecioBase() * 1.08;
    }
}