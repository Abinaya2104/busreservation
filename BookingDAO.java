package busreservation;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.sql.*;

public class BookingDAO {
	public int gettotalabooking(int busNo,Date date) throws SQLException {
		 String query = "select count(*) from booking where bus_no=? and travel_date=?";
	     Connection con= Connectionpro.getConnect();
	     PreparedStatement pst=con.prepareStatement(query);
	     java.sql.Date sqldate=new java.sql.Date(date.getTime());

	     pst.setInt(1, busNo);
	     pst.setDate(2, sqldate);
	     
	     ResultSet res=pst.executeQuery();
	     res.next();
	     return (res.getInt(1));
	     
	}
	public void addbooking() throws SQLException {
		 String query = "insert into booking(passenger_name,bus_no,travel_date) values(?,?,?)";
	     Connection con= Connectionpro.getConnect();
	     PreparedStatement pst=con.prepareStatement(query);
	     
	     String pname= Booking.passengerName;
	     int busNo=Booking.busNo;
	     Date date=Booking.date;
	     java.sql.Date sqldate=new java.sql.Date(date.getTime());
	     
	     pst.setString(1, pname);
	     pst.setInt(2, busNo);
	     pst.setDate(3, sqldate);
	     
	     pst.executeUpdate();
		
	}

}
