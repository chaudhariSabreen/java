package ddl_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Table_Creation {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/project1";
		String driver = "com.mysql.cj.jdbc.Driver";
		String create="CREATE TABLE `project1`.`employee` (`emp_id` INT NOT NULL,`f_name` CHAR(45) NOT NULL,`l_name` CHAR(45) NOT NULL, `department` CHAR(45) NOT NULL,`salary` DECIMAL(12,2) NOT NULL,PRIMARY KEY(`emp_id`), UNIQUE INDEX `emp_id_UNIQUE` (`emp_id` ASC) VISIBLE);";
		Connection con=null;
		Statement stmt=null;
		try {
			Class.forName(driver);
			System.out.println("Driver Loaded...");
			con=DriverManager.getConnection(url,"root","password");
			System.out.println("Connection established succesfully ...");
			stmt=con.createStatement();
			System.out.println("Statement created succesfully ...");
			stmt.execute(create);
			System.out.println("Table created");

		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}	


	}

}
