
public class ImplementacionNumero5 implements InterfaceNumero5 {

	@Override
	public int suma(int numero1, int numero2) {
		int resultado = numero1 + numero2;
		return resultado;
	}

	@Override
	public int resta(int numero1, int numero2) {
		int resultado = numero1 - numero2;
		return resultado;
	}

	@Override
	public int multiplicacion(int numero1, int numero2) {
		int resultado = numero1 * numero2;
		return resultado;
	}

	@Override
	public float division(int numero1, int numero2) {
		float resultado = numero1 / numero2;
		return resultado;
	}

}
