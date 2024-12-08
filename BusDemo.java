package busreservation;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.*;
public class BusDemo {

	public static void main(String[] args) throws ParseException, SQLException {
		Scanner sc=new Scanner(System.in);
		
		
		BusDAO busdao=new BusDAO();
		BookingDAO bookingdao=new BookingDAO();

		
		try {
			busdao.displaybusinfo();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

		int userOption;
		do {
		System.out.println("Enter 1 to book and 2 to exit");
		userOption= sc.nextInt();
		if(userOption==1){
			Booking bookings=new Booking();
			if(bookings.isavailable()) {
				bookingdao.addbooking();
				System.out.println("Your booking is confirmed");
			}
			else {
				System.out.println("Sorry for the inconvinience the bus is full try other bus or date");
			}
		}
		else {
			System.out.println("Thanks for visiting");
		}
		}while(userOption==1);
		sc.close();
	}
  
}
