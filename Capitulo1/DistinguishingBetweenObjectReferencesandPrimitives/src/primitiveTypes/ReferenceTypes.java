package primitiveTypes;

public class ReferenceTypes {
	/*
	 * Java applications contiene dos tipos de datos: tipos primitivos y tipos de referencia
	 * 
	 * Java cuenta con ocho tipo de datos integrados, estos son conocidos como tipos primitivos, estos datos cosntituyen los componentes basicos
	 * de los objetos java
	 * 
	 * 
	 * ------------------------------------------------------------------------------------------------------------
	 * keyword		Type							Example
	 * ------------------------------------------------------------------------------------------------------------
	 * boolean		true or false					true
	 * byte			8-bit integral value			123
	 * short		16-bit integral value			123
	 * int			32-bit integral value			123
	 * long			64-bit integral value			123
	 * float		32-bit floating-point value		123.45f
	 * double 		64-bit floating-point value		123.456
	 * char			16-bit unicode value			'a'
	 * 
	 * 
	 * Float y double se usan para puntos flotantes (decimales)
	 * un float requiere una letra "f" despues del numero para que java sepa que es un float
	 * byte, short, int y long se usan para numeros sin puntos decimales (enteros)
	 * 
	 * 
	 */
	 public static void main(String[] args) {

		 System.out.println(Integer.MAX_VALUE);
		 
		 /*
		  * Cualquer numero que este presente se la llama literal y por defecto java determina que se define un numero entero int
		  * en el siguiente ejempo el numero que se determina es mayor que el que cabe en un numero entero
		  */
		 
		// long max = 3123456789; // DOES NOT COMPILE
		 
		 /*
		  * Java indica que el numero esta fuera de rango, lo cual es correcto, sin embargo no se dispone de un entero
		  * como solucion se añade la letra L al numero
		  */
		 
		 long max = 3123456789L; //ahora java sabe que es un long
		 
		 //Recordemos que se tiene que poner en mayuscula ya que la l parece un 1
		 
		 //La ultima cosa que necesitamos sabero acerca de literales numericas es que puedes usar guines bajos en los numeros para que sean mas faciles de leer:
		 
		 int million1 = 1000000;
		 int million2 = 1_000_000;
		 
		 /*
		  * Preferimos leer la segunda opción porque los ceros no se juntan. Puedes añadir guiones bajos en cualquier lugar, excepto al principio de un literal,
		  *  al final de un literal, justo antes de un punto decimal o justo después de un punto decimal. Veamos algunos ejemplos:
		  * 
		  */
		 
	//	 double notAtStart = _1000.00; // DOES NOT COMPILE
	// 	 double notAtEnd = 1000.00_; // DOES NOT COMPILE
	//	 double notByDecimal = 1000_.00; // DOES NOT COMPILE
		 double annoyingButLegal = 1_00_0.0_0; // this one compiles
		 
		 
	}

}
