//William Schwarz
//9/12/14
//lab 03
//write a program that computes the cost of buying some Big Macs

import java.util.Scanner;


    //assign class
    public class BigMac {
        
        //main method required for all java programs
        public static void main(String[] args)  {
            
            //declare an instance of the Scanner object
            Scanner myScanner;
            
                //declare value for myScanner
                myScanner = new Scanner( System.in );
                
                    //prompt the user for number of Big Macs
                    System.out.print("Enter the number of Big Macs (an integer > 0) :");
                    
                        //accept user input
                        int nBigMacs = myScanner.nextInt();
                        
                            //prompt the user for the cost Big Mac and the percent sales tac and accept the input
                            System.out.print("Enter the cost per Big Mac as"+ " a double (in the form xx.xx) : ");
                            //set up variable for big mac price
                            double bigMac$ = myScanner.nextDouble();
                            //prompt user for tax percent
                            System.out.print("Enter the percent tax as a whole number (xx) : ");
                            //set up variable for tax rate
                            double taxRate = myScanner.nextDouble();
                            //change tax rate from a number to a proportion out of 100
                            taxRate/=100;
                            
                                //print the output
                                
                                //set up variable for total cost
                                double cost$;
                                //set up variable for whole dollar amout of cost, dimes and pennies used for extra digits to the right of the decimal
                                int dollars, dimes, pennies;
                                //equation to find cost
                                cost$ = nBigMacs*bigMac$*(1+taxRate);
                                //get the whole maount, dropping the decimal fraction
                                dollars =(int) cost$;
                                //get dimes amount
                                dimes = (int) (cost$*10)%10;
                                //get pennies amount
                                pennies = (int) (cost$*100)%10;
                                
                                    //now print your output
                                    System.out.println("The total cost of "+ nBigMacs + "Big Macs, at $"+ bigMac$ +" per Big Mac, with a " + "sales tax of " + (int)(taxRate*100) +  "%, is $" + dollars + '.' + dimes + pennies);
                                
                            
        }
    }