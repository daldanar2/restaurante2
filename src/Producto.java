public abstract class Producto {
    private String nombre;
    private String descripcion;
    private double precio;

    Producto(){

    }

    public Producto(String nombre, String descripcion, double precio){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.precio=precio;
    }

    public abstract double calcularPrecioFinal();

    //GET y SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
