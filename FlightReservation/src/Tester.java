
public class Tester {

	
	public static void main(String[] args) {
		FoodMenu first = new FoodMenu(FoodClass.FIRST_CLASS);
		FoodMenu economy = new FoodMenu(FoodClass.ECONOMY_CLASS);
		
		for(Food f : first.getFoodList()){
			System.out.println(f.getFoodName() + " " + f.getFoodPrice());
		
		}
		
		
		
	}
	
	
}
