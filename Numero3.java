import java.util.Scanner;

public class Numero3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numero3 objeto3 = new Numero3();
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese la frase");

		String frase = sc.nextLine();

		if (!(frase.length() > 50)) {
			boolean isPalindrome = objeto3.isPalindrome(frase);

			if (isPalindrome) {
				System.out.println("Si");
			} else {
				System.out.println("No");
			}

		} else {
			System.out.println("La frase excede la cantidad de 50 caracteres");
		}

	}

	public boolean isPalindrome(String text) {
		String clean = text.replaceAll("\\s+", "").toLowerCase();
		int length = clean.length();
		int forward = 0;
		int backward = length - 1;
		while (backward > forward) {
			char forwardChar = clean.charAt(forward++);
			char backwardChar = clean.charAt(backward--);
			if (forwardChar != backwardChar)
				return false;
		}
		return true;
	}

}
