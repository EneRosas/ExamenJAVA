import java.util.Scanner;

public class Numero1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese un numero");

		int numero = sc.nextInt();
		int serie;

		if (numero >= 2 && numero <= 20) {
			for (int i = 1; i <= 10; i++) {
				serie = i * numero;
				System.out.println(numero + " x " + i + " = " + serie);
			}
		} else {
			System.out.println("el numero no cumple con las especificaciones");
		}

	}

}
