import java.util.ArrayList;

public class Restaurante {
    private ArrayList<Pedido> pedidos;

    public Restaurante(){
        pedidos=new ArrayList<>();
    }

    public void guardarPedido(Pedido pedido){
        if(pedido.getCerrado()==true){
            pedidos.add(pedido);
        }
    }

    public double calcularVentas(){
        double total=0;

        for (int i = 0; i < pedidos.size(); i++) {
            total = total + pedidos.get(i).calcularTotal();
        }

        return total;
    }

    public void mostrarVentas(){
        System.out.println("Ventas del dia: Q" + calcularVentas());
    }
}
