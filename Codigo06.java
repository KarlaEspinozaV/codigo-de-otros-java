package org.generation.codigoDeOtros;

import java.util.Scanner;

public class Codigo06 {

	public static void main(String[] args) {
		int[] n = new int[20]; //Declaracion incorrecta del arreglo, se agrega new
		Scanner scanner = new Scanner(System.in); // se define el objeto scanner para usarlo despues
		// se agrega un signo de + faltante a las condicionesd del bucle
	    
		for (int i = 0; i < 20; i++) {
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.println(n[i] + " "); //se agrega informacion faltante al comando para imprimir: out y ln a print
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? "); //se agrega informacion faltante al comando para imprimir: t a println
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    //se modifica int opcion = Integer.parseInt(System.console().readLine(); por una opcion mas legible  
	    int opcion = scanner.nextInt();

	    int multiplo = (opcion == 1) ? 5 : 7; // las condiciones se modifican ya que no eran correctas

	    //se sustituye foreach por for para poder ser usado en java
	    //se intercambia char por int parap poder iterar sobre los int ya declarados
	    for(int e : n) {
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      } else {  //se agrega una llave faltante antes de else
	        System.out.println(e + " "); //se modifica System.in por System.out y se agrega un ln faltante a ln
	      }
	    }
	}
	
}
