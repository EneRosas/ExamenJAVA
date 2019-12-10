import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Numero6 {

	public static void main(String[] args) throws SQLException {

		Connection connection = DataSourceDatabaseEjercicio6.getConnection();

		System.out.println(connection.getMetaData().getDatabaseProductName());

		String sql = "Select * From state";
		Statement stmt = null;

		stmt = connection.createStatement();

		ResultSet rs = stmt.executeQuery(sql);

		FileOutputStream out = null;

		try {
			out = new FileOutputStream("C:\\Users\\curso\\Documents\\imputOutput\\state.txt");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		while (rs.next()) {
			String id = rs.getString("state_id");
			String description = rs.getString("description");
			String zone_id = rs.getString("shipping_zone_id");
			String lineToInsert = id + " " + description + " " + zone_id +"\n";

			byte[] lineInBytes = lineToInsert.getBytes();

			try {
				out.write(lineInBytes);
				out.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}

			System.out.println(lineToInsert);
		}
		try {
			
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		/*
		 * Genere una conexión a la base de datos mydb, lea la tabla "state" lea todos
		 * sus registros e imprimirlos en un archivo .txt llamado estados.txt
		 * 
		 * Ejemplo de salida:
		 * 
		 * 1 Aguascalientes CT 2 Baja California NW 3 Baja California Sur NW 4 Campeche
		 * SE Etc....
		 */

	}

}
