package models.reservations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.*;

import models.bookingSystem.Ticket;
import models.food.Food;
import models.reservations.Airplane;
import userInterface.CLI;

public class FlightReservationSystem {

	List<Customer> allCustomers = new ArrayList<>();
	List<Flight> allFlights = new ArrayList<>();
	List<Food> allFoodReservations = new ArrayList<>();
	List<Airplane> allAirplanes = new ArrayList<>();
	List<Ticket> allTickets = new ArrayList<>();
	String source, destination, date;
	String airplaneID, flightNumber;
	String customerName;
	Customer currentCustomer; 

	void removeCustomer(String name){
		allCustomers.removeIf(s-> s.getFirstName().equals(name));
	}

	void addAirplane(Airplane airplane){
		allAirplanes.add(airplane);
	}

	Customer addCustomer(String name){

		Customer c = new Customer(name); // Add contructor with only name as a parameter.
		allCustomers.add(c);
		return c;

	}

	//Airplane airplane, String flightNumber, String flightSource, String flightDestination,String flightDate
	void createFlight(String flightNumber, String source, String destination, String date, String airplaneID){

		allFlights.add(new Flight(allAirplanes.get(Integer.parseInt(airplaneID)), flightNumber, source, destination, date));

	}

	void buyTicket(Customer customer, Flight flight, Food food){

	}


	public void start() throws IOException{

		CLI cli = new CLI();



		boolean exitProgram = false;
		
		while(!exitProgram){

			cli.printMenu();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str;
			str = br.readLine();

			str = str.toLowerCase();


			switch (str){



			case "create flight":


				//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				System.out.println("Type in the flightNumber of the flight: ");
				flightNumber = br.readLine();
				
				System.out.println("Type in the source of the flight: ");
				source = br.readLine();

				System.out.println("Type in the destination of the flight: ");
				try {
					destination = br.readLine();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("Type in the date of the flight, format yy-mm-dd: ");
				try {
					date = br.readLine();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("Type in the ID of the airplane: ");
				try {
					airplaneID = br.readLine();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				createFlight(source, destination, date, airplaneID, flightNumber);

				break;

			case "add aeroplane": 
				//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String airPlaneName;
				System.out.println("Type in a name of the airplan: ");
				airPlaneName = br.readLine();
				allAirplanes.add(new Airplane(airPlaneName));
				break;

			case "new customer": 

				//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Type in the name of the customer: ");
				customerName = br.readLine();
				currentCustomer = addCustomer(customerName);

				break;
			case "buy ticket": 
				//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				//String source, destination, date;
				//String flightNumber;  //, customerName;

				System.out.println("Type in the flight number: ");
				flightNumber = br.readLine();
				System.out.println("Type in the customer name: ");
				customerName = br.readLine();

				buyTicket(currentCustomer, allFlights.get(Integer.parseInt(flightNumber)), null);


				break;
			case "reserve food": 


				break;
			case "print all customers": 
				allCustomers.forEach(s-> System.out.println(s));

				break;

			case "print all flights":
				allFlights.forEach(s-> System.out.println(s));
				break;

			case "print all aeroplanes": 
				allAirplanes.forEach(s-> System.out.println(s));
				break;

			case "print statistics":

				break;

			case "economy summary":

				break;

			case "delete ticket":


				break;

			case "Remove customer": 
				System.out.println("Which customer do you want to remove? ");
				customerName = br.readLine();
				removeCustomer(customerName);
				break;

			case "exit": 
				exitProgram = true;
				System.out.println("Program will exit ...");
				break;


			default: 

				break;


			}	
		}


	}




}