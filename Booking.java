package busreservation;
import java.util.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking{
	static String passengerName;
	static int busNo;
	static Date date;
	Scanner sc=new Scanner(System.in);
	//while the passenger starts booking get the passenger details
	Booking() throws ParseException{
		System.out.println("Enter Passenger Name: ");
		passengerName = sc.next();
		System.out.println("Enter the Bus No");
		busNo = sc.nextInt();
		System.out.println("Enter the Date(dd-mm-yy)");
		String dataobj=sc.next();
		SimpleDateFormat dataformat = new SimpleDateFormat("dd-MM-yyy");
		date = dataformat.parse(dataobj);
	}
		
		boolean isavailable() throws SQLException{
			
			BusDAO busdao=new BusDAO();
			BookingDAO bookingdao=new BookingDAO();
			int totalcapacity = busdao.getcapacity(busNo);
			
			int totalBooking=bookingdao.gettotalabooking(busNo,date);
			
			return totalBooking<totalcapacity;
			
		}
	
}
