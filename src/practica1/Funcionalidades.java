package practica1;


/**
 * @author Luis Martin Portillo.
 * @version 1.1.1
 */

public class Funcionalidades {
	
	/** 
	 * @author Luis Martin Portillo.
	 * @param entrada - Array Datos de Entrada.
	 * @return int - numero datos guardados
	 * @version 1.1.1
	 */

	
	public static int contarGuardados(String[] entrada){
		
		int i=0;
		
		do {
			if(entrada[i] != null) {
				i++;
			}
		}while(entrada[i] != null && i<20);
			
		return i;
	}
	
	
	/** 
	 * @author Luis Martin Portillo.
	 * @param entrada - dato de entrada por el que se busca.
	 * @param entradaArray - array donde se busca el dato.
	 * @return int - posicion dentro del array
	 * @version 1.1.1
	 */
	
	public static int buscarArrayString(String entrada, String[] entradaArray) {
		
		boolean encontrado = false;
		boolean finArray = false;
		int posicion = -1;
		int i = 0;
		
		do {
			
			if (entradaArray[i] != null) {
				if (entradaArray[i].equalsIgnoreCase(entrada)){
					posicion= i;
					encontrado = true;
				}
			}else {
				finArray = true;
			}
			
			i++;
			
		}while(!encontrado && !finArray);

		return posicion;
	}
	
	/** 
	 * @author Luis Martin Portillo.
	 * @param entrada - dato de entrada por el que se busca.
	 * @param entradaArray - array donde se busca el dato.
	 * @return int - posicion dentro del array
	 * @version 1.1.1
	 */
	
	public static int buscarArrayInt(int entrada, int[] entradaArray) {
		
		boolean encontrado = false;
		boolean finArray = false;
		int posicion = -1;
		int i = 0;
		
		do {
			if (entradaArray[i] != 0){
				if (entradaArray[i] == entrada){
					encontrado = true;
					posicion = i;
				}
			}else {
				finArray = true;
			}
			i++;
			
		}while(!encontrado && !finArray);
		
		return posicion;
	}
	
	
	/** El metodo correrPosiciones agrupa los datos de los 3 arrays de entrada para que no haya posiciones vacias a partir de la posicion de entrada.
	 * @author Luis Martin Portillo.
	 * @param posicionOrigen - posicion de la lista a partir de la cual se empieza a agrupar.
	 * @param arrayEntrada1 - array1 a agrupar.
	 * @param arrayEntrada2 - array2 a agrupar.
	 * @param arrayEntrada3 - array3 a agrupar.
	 * @version 1.1.1
	 */
	
	public static void correrPosiciones(int posicionOrigen,String[] arrayEntrada1,int[] arrayEntrada2,String[] arrayEntrada3) {
		
		boolean finDatos = false;
		
		int i = posicionOrigen;		
		int siguiente = i + 1;
		
		
		if (arrayEntrada1[siguiente] == null) {
			finDatos = true;
		}
		
		if (!finDatos) {
			
			do {
				
				arrayEntrada1[i] = arrayEntrada1[siguiente];
				arrayEntrada2[i] = arrayEntrada2[siguiente];
				arrayEntrada3[i] = arrayEntrada3[siguiente];
				
				arrayEntrada1[siguiente] = arrayEntrada1[siguiente+1];
				arrayEntrada2[siguiente] = arrayEntrada2[siguiente+1];
				arrayEntrada3[siguiente] = arrayEntrada3[siguiente+1];
				
				i++;
				siguiente ++;
				
				if (arrayEntrada1[siguiente] == null) {
					finDatos = true;
				}
				
			}while(!finDatos);
		}
		
	}
	
	/** 
	 * @author Luis Martin Portillo.
	 * @param entrada - dato de entrada por el que se busca.
	 * @param entradaArray - array donde se busca el dato.
	 * @return int[] - cada una de las posiciones que ocupa el dato de entrada dentro del Array
	 * @version 1.1.1
	 */
	
	public static int[] obtenerPosiciones(int entrada, int[] entradaArray) {
		
		int[] resultado = new int[20];
		boolean finArray = false;
		int i = 0;
		int j = 0;
		
		do {
			if (entradaArray[i] != 0) {
				
				if (entradaArray[i] == entrada) {
					resultado[j] = i;
					j++;
				}
				
				i++;
			}else {

				finArray = true;
			}	
			
		}while(!finArray);
		
		return resultado;
		
	}
	
	/** 
	 * @author Luis Martin Portillo.
	 * @param entradaArray - array con datos a sumar.
	 * @return int - suma de todos los elementos el array.
	 * @version 1.1.1
	 */
	
	public static int sumaInt( int[] entradaArray) {
		
		int sumaInt = 0;
		boolean finArray = false;
		int i = 0;
		
		
		if (entradaArray[i] <= 0){
			finArray = true;
		}
		
		while(!finArray) {
			sumaInt = sumaInt + entradaArray[i];
			i++;
			
			if (entradaArray[i] <= 0){
				finArray = true;
			}
		}
		
		return sumaInt;
	}
	
}