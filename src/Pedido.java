import java.util.ArrayList;

public class Pedido {
    private Mesa mesa;
    private ArrayList<Producto> productos;
    private boolean cerrado;

    public Pedido(Mesa mesa){
        this.mesa=mesa;
        this.productos=new ArrayList<>();
        this.cerrado=false;
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public double calcularTotal(){
        double total=0;

        for (int i = 0; i < productos.size(); i++) {
            total = total + productos.get(i).calcularPrecioFinal();
        }

        return total;
    }

    public void mostrarPedido(){
        System.out.println("Mesa: " + mesa.getNumeroMesa());
        System.out.println("Mesero: " + mesa.getMesero());
        System.out.println("Productos:");

        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i).getNombre() + " Q" + productos.get(i).calcularPrecioFinal());
        }

        System.out.println("Total: Q" + calcularTotal());
    }

    public void cerrarPedido(){
        cerrado=true;
    }

    public boolean getCerrado() {
        return cerrado;
    }
}
