import java.util.Iterator;
import java.util.TreeMap;


public class Equipo {
    
      private TreeMap<String, Futbolista> equipo = new TreeMap<>();
    
      
      public void añadirJugador(String nombre, Futbolista Futbolista){
        equipo.put(nombre, Futbolista);
    }
      
    public void mostrarEquipo(Equipo Equipo){
       Iterator itr = equipo.keySet().iterator();
       while(itr.hasNext()){
            Object key = itr.next();
            System.out.println(key);
        }
    }
    
    public void eliminarJugador(String nombre){
        equipo.remove(nombre);
    }
   
    public void eliminarEquipo(){
        equipo.clear();
        System.out.println("Equipo eliminado");
    }

    public void comprobarJugador(String nombre){
        if (equipo.containsValue(nombre)==true){
            System.out.println("Ese jugador se encuentra en el equipo.");
        }else{
            System.out.println("Ese jugador no se encuentra en el equipo.");
        }
    }
    
    public void numeroJugadores(Equipo Equipo){
        System.out.println("Cantidad de jugadores: "+ equipo.size());
    }
}




















