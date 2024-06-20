import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class SixthJdbc {
	public static void main(String[] args) {
		
		String path = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String un ="System";
		String pwd = "12345";
		Connection con=null;
		Statement stm=null;
		PreparedStatement pstm =null;
		String querry = "insert into car values(? , ?)";
		try {
			Class.forName(path);
			  System.out.println("Driver *is loaded sucsessfully");
			  con =  DriverManager.getConnection(url ,un ,pwd );
			  System.out.println("Connection is estblishes sucessfully");
			 Scanner scan = new Scanner (System.in);
			 System.out.println("Enter the brand");
			 String brand= scan.next();
			 System.out.println("Enter the cost");
			 int cost = scan.nextInt();
			 pstm = con.prepareStatement(querry);
			 pstm.setString(1, brand);
			 pstm.setInt(2, cost);
			 pstm.executeUpdate();
			 System.out.println("Querry has been executed");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
			 
		}
			
		}