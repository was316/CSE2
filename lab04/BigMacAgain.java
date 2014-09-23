//William Schwarz
//lab04
//write a program that uses the scanner class to obtain from users how many big macs 
//they want and whether they want an order of fries. It then prints out the total cost

import java.util.Scanner;



public class BigMacAgain {
    //main method always required
    public static void main(String[] args)   {
        //declare an instance of the Scanner object
        Scanner myScanner;
        
        //must set up scanner to be able to accept inputs
        myScanner = new Scanner(System.in);
        
            //set up variable
            int nBigMacs = 0;
            //prompt user for the number of Big MAcs
            System.out.print("Enter the number of Big Macs (an integer > 0) :");
                    
              
                    //check whether the user inputs an int
                    if(myScanner.hasNextInt() )
                        //accept user input
                        nBigMacs = myScanner.nextInt();
                        
                    else{
                        System.out.println("you did not enter an int");
                        return; //ends the program
                    }
                    
                    //check whether user input is a positive integer
                    if(nBigMacs>0)
                        //accept user input
                        
                        
                    else{
                        System.out.println("you did not enter an int >0");
                        return;//ends the program
                    }
                            
                            
                            double bigMac$ = nBigMacs*2.22;//calculate the price of big macs
                            System.out.println("you ordered "+ nBigMacs +" for a cost of: "+ bigMac$ );//print out cost of big macs
                            
                            //set up variables to calculate cost
                            double frenchFry$=0;
                            double total$ = bigMac$ + frenchFry$;  
                                    
                                    
                                    String fries =""; 
                                    fries=myScanner.nextLine();
                                        //if user wants fries, calculate price
                                        if(fries=="Y"||fries=="y")
                                            frenchFry$ = 2.15;
                                            
                                        else{
                                            frenchFry$=0;
                                            return;
                                        }
                                    System.out.println("The total cost of the meal is : " + total$);
    }
}
