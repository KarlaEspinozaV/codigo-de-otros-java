package org.generation.codigoDeOtros;

import java.util.Scanner;

public class Codigo05 {
// se agrega la definicion public
	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in); // se agrega el input del usuario como argumento
		 System.out.println("Introduzca un número: "); //se agregan comillas dobles para homogenizar el codigo
		    String ni = s.nextLine();
		    int c = Integer.parseInt(ni); //Se parsea el String para convertirlo a una variable de tipo int
		    int original = c;  // Guardamos el valor original para mostrarlo después
		    
		    int afo = 0;
		    int noAfo = 0;
		    
		    // la comparacion es incorrecta ya que se debe comparar c que almacena el numero entero obtenido de ni
		    // se cambia ni por c
		    while (c > 0) {
			  int digito = (int)(c % 10);
		      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++;
		      } else {
				noAfo++;
		      } // falta llave de cierre
			  c /= 10; // se cambia ni por c y se divide entre 10
		    }
		    
		    //verisficamos si el numero es afortunado
		    //agregamos el numero original almacenado al string de output
		    if (afo > noAfo) {
	            System.out.println("El " + original + " es un número afortunado.");
	        } else {
	            System.out.println("El " + original + " no es un número afortunado.");
	        }
		  }
	 //se elimina llave de mas
}
