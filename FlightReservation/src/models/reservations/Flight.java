package models.reservations;


public class Flight {
	//TODO
	private String flightNumber;
	private String flightSource;
	private String flightDestination;
	private String flightDate;
	private Seat seats;
	Airplane a;

		
	public Flight(Airplane airplane, String flightNumber, String flightSource, String flightDestination,String flightDate) {

		a = airplane;
		this.flightNumber = flightNumber;
		this.flightSource = flightSource;
		this.flightDestination = flightDestination;
		this.flightDate = flightDate;
	
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

	public String getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}

	public Seat getSeats() {
		return seats;
	}
	
	
	public Airplane getA() {
		return a;
	}

	public void setA(Airplane a) {
		this.a = a;
	}

	@Override
	public String toString() {

		return "Flight [ Airplane=" + a + "flightNumber=" + flightNumber + ", source=" + flightSource + "]";
	}


	
	
	
	
	

}
