package SwiftFoodDXC;

public class RegularEx_assign 
{
   public static boolean checkPasswordValidity(String password)
   {        
	   
	   String regex="(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$&%*_]).{8,20}$" ;    
	  if(password.matches(regex))
	  {
		  return true;
	  }
	   
	   return false;   
	  
   }        
   public static void main(String[] args)
   {    //Change the value of password for testing your code with different passwords   
	   String password = "Password";        
	   System.out.println("The password is "+ (checkPasswordValidity(password) ? "valid!" : "invalid!"));   
	   }    
   
   }
	


