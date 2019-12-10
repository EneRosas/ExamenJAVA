import java.util.Scanner;

public class Numero4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arreglo1 = new int[3];
		int[] arreglo2 = new int[3];
		int[] respuestas = new int[2];
		for (int i = 0; i < 3; i++) {

			System.out.print("Ingrese el numero: " + (i + 1) + "del arreglo 1 .");

			int numero = sc.nextInt();
			arreglo1[i] = numero;

			System.out.print("Ingrese el numero: " + (i + 1) + "del arreglo 2 .");

			int numero2 = sc.nextInt();
			arreglo2[i] = numero2;

		}
		respuestas[0] = arreglo1[1];
		respuestas[1] = arreglo2[1];
		System.out.println(respuestas[0] + " " + respuestas[1]);

	}

}
