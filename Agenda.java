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
    for(Contacto contacto : agenda){
      if(contacto.getNombre().equals(nombreDeContacto)){
        agenda.remove(contacto);
        System.out.println("Contacto " + contacto.getNombre() + " eliminado");
      }
    }  
  }
  
  public void mostrarContactos(){
    for (Contacto contacto : agenda){
      System.out.println(contacto);
    }
  }
  
}