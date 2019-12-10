import java.util.List;
import java.util.ArrayList;

public class Numero8 {

	public static void main(String[] args) {

		List<String> paises = new ArrayList<>();

		paises.add("Sudafrica");
		paises.add("Egipto");
		paises.add("Turquia");
		paises.add("Rusia");
		paises.add("China");
		paises.add("India");

		List<String> paises2 = new ArrayList<>();
		paises2.add("Francia");
		paises2.add("México");
		paises2.add("Australia");
		paises2.add("Italia");
		paises2.add("Argentina");
		paises2.add("Brasil");

		List<String> c = new ArrayList<String>(paises);
		c.addAll(paises2);

		c.sort(null);

		for (int i = 0; i < c.size(); i++) {
			System.out.println(i + 1 + " " + c.get(i));
		}

	}

}
