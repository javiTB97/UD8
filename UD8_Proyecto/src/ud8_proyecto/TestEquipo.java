import java.util.Scanner;

public class TestEquipo {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String dorsal;
        String nombre;
        String posicion;
        int opcion;
         boolean salir = false;
      Equipo e1 = new Equipo();
      Futbolista f1 = new Futbolista();
      Futbolista f2 = new Futbolista();
      Futbolista f3 = new Futbolista(); /*Creado desde GitHub*/
      
     
      
      while (!salir) {
 
            System.out.println("1. Añadir jugador");
            System.out.println("2. Mostrar equipo");
            System.out.println("3. Buscar jugador");
            System.out.println("4. Eliminar jugador");
            System.out.println("5. Eliminar equipo");
            System.out.println("6. Numero de jugadores");
            System.out.println("7. Salir");
            
                System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();
 
                switch (opcion) {
                    case 1:
 
                        
                        System.out.println("Escribe el dorsal del jugador");
                        dorsal = sc.nextLine();
                        dorsal = sc.nextLine();
 
                        System.out.println("Escribe el nombre del jugador");
                        nombre = sc.nextLine();
                        
                        System.out.println("Escribe la posicion del jugador");
                        posicion = sc.nextLine();
 
                        
                        f1 = new Futbolista(dorsal, nombre, posicion);
 
                        e1.añadirJugador(nombre, f1);
 
                        break;

                    case 2:
 
                        e1.mostrarEquipo(e1);
 
                        break;
                        
                         case 3:
 
                        
                        System.out.println("Introduce el nombre del jugador que quieres buscar");
                            nombre=sc.nextLine();
                            nombre=sc.nextLine();

                            e1.comprobarJugador(nombre);
 
                        break;
                        
                        case 4:
                        System.out.println("Escribe el nombre del jugador que quieres eliminar");
                        nombre=sc.nextLine();
                        nombre=sc.nextLine();

                        e1.eliminarJugador(nombre);
                        break;
                        
                         case 5:
                             
                             e1.eliminarEquipo();
                             
                         case 6:
                            
                             e1.numeroJugadores(e1);
                        
                        case 7:
                        salir = true;
                        break;
                        
                        default:
                        System.out.println("Solo números entre 1 y 7");
                }
 
          
 
        }
    }
    
}






















