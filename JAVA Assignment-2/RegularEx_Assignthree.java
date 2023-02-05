package SwiftFoodDXC;

 class Shipment
{     
	public boolean checkProductNameValidity(String productName)
	{     
		String regex="[a-zA-Z]{1,}\\s[a-zA-Z]{1,}(?:\\s[a-zA-Z]{1,})?";
		if(productName.matches(regex))
		{
			return true;
		}
		else
		{
		return false; 
		}
	}
	public boolean checkProductIdValidity(String productId)
		{      //Implement your code here and change the return value accordingly
		
		String regex1="\\w{2,20}";
		if(productId.matches(regex1))
		{
			return true;
		}
		else
		{
		return false;
		}
		}
	
	public boolean checkTrackerIdValidity(String trackerId)
	{      //Implement your code here and change the return value accordingly 
		String regex2 = "[A-Z]{1}+:[A-Z]{4}:[a-z]{3}+:[0-9]{2}";
		if(trackerId.matches(regex2))
		{
			return true;
		}
		else
		{
		return false; 
		}
	} 
}
	


	 class Product {    
		 public static void main(String[] args) {      
			 Shipment shipment = new Shipment();     
			 //Change the values for testing your code with different values      
			 String productName = "Mobile";     
			 System.out.println("The product name is "+ (shipment.checkProductNameValidity(productName) ? "valid!" : "invalid!")); 
	 
	        String productId = "DC191$";   
	        System.out.println("The product Id is "+ (shipment.checkProductIdValidity(productId) ? "valid!" : "invalid!")); 
	 
	        String trackerId = "D:CMDc:cmd:23";
	        System.out.println("The tracker Id is "+ (shipment.checkTrackerIdValidity(trackerId) ? "valid!" : "invalid!")); 
	        } 
		 } 
