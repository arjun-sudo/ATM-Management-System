package updatedatm;

import java.sql.*;

public class ConnectionManager {
	static Connection jdbcConnection() throws Exception
	{
		String url="jdbc:mysql://localhost:3306/atm";
		String uname="root";
		String pass="";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		return con;
		
		
	}

}
