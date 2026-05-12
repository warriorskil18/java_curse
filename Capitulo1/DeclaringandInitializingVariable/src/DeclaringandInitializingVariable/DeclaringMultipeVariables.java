package DeclaringandInitializingVariable;

public class DeclaringMultipeVariables {
	
	public static void main(String[] args) {
/*
 * Una variables es un nombre para una porcion de memoria que almacena datos
 * Cuando se declara una variable se necesita especificar su tipo y asignar un nombre
 * 
 * A continuacion se declaran dos variables una de tipo String y otra de tipo entero 
 */
	
	
	String zooName;
	int numberAnimals;
	
	/*
	 * Ahora que declaramos una variabla le asignamos un valor, a esto se le llama inicializar ina varable,
	 * para esto simplemente escribimos el nombre de la variable seguido de un signo igual ,seguido del valor deseado: 
	 */
	
	zooName = "The Best Zoo";
	numberAnimals = 100;
	
	/*
	 * Tambien se puede inicializar desde que se crea la variable tomando el siguiente codigo como ejemplo
	 * 
	 * 
	 * String zooName = "The Best Zoo";
	 * int numberAnimals = 100;
	 */
	
	/*
	 * Se pueden declarar e inicializar multiples variables en la misma linea
	 */
	
	String s1, s2;
	String s3 = "yes", s4 = "no";
	
	/*
	 * Se declaran cuatro variables de tipo String: s1, s2, s3 y s4 se pueden declarar varias variables en la misma declaracion, siempre que sean del mismo
	 * tipo.
	 * Tambien se puede inicializar cualquiera de ellas o todas directamente en la declaracion
	 * En el caso anterior se declaran 2 y se inicializan dos directo
	 * 
	 * En el siguiente codigo se declaran las 3 variables pero solo una se inicializo en este caso el i3 ya que las otras dos solo fueron declaradas
	 * mas no inicializadas
	 * 
	 */
	
	int i1, i2, i3 = 0;
	
	//otra forma de engaño seria:
	
//	int num, String value; // DOES NOT COMPILE
	
	/*
	 * En este caso no compila ya que se intenta declarar multiples variables pero de tipos diferentes en la misma instruccion
	 * La declaracion en la misma instruccion solo funciona si comparten el mismo tipo
	 * 
	 * Para ver si se entendio intentaremos averiguar cuales de las siguientes declaraciones son "Legal", "Valido" y "compila"
	 * 
	 * 
	 */
	
/*
  	boolean b1, b2;             Legal
	String s1 = "1", s2;		Valido
	double d1, double d2;		No Compila				
	int i1; int i2;				Valido				
	int i3; i4;					Legal					error no compila ya que i4 se esta omitiendo el tipo
	
	
	La primera instrucción es válida. Declara dos variables sin inicializarlas. 
	La segunda instrucción también es válida. Declara dos variables e inicializa solo una de ellas.
	La tercera instrucción no es válida. Java no permite declarar dos tipos diferentes en la misma instrucción. ¡Un momento! Las variables d1 y d2 son del 
	mismo tipo. Ambas son de tipo double. Aunque esto sea cierto, sigue sin estar permitido. Si se quieren declarar varias variables en la misma instrucción, 
	deben compartir la misma declaración de tipo y no repetirla. `double d1, d2;` habría sido válido.
	La cuarta instrucción es válida. Aunque `int` aparece dos veces, cada una está en una instrucción separada. En Java, las instrucciones se separan 
	con un punto y coma (;). Resulta que hay dos instrucciones completamente diferentes en la misma línea. La quinta instrucción no es válida. De nuevo, 
	tenemos dos instrucciones completamente diferentes en la misma línea. La segunda no es una declaración válida porque omite el tipo. Cuando veas un 
	punto y coma mal colocado en el examen, imagina que el código está en líneas separadas y piensa si se compila de esa manera. En este caso, tenemos 
	lo siguiente:
	
	int i1;
	int i2;
	int i3;
	i4;// DOES NOT COMPILE
	*/
	
	
	
	
	
}
	
}
