import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Restaurante restaurante = new Restaurante();

        Pedido pedidoActual = null;

        int opcion;

        do {

            System.out.println(
                    "\n===== SISTEMA DE RESTAURANTE ====="
            );

            System.out.println(
                    "1. Crear nuevo pedido"
            );

            System.out.println(
                    "2. Agregar producto al pedido"
            );

            System.out.println(
                    "3. Generar cuenta"
            );

            System.out.println(
                    "4. Cerrar pedido"
            );

            System.out.println(
                    "5. Mostrar historial de ventas"
            );

            System.out.println(
                    "6. Mostrar total de ventas del dia"
            );

            System.out.println(
                    "0. Salir"
            );

            System.out.print(
                    "Seleccione una opcion: "
            );

            opcion = teclado.nextInt();

            teclado.nextLine();

            switch (opcion) {

                case 1:

                    if (
                            pedidoActual != null
                                    &&
                                    !pedidoActual.isCerrado()
                    ) {

                        System.out.println(
                                "Primero debe cerrar el pedido actual."
                        );

                        break;
                    }

                    System.out.print(
                            "Numero de mesa: "
                    );

                    int numeroMesa =
                            teclado.nextInt();

                    teclado.nextLine();

                    System.out.print(
                            "Identificador del mesero: "
                    );

                    String idMesero =
                            teclado.nextLine();

                    Mesa mesa =
                            new Mesa(
                                    numeroMesa,
                                    idMesero
                            );

                    pedidoActual =
                            new Pedido(mesa);

                    System.out.println(
                            "Pedido creado correctamente."
                    );

                    break;


                case 2:

                    if (
                            pedidoActual == null
                                    ||
                                    pedidoActual.isCerrado()
                    ) {

                        System.out.println(
                                "Debe crear un pedido abierto primero."
                        );

                        break;
                    }

                    agregarProducto(
                            teclado,
                            pedidoActual
                    );

                    break;


                case 3:

                    if (pedidoActual == null) {

                        System.out.println(
                                "No hay un pedido actual."
                        );

                    } else {

                        pedidoActual.mostrarPedido();
                    }

                    break;


                case 4:

                    if (pedidoActual == null) {

                        System.out.println(
                                "No hay un pedido para cerrar."
                        );

                    } else if (
                            pedidoActual.isCerrado()
                    ) {

                        System.out.println(
                                "El pedido ya esta cerrado."
                        );

                    } else {

                        pedidoActual.cerrarPedido();

                        restaurante.guardarPedido(
                                pedidoActual
                        );
                    }

                    break;


                case 5:

                    restaurante
                            .mostrarHistorialVentas();

                    break;


                case 6:

                    restaurante.mostrarVentas();

                    break;


                case 0:

                    System.out.println(
                            "Programa finalizado."
                    );

                    break;


                default:

                    System.out.println(
                            "Opcion invalida."
                    );
            }

        } while (opcion != 0);


        teclado.close();
    }


    public static void agregarProducto(
            Scanner teclado,
            Pedido pedido
    ) {

        System.out.println(
                "\n--- TIPO DE PRODUCTO ---"
        );

        System.out.println(
                "1. Entrada"
        );

        System.out.println(
                "2. Plato principal"
        );

        System.out.println(
                "3. Postre"
        );

        System.out.print(
                "Seleccione: "
        );

        int tipo = teclado.nextInt();

        teclado.nextLine();


        if (
                tipo < 1
                        ||
                        tipo > 3
        ) {

            System.out.println(
                    "Tipo de producto invalido."
            );

            return;
        }


        System.out.print(
                "Nombre: "
        );

        String nombre =
                teclado.nextLine();


        System.out.print(
                "Descripcion: "
        );

        String descripcion =
                teclado.nextLine();


        System.out.print(
                "Precio base: Q"
        );

        double precio =
                teclado.nextDouble();

        teclado.nextLine();


        Producto producto;


        switch (tipo) {

            case 1:

                producto =
                        new Entrada(
                                nombre,
                                descripcion,
                                precio
                        );

                break;


            case 2:

                producto =
                        new PlatoPrincipal(
                                nombre,
                                descripcion,
                                precio
                        );

                break;


            default:

                producto =
                        new Postre(
                                nombre,
                                descripcion,
                                precio
                        );

                break;
        }


        pedido.agregarProducto(
                producto
        );
    }
}1