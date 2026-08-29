import java.util.ArrayList;

public class Pedido {

    private Mesa mesa;
    private ArrayList<Producto> productos;
    private boolean cerrado;

    public Pedido(Mesa mesa) {

        this.mesa = mesa;
        this.productos = new ArrayList<>();
        this.cerrado = false;
    }

    public void agregarProducto(Producto producto) {

        if (cerrado) {

            System.out.println(
                    "No se pueden agregar productos: el pedido ya esta cerrado."
            );

            return;
        }

        productos.add(producto);

        System.out.println("Producto agregado correctamente.");
    }

    public double calcularTotal() {

        double total = 0;

        for (int i = 0; i < productos.size(); i++) {

            total += productos.get(i).calcularPrecioFinal();
        }

        return total;
    }

    public void mostrarPedido() {

        System.out.println("\n===== CUENTA =====");

        System.out.println(
                "Mesa: " + mesa.getNumeroMesa()
        );

        System.out.println(
                "Mesero: " + mesa.getIdMesero()
        );

        System.out.println("--------------------------");

        if (productos.isEmpty()) {

            System.out.println(
                    "No hay productos en el pedido."
            );

        } else {

            for (int i = 0; i < productos.size(); i++) {

                Producto producto = productos.get(i);

                System.out.printf(
                        "%d. %s - Q%.2f%n",
                        i + 1,
                        producto.getNombre(),
                        producto.calcularPrecioFinal()
                );
            }
        }

        System.out.println("--------------------------");

        System.out.printf(
                "TOTAL: Q%.2f%n",
                calcularTotal()
        );

        if (cerrado) {

            System.out.println(
                    "Estado: CERRADO"
            );

        } else {

            System.out.println(
                    "Estado: ABIERTO"
            );
        }
    }

    public void cerrarPedido() {

        if (cerrado) {

            System.out.println(
                    "El pedido ya estaba cerrado."
            );

        } else {

            cerrado = true;

            System.out.println(
                    "Pedido cerrado correctamente."
            );
        }
    }

    public boolean isCerrado() {

        return cerrado;
    }

    public Mesa getMesa() {

        return mesa;
    }

    public int getCantidadProductos() {

        return productos.size();
    }
}