public class TiendaOnline {
   public static void main(String[] args) {

       String mensajeBienvenida = "Bienvenido a nuestra tienda en línea, ";
       String mensajeConfirmacion = ", tu pedido ha sido confirmado";
       String mensajeMostrarTotal = "El total de tu compra es: $";
       String mensajeNuevoTotal = "Tu nuevo total de tu compra es: $";
      
       double precioLibro = 15.50;
       double precioCamiseta = 25.50;
       double precioPantalon = 39.50;
       double precioZapato = 59.50;
  
       String cliente1 = "Ana";
       String cliente2 = "Alex";
       String cliente3 = "Miguel";
  
       boolean pedidoConfirmadoCliente1 = true;
       boolean pedidoConfirmadoCliente2 = true;
       boolean pedidoConfirmadoCliente3 = true;
  
       System.out.println(mensajeBienvenida + cliente1); 
       if (pedidoConfirmadoCliente1 == true) {
    	   System.out.println(cliente1 + mensajeConfirmacion);
    	   System.out.println(mensajeMostrarTotal + precioPantalon);
       }
       
       System.out.println();
       
       System.out.println(mensajeBienvenida + cliente2);
       if (pedidoConfirmadoCliente2 == true) {
    	   System.out.println(cliente2 + mensajeConfirmacion);
    	   System.out.println(mensajeMostrarTotal + (precioLibro + precioZapato + precioCamiseta + precioPantalon));
    	   System.out.println(cliente2 + ", hubo un error con tu pedido");
    	   System.out.println(mensajeNuevoTotal + (precioLibro + precioZapato));
    	   
       }
       
       System.out.println();
       
       System.out.println(mensajeBienvenida + cliente3);
       if (pedidoConfirmadoCliente3 == true) {
    	   System.out.println(cliente2 + mensajeConfirmacion);
    	   System.out.println(mensajeMostrarTotal + (2 * precioZapato + precioCamiseta));
       }
   }
}   