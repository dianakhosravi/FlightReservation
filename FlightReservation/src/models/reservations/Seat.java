package models;
public class Seat{
		private boolean valid;
		private double price;
		
		public Seat(double price) {
			this.valid = true;
			this.price = price;
		}
		public boolean isValid() {
			return valid;
		}
		public void setValid(boolean valid) {
			this.valid = valid;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		
	}