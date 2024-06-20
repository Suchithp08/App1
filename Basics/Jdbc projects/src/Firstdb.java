import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.OracleDriver;

public class Firstdb {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver loaded Succefully");
		}
		catch(SQLException e) {
			
			e.printStackTrace();
		}
	}

}
