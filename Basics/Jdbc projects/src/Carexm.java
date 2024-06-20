import java.sql.*;
import java.util.Scanner;
public class Carexm {
	public static void main(String[] args) {
		
			String path = "oracle.jdbc.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521/xe";
			String un ="System";
			String pwd = "12345";
			Connection con=null;
			PreparedStatement pstm=null;
			
			String qurey ="insert into car values( ?, ?)";
			Statement stm=null;
			String querry = "create table car(brand varchar(20), cost number)";
			try {
				Class.forName(path);
			  System.out.println("Driver *is loaded sucsessfully");
			  con =  DriverManager.getConnection(url ,un ,pwd );
			  System.out.println("Connection is estblishes sucessfully");
			  stm=con.createStatement();
			  stm.executeUpdate(querry);
			  Scanner scan =new Scanner(System.in);
			 
			  System.out.print("Enter the car brand");
			  String brand =scan.nextLine();

			  System.out.print("Enter the car cost");
			  int cost =scan.nextInt();
			  pstm=con.prepareStatement(qurey);
			  pstm.setString(1, brand);
			  pstm.setInt(2, cost);
			  
			  System.out.println("Querry has been executed");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			  
			  

	}
}