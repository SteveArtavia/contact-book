import java.util.List;
import java.util.ArrayList;

public class Agenda{
  private List<Contacto> agenda = new ArrayList<>();
  
  public void agregarContacto(Contacto contacto){
    agenda.add(contacto);
    System.out.println("El contacto " + contacto.getNombre() + " se agrego con exito");
  }
  
  public void buscarContacto(String nombreDeContacto){
    for(Contacto contacto : agenda) {
      if(contacto.getNombre().equals(nombreDeContacto)){
        System.out.println("Contacto encontrado:");
        System.out.println(contacto);
        return;
      }
    }
    System.out.println("No se encontro ningun contacto");
  }
  
  public void eliminarContacto(String nombreDeContacto){
    boolean eliminado = agenda.removeIf(contacto -> contacto.getNombre().equals(nombreDeContacto));
    if (eliminado) {
        System.out.println("Contacto " + nombreDeContacto + " eliminado");
    } else {
        System.out.println("No se encontró ningún contacto con el nombre " + nombreDeContacto);
    }
  }
  
  public void mostrarContactos(){
    System.out.println("---------------------------------");
    System.out.println("AGENDA DE CONTACTOS\n");
    for (Contacto contacto : agenda){
      System.out.println(contacto + "\n");
    }
    System.out.println("---------------------------------");
  }

  public boolean contains(String nombreDeContacto){
    for(Contacto contacto : agenda){
      if(contacto.getNombre().equals(nombreDeContacto)){
        return true;
      }
    }
    return false;
  }
  
}