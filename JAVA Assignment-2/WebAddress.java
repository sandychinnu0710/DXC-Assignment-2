package SwiftFoodDXC;

public class WebAddress 
{
	 public static boolean checkWebAddressValidity(String webAddress) 
		{
		 String regex="^[http|https].*(://www.).[A-Za-z0-9].*.?[com|org|net]";
			if(webAddress.matches(regex))
			{
				return true;
			}
			else 
				return false;
			
		}     
	public static void main(String[] args)
	{                  //Change the value of webAddress for testing your code with different web addresses       
		String webAddress = "http://www.company.com";      
		System.out.println("The web address is "+ (checkWebAddressValidity(webAddress) ? "valid!" : "invalid!")); 
		} 
	}

