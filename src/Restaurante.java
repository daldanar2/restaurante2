import java.util.ArrayList;

public class Restaurante {

    private ArrayList<Pedido> pedidos;

    public Restaurante() {

        pedidos = new ArrayList<>();
    }

    public void guardarPedido(Pedido pedido) {

        if (!pedido.isCerrado()) {

            System.out.println(
                    "No se puede guardar un pedido que aun esta abierto."
            );

            return;
        }

        if (!pedidos.contains(pedido)) {

            pedidos.add(pedido);
        }
    }

    public double calcularVentas() {

        double total = 0;

        for (int i = 0; i < pedidos.size(); i++) {

            total += pedidos.get(i).calcularTotal();
        }

        return total;
    }

    public void mostrarHistorialVentas() {

        System.out.println(
                "\n===== HISTORIAL DE VENTAS ====="
        );

        if (pedidos.isEmpty()) {

            System.out.println(
                    "Todavia no hay ventas registradas."
            );

            return;
        }

        for (int i = 0; i < pedidos.size(); i++) {

            Pedido pedido = pedidos.get(i);

            System.out.printf(
                    "Pedido %d | Mesa %d | Mesero %s | Productos: %d | Total: Q%.2f%n",
                    i + 1,
                    pedido.getMesa().getNumeroMesa(),
                    pedido.getMesa().getIdMesero(),
                    pedido.getCantidadProductos(),
                    pedido.calcularTotal()
            );
        }

        System.out.printf(
                "TOTAL VENDIDO DEL DIA: Q%.2f%n",
                calcularVentas()
        );
    }

    public void mostrarVentas() {

        System.out.printf(
                "Ventas del dia: Q%.2f%n",
                calcularVentas()
        );
    }
}