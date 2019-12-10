import java.util.Scanner;

public class Numero5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementacionNumero5 calculadora = new ImplementacionNumero5();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Ingrese el numero 1 " );

		int numero1 = sc.nextInt();
		

		System.out.print("Ingrese el numero 2 " );

		int numero2 = sc.nextInt();
		
		
		int suma = calculadora.suma(numero1, numero2);
		int resta = calculadora.resta(numero1, numero2);
		int mult = calculadora.multiplicacion(numero1, numero2);
		float div = calculadora.division(numero1, numero2);
		
		System.out.println("Resultados: \n" + "Suma: " +  suma + "\nResta: " + resta + 
				"\nDivision: " + div + "\nMultiplicacion: " + mult);
		

		/*
		 * Crear una interfaz de Java (en su propio paquete) que defina las cuatro
		 * operaciones aritmeticas suma, resta, multiplicacion y division usando 2
		 * numeros enteros. Enseguida, crear una clase de Java que implemente dicha
		 * interfaz (en un paquete diferente) que permita llevar a cabo estas
		 * operaciones.
		 * 
		 */

	}
	
	

}
