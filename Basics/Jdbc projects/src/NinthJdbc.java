
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class NinthJdbc {
	
		public static void main(String[] args) {
			
			String path = "oracle.jdbc.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521/xe";
			String un ="System";
			String pwd = "12345";
			Connection con= null;
			Statement stm= null;
			ResultSet rs = null;
			String query = "select * from Student";
			try {
				Class.forName(path);
				  System.out.println("Driver is loaded sucsessfully");
				  con =  DriverManager.getConnection(url ,un ,pwd );
				  System.out.println("Connection is estblishes sucessfully");
				  stm = con.createStatement();
				  rs = stm.executeQuery(query);
				  while(rs.next() == true)
				  {
					  int Id = rs.getInt(1);
					  String name = rs.getString(2);
					  int m1 = rs.getInt(3);
					  int m2 = rs.getInt(4);
					  int m3 = rs.getInt(5);
					  
					  System.out.println(Id +" "+name+" "+m1+" "+m2+" "+m3);
					 
				  }
			}
			catch (Exception e) {
				e.printStackTrace();
			}		
			
		}
}