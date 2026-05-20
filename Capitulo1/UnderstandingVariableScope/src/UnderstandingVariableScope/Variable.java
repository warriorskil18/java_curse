package UnderstandingVariableScope;

public class Variable {
	
	/*
	 * Hasta aqui hemnos aprendido cuando una variable local es declarada en un metodo.cuantas variables locales se ven en el siguiente ejemplo
	 *   
	 */
	
	public void eat(int picesOfCheese) {
		int bitesOfCheese = 1;
	}
	
	/*
	 * Hay 2 variables en este metodo. bitesOfCheese es declarado dentro del metodo. piecesOfCheese es un parámetro del método y también es local al método. 
	 * Ambas variables tienen un ambito local al metodo, lo quie significa que no pueden utilizarse fuera de el.
	 * Las variables locales nunca pueden tener un ambito mayor que el del metodo que se definen
	 * 
	 * Sin embargo pueden tener una clase menor:
	 */
	
	public void eatIfHungry(boolean hungry) {
		if(hungry) {
			int bitesOfCheese = 1;
		}
		//bitesOfCheese esto queda fuera del alcance aqui
		//System.out.println(bitesOfCheese); //No compila
		
	}
		/*
		 * hungry tiene un alcance de todo el metodo pero bitesOfCheese tiene un alcance menor. Solo esta disponible para su uso en la instruccion del if
		 * porque se declara dentro de este
		 * 
		 * Cuando se ve un conjunbto de llaves { } en el codigo, significa que has entrado en un nuevo bloque de codigo.
		 * Cuando hay varios bloques, se relacionan adentreo hacia afuera, en este caso el bloque de la instruccion if comienza en la linea 23 y termina en la 25
		 * El bloque del metodo comienza en la linea 22 y termina en la 29, como la variable bitesOfCheese se declara en el bloque del if su alcance se
		 * limita a ese bloque
		 * 
		 */
	
	public void eatIfHungry2(boolean hungry) {
		if(hungry) {
			int bitesOfCheese = 1;
			{
				boolean teenyBit = true;
				System.out.println(bitesOfCheese);
			}
		}
		//System.out.println(teenyBit);//No compila
	}
	
	/*
	 * 
	 */
	
	public void eatMore(boolean hungry, int amountOfFood) {
		int roomInBelly = 5;
		if(hungry) {
			boolean timeToEat = true;
			while (amountOfFood > 0) {
				int amountEaten = 2;
				roomInBelly = roomInBelly - amountEaten;
				amountOfFood = amountOfFood - amountEaten;
				
			}
		}
		System.out.println(amountOfFood);
	}
	
	
	
	
	


}
