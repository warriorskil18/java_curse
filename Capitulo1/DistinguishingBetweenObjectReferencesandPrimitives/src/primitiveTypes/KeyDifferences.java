package primitiveTypes;

public class KeyDifferences {

	/*
	 * Los datos primitivos y tipos referencias tienen diferencias
	 * 
	 * Los tipos referencia se les puede asignar tipo null
	 * Los primitivos generan error de compilacion
	 */
	
//	int value = null; // DOES NOT COMPILE
	String s = null;
	
	/*
	 * los tipos de referencia se pueden usar para llamar a métodos cuando no apuntan a null.
	 * Los tipos primitivos no tienen métodos declarados. En este ejemplo, podemos llamar a 
	 * un método en una referencia, ya que es de un tipo de referencia. Se puede saber que `length` es un método porque tiene paréntesis () después
	 */
	
	String reference = "hello";
	int len = reference.length();
//	int bad = len.length(); // DOES NOT COMPILE
	
	
}
