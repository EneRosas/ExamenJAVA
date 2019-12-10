import java.util.Scanner;

public class Numero2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese el primer numero");

		int numero1 = sc.nextInt();

		System.out.print("Ingrese el segundo numero");

		int numero2 = sc.nextInt();

		if (!(numero1 > 21 && numero2 > 21)) {
			if (numero1 < 21)
				System.out.println(numero1 + " ");

			if (numero2 < 21)
				System.out.println(numero2);

		} else {
			System.out.println(0);
		}

	}

}
