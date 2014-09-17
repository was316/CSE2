//William Schwarz
//9/16/2014
//hw03
//Root
//import scanner
import java.util.Scanner;

    //assign class
    public class FourDigits {
        
        //main method
        public static void main(String [] args) {
            
    
        
            //set up scanner to accept input
            Scanner myScanner = new Scanner( System.in );
            
                //prompt the user for a number
                System.out.print("Enter a double and I display the four digits to the right of the decimal point :");
                
                    //accept user input
                    double number = myScanner.nextDouble();
                    
                        //do the calculations
                        int firstMove = (int) number;
                        int secondMove = firstMove*10000;
                        int move3= (int) number*10000;
                        int finalMove = move3-secondMove;
                        
                        
                        
                        
                       
                        
                        
                            //print results
                            System.out.println("the four digits are : "+ finalMove);
                            
        }
    }
                        
                        