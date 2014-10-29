//William Schwarz
//hw08
import java.util.Scanner;
public class HW8
{
  public static void main(String []arg)
  {
	char input;
	Scanner scan=new Scanner(System.in);//prompt for input
	    System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	       
	       input=getInput(scan,"Cc");//go to method 'getINput'
        
        System.out.println("You entered '"+input+"'");
    	
    	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	        input=getInput(scan,"yYnN",5); //give up after 5 attempts
            	if(input!=' '){
               	System.out.println("You entered '"+input+"'");
            	}
            	input=getInput(scan,"Choose a digit.","0123456789");
            	System.out.println("You entered '"+input+"'");
  }  
    
    public static char getInput(Scanner scan, String question, String choices)
    {
        System.out.println("choose number");
        System.out.println(" from  :  ");
            for(int val=0; val<=9; val++)
            {
                System.out.println(val);
            }
            System.out.println();
            
                String userInput=scan.next();
                    
                    for (int count=0; count<choices.length() ; count++)
                    {
                        if(userInput.charAt(0)==choices.charAt(count))
                        {
                            return userInput.charAt(0);
                        }
                    }
    
        System.out.println("incorrect input");
            return 0;
    }
    
    
    public static char getInput(Scanner scan, String response, int tries)
    {
        String userInput = scan.next();
        
            while (tries>1)
            {
                while(userInput.length()>1)
                {
                    System.out.println("character is not on the list");
                    System.out.println("try again : ");
                    userInput = scan.next();
                }
            
                for(int count=0; count<response.length(); count++)
                {
                    if(response.charAt(count)==userInput.charAt(0))
                    {
                        return userInput.charAt(0);
                    }
                }
                
            System.out.println("character not on list");
            System.out.println("try again : ");
            userInput=scan.next();
                tries--;
            }
            return 0;
    }
    public static char getInput (Scanner scan, String response)
    {
        
        String userInput= scan.next();
            while (userInput.length()>1)
            {
                System.out.println("input too large--- : ");
                
                
                userInput = scan.next();
            }
            
            while(userInput.charAt(0)!=response.charAt(1)||userInput.charAt(0)!=response.charAt(0))
            {
                System.out.println("you entered the wrong char");
                System.out.println("try again : ");
                
                userInput=scan.next();
                
            }
            
            return userInput.charAt(0);
                
            
    }
}