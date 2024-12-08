package busreservation;
import java.sql.*;

public class Connectionpro {
	private static final String url="jdbc:mysql://localhost:3306/busproject";
	private static final String user = "root";
	private static final String pass="Sowmiabi2104.";
	
	public static Connection getConnect() throws SQLException{
		return DriverManager.getConnection(url, user, pass);
	}
	

}
