//El código es un programa en Java que implementa el juego de "Piedra, Papel o Tijeras" para dos jugadores.
//Según los datos ingresados, se imprime el resultado de la partida

package revcode4;

import java.util.Scanner; //Falta de import para scanner

public class Codigo4 {
	
    //Falta public static void
	public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //Falta de System in
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //Jugador 2* en vez de jugador 1 de nuevo
    //Scanner s2 = new Scanner(); Uso del mismo scanner
    String j2 = s.nextLine();
    
    s.close(); //Cierre del scanner, se coloca a este nivel para evitar el SuppressWarnings(resource)
    
    //Comparación de strings con el método equals
    if (j1.equals(j2)) {
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals("tijeras")) {
            g = 1;
          }
          break; //Falta de breaks

        case "papel":
          if (j2.equals("piedra")) {
            g = 1;
          } //Falta de cierre de case
          break;
          
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
        	System.out.println("Entrada no válida.");
            return; // Falta de statement default
      }
      
      System.out.println("Gana el jugador " + g);
    }
      
      }
}