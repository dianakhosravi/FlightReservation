package userInterface;

import java.io.IOException;
import models.*;
import models.reservations.*;
import models.bookingSystem.*;

import models.reservations.FlightReservationSystem;

public class Main {

	public static void main(String[] args) throws IOException {
		
		FlightReservationSystem system = new FlightReservationSystem();
		
		
		system.addAirplane(new Airplane("airplane1"));
		system.addAirplane(new Airplane("airplane2"));
		
		Customer c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11;
		
		c1 = system.addCustomer("Customer1");
		c2 = system.addCustomer("Customer2");
		c3 = system.addCustomer("Customer3");
		c4 = system.addCustomer("Customer4");
		c5 = system.addCustomer("Customer5");
		c6 = system.addCustomer("Customer6");
		c7 = system.addCustomer("Customer7");
		c8 = system.addCustomer("Customer8");
		c9 = system.addCustomer("Customer9");
		c10 = system.addCustomer("Customer10");
		c11 = system.addCustomer("Customer11");
		
		Flight f1, f2, f3, f4, f5, f6, f7, f8, f9, f10;
		
		f1 = system.createFlight("A1", "Source A", "Destination A", "20170715", "1");
		f2 = system.createFlight("A2", "Source A", "Destination A", "20170716", "1");
		f3 = system.createFlight("A3", "Source A", "Destination A", "20170717", "1");
		f4 = system.createFlight("A4", "Source A", "Destination A", "20170718", "1");
		f5 = system.createFlight("A5", "Source A", "Destination A", "20170719", "1");
		f6 = system.createFlight("B1", "Source A", "Destination A", "20170720", "1");
		f7 = system.createFlight("B2", "Source A", "Destination A", "20170721", "1");
		f8 = system.createFlight("B3", "Source A", "Destination A", "20170722", "1");
		f9 = system.createFlight("B4", "Source A", "Destination A", "20170723", "0");
		
		Ticket t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;

		t1 = system.buyTicket(c1, f1, null);
		t2 = system.buyTicket(c2, f1, null);
		t3 = system.buyTicket(c3, f1, null);
		t4 = system.buyTicket(c4, f1, null);
		t5 = system.buyTicket(c5, f1, null);
		t6 = system.buyTicket(c6, f1, null);
		t7 = system.buyTicket(c7, f1, null);
		t8 = system.buyTicket(c8, f1, null);
		t9 = system.buyTicket(c9, f1, null);
		t10 = system.buyTicket(c10, f1, null);
		t10 = system.buyTicket(c11, f1, null);


		system.start();
		
		
		

	}

}