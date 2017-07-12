import java.time.LocalDateTime;

public class Ticket extends FlightInformation {
	//TODO
	protected Customer customer;
	protected seatType seat;
	protected int seatNumber;
	
	public Ticket(String flightNumber, String flightSource, String flightDestination,
			LocalDateTime flightDate, LocalDateTime flightTime, Customer customer,
			seatType seat, int seatNumber) {
		super(flightNumber, flightSource, flightDestination, flightDate, flightTime);
		this.customer = customer;
		this.seatNumber = seatNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public seatType getSeat() {
		return seat;
	}

	public void setSeat(seatType seat) {
		this.seat = seat;
	}
	

	
	
	
	
	

}
