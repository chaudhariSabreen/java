package loadDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverLoad {

	public static void main(String[] args) {


		String url = "jdbc:mysql://localhost:3306/project1";
		String driver = "com.mysql.cj.jdbc.Driver";
	
		
		Connection con=null;
		
		try {
			Class.forName(driver);
			System.out.println("Driver Loaded...");
			
			
			con=DriverManager.getConnection(url,"root","password");
			System.out.println("Connection established succesfully ...");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
