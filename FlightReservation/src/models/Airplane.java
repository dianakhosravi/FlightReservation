package models;
import java.util.HashMap;
import java.util.Map;

public class Airplane {
	

	private Map<Integer,Seat> seats = new HashMap<Integer,Seat>();
	
	public Airplane() {
		fillThePlaneWithSeats();
	}
	
	private void fillThePlaneWithSeats(){
		for(int i=1;i<6;i++)
			seats.put(i, new Seat(20000d));	
		for(int i=6;i<11;i++)
			seats.put(i, new Seat(5000d));
	}

	public Map<Integer, Seat> getSeats() {
		return seats;
	}

	public void setSeats(Map<Integer, Seat> seats) {
		this.seats = seats;
	}
	
	
	
	
	
	
}
