package Chapter1;
import java.util.Random;//import le dice donde encontrar Random
//import java.util.*; // imports java.util.Random aparte de otras cosas

public class ImportExample {
	
	/*
	 * Understanding Package Declarations and Imports
	 */

	public static void main(String[] args) {
		
		Random r = new Random(); //Esto no compila por que necesita la libreria correcta
		System.out.println(r.nextInt(10)); //Imprime un numero al azar entre 0 y 9
		
	
/*import java.lang.System;
import java.lang.*;
import java.util.Random;
import java.util.*;
public class ImportExample {
public static void main(String[] args) {
Random r = new Random();
System.out.println(r.nextInt(10));
}
}
*Estos son import redundante ya que al tener el importe en general tambien se
*llaman imports especificos teniendo los dos el mismo directorio
*/


		
		
		}
		
	}