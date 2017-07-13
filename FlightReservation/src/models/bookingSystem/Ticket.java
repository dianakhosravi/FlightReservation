package models;
import java.time.LocalDateTime;

public class Ticket{
	//TODO
	protected Customer customer;
	protected SeatType seat;
	protected int seatNumber;
	
	private Flight flight;
	private FoodMenu food;
	

	
	public Ticket(Customer customer, Flight flight, FoodMenu food){
		this.customer = customer;
		this.flight = flight;
		this.food = food;
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

	public SeatType getSeat() {
		return seat;
	}

	public void setSeat(SeatType seat) {
		this.seat = seat;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public FoodMenu getFood() {
		return food;
	}

	public void setFood(FoodMenu food) {
		this.food = food;
	}
	

	@Override
	public String toString() {
		return "Ticket [customer=" + customer.getFirstName() + ", seatType=" + seat.ECONOMY + "]";
	}
	
	
	
	
	

}
