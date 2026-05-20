package UnderstandingDefaultInitializationofVariables;

public class LocalVariables {
	
	/*
	 * Antes de poder usar una variable esta necesita in valor.
	 * Alugnos tipos de variables obtienen el valor de forma automatica, mientras otros reqioerem qie se especifique
	 * Ahora se analizara las diferencias entre los valores predeterminados para las variables locales, instancia y de clase
	 * 
	 * Una variable local es una variable definida dentro de un metodo.
	 * Las variables locales deben inicializarse antes de su uso. estas no tienen un valor predeterminado y contienen datos basura hasta que
	 * se inicializan.
	 * El compilador no permite leer un valor no inicializado. por ejemplo el siguiente codigo genera un error de compilacion:
	 * 
	 */

/*	public int notValid() {
		int y = 10;
		int x;
		int reply = x + y; //no compila
		return reply;
		
		
		 * "y" es inicializado con 10 sin embargo, como x no se inizializa antes de usarse en la expresion de la liniea 20, el compilador genera el siguiente error:
		 * 
		 * Test.java:5: variable x might not have been initialized
			int reply = x + y;
			
			
			Hasta que a x no se le asigne un valor, no puede aparecer dentro de una expresión, y el compilador
			te lo recordará con gusto. El compilador sabe que tu código controla lo que sucede
			dentro del método y se espera que inicialice valores.
			El compilador es lo suficientemente inteligente como para reconocer las variables que se han inicializado después de su
			declaración, pero antes de que se utilicen. Aquí tienes un ejemplo:
			
		 */

		public int notValid() {
			int y = 10;
			int x; //x se declara aqui
			x = 3; //y se inicializa aqui
			int reply = x + y; 
			return reply;
			
			
			/*
			 * El compilador tambien es lo suficientemente inteligente para reconocer inicializaciones mas complejas
			 * 
			 */
		}
			
			public void findAnswer(boolean check) {
				int answer;
				int onlyOneBranch;
				if(check) {
					onlyOneBranch = 1;
					answer = 1;
					}else {
						answer = 2;
					}
				System.out.println(answer);
			//	System.out.println(onlyOneBranch); // No compila
			}
			
			//Instance and Class Variables
			
			/*
			 * Se puede identificar una variable como de clase porque tiene la palabra clave "Static" antes
			 * una variables es de clase si tiene una palabra static en su declaracion
			 * Las variables de instancia y de clase no requieren inicializacion 
			 * Tan pronto se declaran se les asigna un valor predeterminado, se necesita memorizar la siguiente tabla a excepcion de la referencia char
			 * 
			 * Para simplificarlo, recuerda que el compilador, no sabe qué valor usar y, por lo tanto, busca el tipo más simple que pueda asignarle: `null`
			 * para un objeto y `0`/`false` para un tipo primitivo.
			 * 
			 * 
			 * ----------------------------------------------------------------------------
			 * Variable Type								Default Initialization Value
			 * ----------------------------------------------------------------------------
			 * boolean										false
			 * byte, short, int, long						0 (in the type´s bit-lenght)
			 * float, double								0.0 (in the type´s bit-lenght)
			 * char											\\u000 (NULL)
			 * "all object references (everything else)  	null
			 *  ---------------------------------------------------------------------------
			 * 
			 * 
			 * 
			 */
			
			
			
			
	
}
