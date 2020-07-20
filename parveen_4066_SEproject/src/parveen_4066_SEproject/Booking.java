package parveen_4066_SEproject;

public class Booking {

	int booking_id,booking_date;
	String booking_time;
	String seat_booked;
	public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	public int getBooking_date() {
		return booking_date;
	}
	public void setBooking_date(int booking_date) {
		this.booking_date = booking_date;
	}
	public String getBooking_time() {
		return booking_time;
	}
	public void setBooking_time(String booking_time) {
		this.booking_time = booking_time;
	}
	public String getSeat_booked() {
		return seat_booked;
	}
	public void setSeat_booked(String seat_booked) {
		this.seat_booked = seat_booked;
	}
	public Booking(int booking_id, int booking_date, String booking_time, String seat_booked) {
		super();
		this.booking_id = booking_id;
		this.booking_date = booking_date;
		this.booking_time = booking_time;
		this.seat_booked = seat_booked;
	}
	
}
