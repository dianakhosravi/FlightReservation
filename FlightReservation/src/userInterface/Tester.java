package models;

import java.time.LocalDateTime;
import java.util.*;

public class Tester {

	
	public static void main(String[] args) {
		FoodMenu first = new FoodMenu(SeatType.FIRSTCLASS);
		FoodMenu economy = new FoodMenu(SeatType.ECONOMY);
		
		
		Customer c1 = new Customer("Di", "123");
		Customer c2 = new Customer("E", "1234");
		
		FoodMenu ff1 = new FoodMenu(SeatType.ECONOMY);
		FoodMenu ff2 = new FoodMenu(SeatType.FIRSTCLASS);
	
		LocalDateTime l = LocalDateTime();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		Flight f1 = new Flight("ABC123", "Stockholm", "London", l, l);
		Ticket t1 = new Ticket(c1 , f1, ff1);
		
		System.out.println(f1.toString());
		System.out.println(ff1.toString());
		System.out.println(t1.toString());
		
	}

	private static LocalDateTime LocalDateTime() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
