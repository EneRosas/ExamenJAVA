import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Numero7 {

	public static void main(String[] args) throws IOException {
		
		Numero7 instancia = new Numero7();
		instancia.obtenerPersonaje("a1234");;
		
	}

	public void obtenerPersonaje(String llave) throws IOException {
		Map<String, String> usuarios = new HashMap<String, String>();
		usuarios.put("a1234", "Steve Jobs");
		usuarios.put("a1235", "Scott McNealy");
		usuarios.put("a1236", "Jeff Bezos");
		usuarios.put("a1237", "Larry llison");
		usuarios.put("a1238", "Bill Gates");

		String usuarioEspecifico = usuarios.get(llave);

		FileOutputStream out = null;

		out = new FileOutputStream("C:\\Users\\curso\\Documents\\imputOutput\\personaje.txt");

		byte[] lineInBytes = usuarioEspecifico.getBytes();

		out.write(lineInBytes);
		out.flush();
		out.close();

	}

}
