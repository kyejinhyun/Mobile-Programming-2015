package kr.ac.embedded.kookmin.sales; 

 public class DiscountSale extends Sale { 
 	private double	discount;	 
 								 
 	public DiscountSale() {
 	
 	    setName("No name yet."); 
 	    setPrice(0); 
 	    setDiscount(0); 
 	} 

 	public DiscountSale(String theName, double thePrice, double theDiscount) { 
 		
 	    if(theName == null || theName.isEmpty()) {  
 	     
 	        setName("No name yet."); 
 	    }else{ 
 	        setName(theName);     
 	    }	     
         setPrice(thePrice); 
         setDiscount(theDiscount); 
 	     
 	} 
 	 
 	
 	public DiscountSale(DiscountSale originalObject) { 
 		/** 구현 하시오 **/  
 	    setName(originalObject.getName()); 
 	    setPrice(originalObject.getPrice()); 
 	    setDiscount(originalObject.getDiscount()); 
 	} 
 	 
 	public static void announcement() { 
 		System.out.println("This is the DiscountSale class."); 
 	} 
 	 
 	
 	public double bill() { 
 		
 	    double discountPrice = getPrice() * (100-discount)/100;    
         return discountPrice; 
 	} 
 	 
 	public double getDiscount() { 
 		
 	    return discount; 
 	} 
 	 
 	public void setDiscount(double newDiscount) { 
 		this.discount = newDiscount; 
 	} 
	 
 	public String toString() { 
		return (getName() + " Price = $" + getPrice() + " Discount = " + discount + "%\n" + "   Total cost = $" + bill()); 
 	} 
	 
	public boolean equals(Object otherObject) { 
 	
 	    if (otherObject == null) 
             return false; 
         else if (getClass() != otherObject.getClass()) 
             return false; 
        else { 
             Sale otherSale = (Sale) otherObject; 
             return (getName().equals(otherSale.getName()) && (getPrice() == otherSale.getPrice())); 
         } 
 	} 
 	  
 	public DiscountSale clone() { 
 		
	    return new DiscountSale(this); 
 	} 
 } 
