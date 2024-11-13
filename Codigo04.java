package org.generation.codigoDeOtros;


import java.util.Scanner;

public class Codigo04 {
	//import Scanner
	
	Scanner s = new Scanner(System.in);
    
    
    //se declara el main method
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    
    	//Se agrga ln a print para corregir	
    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    //se cambia jugador 1 por jugador 2
    System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    //se elimina un scanner para evitar redundancia
    String j2 = s.nextLine();
    
    //se agrega .equals() ya que no se puede usar == para comparar strings
    if (j1.equals(j2)) {
      
    //se agrega ln a print
    	System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals("tijeras")) {
            g = 1;
          }
          //se agrega un break
          break; 
        case "papel":
          if (j2.equals("piedra")) {
            g = 1;
          }
          break;
          //se agrega break
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
        	 System.out.println("Entrada no válida.");
      }
      System.out.println("Gana el jugador " + g);
    }
    }
}

