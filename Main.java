import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      Agenda agenda = new Agenda();

      String respuesta = "";
      
      System.out.println("Selecciona la opcion que quieres realizar:");
      System.out.println("""
        1 = Agregar un contacto
        2 = Buscar un contacto
        3 = Eliminar un contacto
        4 = Mostrar lista de contactos
        5 = Salir  
      """);

      respuesta = teclado.nextLine();
      
      while(!respuesta.equals("5")){
        if(respuesta.equals("1")){
        
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
  
          
          System.out.println("Quieres agregar otro contacto?(1=SI | 6=NO)");
          respuesta = teclado.nextLine();
          
        } else if(respuesta.equals("2")){
            System.out.println("Ingresa el nombre del contacto que deseas buscar:");
            String nombre = teclado.nextLine();
            agenda.buscarContacto(nombre);
  
            System.out.println("------------------------");
            System.out.println("Quieres buscar otro contacto? (2= SI | 6= NO)");
            respuesta = teclado.nextLine();
  
        } else if(respuesta.equals("3")) {
          System.out.println("Ingrese el nombre del usuario que desea borrar:");
          String nombre = teclado.nextLine();
          if(agenda.contains(nombre)){
            agenda.eliminarContacto(nombre);
          } else {
            System.out.println("No se encontro ningun contacto con el nombre " + nombre);
            respuesta = "3";
          }
          System.out.println("Deseas borrar otro contacto? (3=SI | 6=NO)");
          respuesta = teclado.nextLine();

        } else if(respuesta.equals("4")){
          agenda.mostrarContactos();
          respuesta = "6";

        } else if(respuesta.equals("5")){
            System.out.println("Gracias por usar la aplicacion!");
          
        } else if(respuesta.equals("6")){
            System.out.println("Selecciona la opcion que quieres realizar:");
            System.out.println("""
              1 = Agregar un contacto
              2 = Buscar un contacto
              3 = Eliminar un contacto
              4 = Mostrar lista de contactos
              5 = Salir  
            """);
  
            respuesta = teclado.nextLine();
  
        } else {
          System.out.println("Ingrese una respuesta valida...");
          respuesta = "6";
        }
      }

      teclado.close();
      
  }
}