package kr.ac.embedded.kookmin.sales;

/** 
  * Class for a simple sale of one item with no tax, discount, or other 
  * adjustments. Class invariant: The price is always nonnegative; the name is a 
  * nonempty string. 
  */ 


public class Sale {
	private String	name;
	private double	price;	
							
	public Sale() {
		name = "No name yet";
		price = 0;
	}
	
	/** 
	 	 * Precondition: theName is a nonempty string; thePrice is nonnegative. 
	 	 */ 

	
	public Sale(String theName, double thePrice) {
		setName(theName);
		setPrice(thePrice);
	}
	
	public Sale(Sale originalObject) {
		if (originalObject == null) {
			System.out.println("error: null sale object.");
			System.exit(0);
		}
		
		name = originalObject.name;
		price = originalObject.price;
	}
	
	public static void announcement() {
		System.out.println("This is the Sale class.");
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double newPrice) {
		if (newPrice >= 0)
			price = newPrice;
		else {
			System.out.println("error: negative price.");
			System.exit(0);
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		if (newName != null && newName != "")
			name = newName;
		else {
			System.out.println("error: improper name valuee.");
			System.exit(0);
		}
	}
	
	public String toString() {
		return (name + " Price and total cost = $" + price);
	}
	
	public double bill() {
		return price;
	}
	
	
	public boolean equalDeals(Sale otherSale) {
		if (otherSale == null)
			return false;
		else
			return (name.equals(otherSale.name) && bill() == otherSale.bill());
	}
	
	
	public boolean lessThan(Sale otherSale) {
		if (otherSale == null) {
			System.out.println("error: null sale object.");
			System.exit(0);
		}
		
		return (bill() < otherSale.bill());
	}
	
	public boolean equals(Object otherObject) {
		if (otherObject == null)
			return false;
		else if (getClass() != otherObject.getClass())
			return false;
		else {
			Sale otherSale = (Sale) otherObject;
			return (name.equals(otherSale.name) && (price == otherSale.price));
		}
	}
	
	public Sale clone() {
		return new Sale(this);
	}
}
