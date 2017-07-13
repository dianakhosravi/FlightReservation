package models.food;
import models.food.Food;
import models.reservations.SeatType;

public class Tester {

	
	public static void main(String[] args) {
		FoodMenu first = new FoodMenu(SeatType.FIRSTCLASS);
		FoodMenu economy = new FoodMenu(SeatType.ECONOMY);
		
		for(Food f : first.getFoodList()){
			System.out.println(f.getFoodName() + " " + f.getFoodPrice());
		
		}
		
		
		
	}
	
	
}
