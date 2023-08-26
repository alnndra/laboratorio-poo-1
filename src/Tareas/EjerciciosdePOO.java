package Tareas;

public class EjerciciosdePOO {

	private static final double INFINITY = 0;

	public static void main(String[] args) {

	        // Suma de enteros
	        int suma1 = 1000000000 + 1000000000;
	        int suma2 = 2000000000 + 1000000000;
	        
	        System.out.println("Suma 1: " + suma1);
	        System.out.println("Suma 2: " + suma2); 
	        
	        System.out.println("-------------------------------------------------");	        
	        // División de enteros
	        int division1 = 28 / 10;
	        int division2 = -28 / 10;
	        int division3 = 1 / 2;
	        int division4 = 999999 / 1000000;
	        
	        System.out.println("División 1: " + division1); // Resultado: 2
	        System.out.println("División 2: " + division2); // Resultado: -2
	        System.out.println("División 3: " + division3); // Resultado: 0
	        System.out.println("División 4: " + division4); // Resultado: 0
	        
	        System.out.println("-------------------------------------------------");	        
	        
	        // Módulo (%)
	        int modulo1 = 7 % 3;
	        int modulo2 = -7 % 3;
	        int modulo3 = 7 % -3;
	        
	        System.out.println("Módulo 1: " + modulo1); // Resultado: 1
	        System.out.println("Módulo 2: " + modulo2); // Resultado: -1
	        System.out.println("Módulo 3: " + modulo3); // Resultado: 1
	        
	        
	        System.out.println("-------------------------------------------------");        
	        
	        //Imprime numero del 1 al 70
	        for (int k = 1; k <= 70; k++)
	        	System.out.println(k);
	                
	        System.out.println("-------------------------------------------------");
	        try {
	        	System.out.println("Inicializando la variable n1 con el valor máximo de enteros +1");
	        	// Almacenemos el valor Integer.MAX_VALUE + 1
	        	int n1 = Integer.MAX_VALUE + 1;
	        	// Imprimir el valor resultante
	        	System.out.println("El número es = " + n1);
	        	} catch (Exception e) {
	                    System.out.println(e);
	                }
	        System.out.println("-------------------------------------------------");
	        System.out.println("E");

	        {
	            double resultado1 = 2.5 / 0.0;
	            double resultado2 = -2.5 / 0.0;
	            double resultado3 = 0.0 / 0.0;
	            double resultado4 = INFINITY * 0.0;

	            System.out.println("2.5 / 0.0 = " + resultado1); 
	            System.out.println("-2.5 / 0.0 = " + resultado2); 
	            System.out.println("0.0 / 0.0 = " + resultado3); 
	            System.out.println("Infinity * 0.0 = " + resultado4);
	            
		        System.out.println("-------------------------------------------------");

				System.out.println("-------------------------------------------------");
				System.out.println("EL VALOR DE LAS CONSTANTES ES:");
		        System.out.println(Double.POSITIVE_INFINITY);
		        System.out.println(Double.NEGATIVE_INFINITY);
		        System.out.println(Double.NaN);
		        System.out.println(Double.MAX_VALUE);
		        System.out.println(Double.MIN_VALUE);
	        }
	            
	    
	    

	        

	        

	    
	}

}
