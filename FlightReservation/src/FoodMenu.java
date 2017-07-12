import java.util.ArrayList;
import java.util.List;

// Constructor
public class FoodMenu {

	private List<Food> foodList = new ArrayList<Food>();

	public List<Food> getFoodList() {
		return foodList;
	}

	public void setFoodList(List<Food> foodList) {
		this.foodList = foodList;
	}

	public FoodMenu(FoodClass foodClass) {
		if (foodClass.equals(FoodClass.ECONOMY_CLASS)) {
			initalizeEconomyFood();
		}

		else {
			initalizeFirstFood();
		}

	}
	
	private void initalizeEconomyFood() {
		foodList.add(new Food("Sandwishes", 45));
		foodList.add(new Food("Hamburger", 65));
		foodList.add(new Food("Veggieburger", 65));
		foodList.add(new Food("Samon Sallad", 65));
		foodList.add(new Food("Swedish Meatballs", 65));
		foodList.add(new Food("Pancakes", 45));
		foodList.add(new Food("IceCream", 45));
	}

	private void initalizeFirstFood() {
		foodList.add(new Food("Lobster", 450));
		foodList.add(new Food("Veggieburger deluxe", 250));
		foodList.add(new Food("Mushroom stew", 125));
		foodList.add(new Food("Veggie Sallad", 100));
		foodList.add(new Food("Lemon Cheesecake", 125));
		foodList.add(new Food("Strawberry Cheesecake", 125));
		foodList.add(new Food("Waffles and icecream", 125));

	}

}

//// Variables
// private String food;
// private String menu[];
// private String inventory[];
// private int cost;
//
// public String getFood() {
// return food;
// }
//
// public String getMenu[] {
// return menu[];
// }
//
// private void setName(String title, String firstName, String surname) {
// this.title = title;
// this.firstName = firstName;
// this.surname = surname;
// }
//
//// Methods
// public String getMailingName() {
// // Code
// String mailingName;
// mailingName = title + " " + firstName.substring(0, 1) + " " + surname;
// return mailingName;
//
// }
//
// // More methods would appear here.
//
// public Customer(String title, String firstName, String surname) {
// System.out.println("New food order placed.");
// setName(customer, food,surname);
// }
//
//