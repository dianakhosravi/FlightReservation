package models.reservations;
import java.util.ArrayList;
import java.util.List;

import models.food.Food;

public class Customer {
	
	//TODO
	private String passportId;
	private String firstName;
	private List<Food> selectedFood;
	
	public Customer(){
		this.firstName = "NoBody";
		this.passportId ="E00000";
		selectedFood = new ArrayList<Food>();
	}
	
	
	
	public List<Food> getSelectedFood() {
		return selectedFood;
	}


	public void setSelectedFood(List<Food> selectedFood) {
		this.selectedFood = selectedFood;
	}

	public void addToSelectedFood(Food food){
		selectedFood.add(food);
	}


	public Customer(String firstName,String passportId) {

		this.firstName = firstName;
		this.passportId = passportId;
		selectedFood = new ArrayList<Food>();
	}

	public String getPassportId() {
		return passportId;
	}

	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	@Override
	public String toString() {
		return "Customer [passportId=" + passportId + ", firstName=" + firstName + "]";
	}

	

}
