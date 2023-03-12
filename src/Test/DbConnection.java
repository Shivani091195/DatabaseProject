package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","root");
		Statement stmt = con.createStatement();
		ResultSet result = stmt.executeQuery("select * from eproduct");
		
		while(result.next())
		{
			System.out.println("Product ID : " +result.getInt("ID"));
			System.out.println("Product Name : " +result.getString("Name"));
		}
		con.close();
	}

}
