import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Restaurante restaurante = new Restaurante();

        System.out.println("===== SISTEMA DE RESTAURANTE =====");

        System.out.print("Ingrese numero de mesa: ");
        int numeroMesa = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Ingrese nombre del mesero: ");
        String mesero = teclado.nextLine();

        Mesa mesa1 = new Mesa(numeroMesa, mesero);

        Pedido pedido1 = new Pedido(mesa1);

        // ENTRADA
        System.out.println("\n--- ENTRADA ---");

        System.out.print("Nombre de la entrada: ");
        String nombreEntrada = teclado.nextLine();

        System.out.print("Descripcion: ");
        String descripcionEntrada = teclado.nextLine();

        System.out.print("Precio: Q");
        double precioEntrada = teclado.nextDouble();
        teclado.nextLine();

        Entrada entrada1 = new Entrada(
                nombreEntrada,
                descripcionEntrada,
                precioEntrada
        );

        // PLATO PRINCIPAL
        System.out.println("\n--- PLATO PRINCIPAL ---");

        System.out.print("Nombre del plato principal: ");
        String nombrePlato = teclado.nextLine();

        System.out.print("Descripcion: ");
        String descripcionPlato = teclado.nextLine();

        System.out.print("Precio: Q");
        double precioPlato = teclado.nextDouble();
        teclado.nextLine();

        PlatoPrincipal plato1 = new PlatoPrincipal(
                nombrePlato,
                descripcionPlato,
                precioPlato
        );

        // POSTRE
        System.out.println("\n--- POSTRE ---");

        System.out.print("Nombre del postre: ");
        String nombrePostre = teclado.nextLine();

        System.out.print("Descripcion: ");
        String descripcionPostre = teclado.nextLine();

        System.out.print("Precio: Q");
        double precioPostre = teclado.nextDouble();

        Postre postre1 = new Postre(
                nombrePostre,
                descripcionPostre,
                precioPostre
        );

        // AGREGAR PRODUCTOS AL PEDIDO
        pedido1.agregarProducto(entrada1);
        pedido1.agregarProducto(plato1);
        pedido1.agregarProducto(postre1);

        // MOSTRAR PEDIDO
        System.out.println("\n===== CUENTA =====");
        pedido1.mostrarPedido();

        // CERRAR Y GUARDAR
        pedido1.cerrarPedido();
        restaurante.guardarPedido(pedido1);

        System.out.println("\n===== VENTAS =====");
        restaurante.mostrarVentas();

        teclado.close();
    }
}