import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      Agenda agenda = new Agenda();
      
      System.out.println("Quieres crear una agenda de contactos? (1=SI | 2=NO)");
      String respuesta = teclado.nextLine();
      
      if(respuesta.equals("1")){
        while(respuesta.equals("1")){
        
          System.out.println("Ingrese el nombre:");
          String nombre = teclado.nextLine();
          
          System.out.println("Ingrese el numero de telefono:");
          int telefono = teclado.nextInt();
          teclado.nextLine();
          
          System.out.println("Ingrese el email:");
          String email = teclado.nextLine();
          
          Contacto contacto = new Contacto(nombre, telefono, email);
          
          agenda.agregarContacto(contacto);
          
          System.out.println("\n// AGENDA ////////////////////////////////////");
          agenda.mostrarContactos();
          System.out.println("/////////////////////////////////////////////////");
          
          agenda.buscarContacto("Steve");
          
          System.out.println("Quieres agregar otro contacto?(1=SI | 2=NO)");
          respuesta = teclado.nextLine();
        }
        
      } else if(respuesta.equals("2")){
        System.out.println("Gracias por usar la aplicacion!");
        
      } else {
        System.out.println("Ingrese una respuesta valida... (1=SI | 2=NO)");
      }
      
      Contacto contacto1 = new Contacto("Steve", 89656756, "asta@gmial.com");
      agenda.agregarContacto(contacto1);
      agenda.eliminarContacto("Kimberly");
      agenda.mostrarContactos();
      
      teclado.close();
      
  }
}