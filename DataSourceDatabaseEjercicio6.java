
import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class DataSourceDatabaseEjercicio6 {

	private static BasicDataSource ds;

	static {
		// Data sources are provided and configured normally in Application servers
		ds = new BasicDataSource();
		// ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUsername("root");
		ds.setPassword("");
		// ds.setUrl("jdbc:mysql://localhost:3306/mydb?noAccessToProcedureBodies=true");
		ds.setUrl("jdbc:mysql://localhost:3306/mydb");
	}

	private DataSourceDatabaseEjercicio6() {

	    }

	public static Connection getConnection() {

		Connection connection = null;

		try {
			connection = ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
