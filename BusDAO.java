package busreservation;
import java.util.*;
import java.sql.*;

public class BusDAO {

	public void displaybusinfo() throws SQLException {
		 String query = "select * from buses";
	     Connection con= Connectionpro.getConnect();
	     Statement st=con.createStatement();
	     ResultSet res=st.executeQuery(query);
	     while(res.next()) {
	    	 System.out.println("Bus No: "+res.getInt(1));
	    	 if(res.getInt(2)==0) {
	    		 System.out.println("AC: No");
	    	 }
	    	 else {
	    		 System.out.println("AC: Yes");
	    	 }
	    	 System.out.println("capacity: "+res.getInt(3));
	     }
    	 System.out.println("******************************");
	}
	public int getcapacity(int busNo) throws SQLException {
		String query = "select capacity from buses where bus_no=" +busNo;
	     Connection con= Connectionpro.getConnect();
	     Statement st=con.createStatement();
	     ResultSet res=st.executeQuery(query);
	     res.next();
	     return (res.getInt(1));
	}
	
}
