package DaoClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoConnection {
	public static Connection provideConnection() {
		 Connection conn =null;
		 
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		 
		 String url = "jdbc:mysql://localhost:3306/HumanResource";
		 
		 try {
				conn = DriverManager.getConnection(url,"root","Satyajit799270");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		 
		 return conn;
	 }
}
