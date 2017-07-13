package models;
import java.time.LocalDateTime;

public class Flight {
	//TODO
	public String flightNumber;
	public String flightSource;
	public String flightDestination;
	public LocalDateTime flightDate;
	public LocalDateTime flightTime;
	public final int[] numberOfSeats = new int[10];
		
	public Flight(String flightNumber, String flightSource, String flightDestination,
			LocalDateTime flightDate, LocalDateTime flightTime) {
		super();
		this.flightNumber = flightNumber;
		this.flightSource = flightSource;
		this.flightDestination = flightDestination;
		this.flightDate = flightDate;
		this.flightTime = flightTime;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightSource() {
		return flightSource;
	}

	public void setFlightSource(String flightSource) {
		this.flightSource = flightSource;
	}

	public String getFlightDestination() {
		return flightDestination;
	}

	public void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}

	public LocalDateTime getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(LocalDateTime flightDate) {
		this.flightDate = flightDate;
	}

	public LocalDateTime getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(LocalDateTime flightTime) {
		this.flightTime = flightTime;
	}

	public int[] getSeatNumbers() {
		return numberOfSeats;
	}
	
	@Override
	public String toString() {

		return "Flight [flightNumber=" + flightNumber + ", source=" + flightSource + "]";
	}


	
	
	
	
	

}
