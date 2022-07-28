package dml_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert_Data {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/project1";
		String driver = "com.mysql.cj.jdbc.Driver";
		String insert="INSERT INTO `project1`.`employee`(`emp_id`,`f_name`,`l_name`,`department`,`salary`)VALUES(?,?,?,?,?)";
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			Class.forName(driver);
			System.out.println("Driver Loaded...");
			con=DriverManager.getConnection(url,"root","password");
			System.out.println("Connection established succesfully ...");
			pstmt=con.prepareStatement(insert);
			System.out.println("Statement created succesfully ...");
			for(int i=0; i<4;i++)
			{
				System.out.println("Enter Employee Id:");
				int id=s.nextInt();
				System.out.println("Enter Employee First name:");
				String fname=sc.nextLine();
				System.out.println("Enter Employee Last name:");
				String lname=sc.nextLine();
				System.out.println("Enter Department:");
				String depart=sc.nextLine();
				System.out.println("Enter Salary:");
				int sal=sc.nextInt();
				pstmt.setInt(1,id);
				pstmt.setString(2, fname);
				pstmt.setString(3, lname);
				pstmt.setString(4, depart);
				pstmt.setInt(5, sal);
				pstmt.executeUpdate();
				System.out.println("Data Entered");
			}
			

		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}	


	}

}
