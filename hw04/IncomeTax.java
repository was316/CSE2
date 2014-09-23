//William Schwarz
//
//hw04
//program 1

//import scanner
import java.util.Scanner;

    //assign class
    public class IncomeTax {
        
        //main method
        public static void main(String [] args) {
    
      
            //set up scanner to accept input
            Scanner myScanner = new Scanner( System.in );
            
                //prompt the user for thier income
                System.out.print("Enter an int giving the number of thousands- ");
                
                //accept user input
                    int income = myScanner.nextInt();
                    
                        //set up variables for different tax rates
                        double taxRate1 = .05;
                        double taxRate2 = .07;
                        double taxRate3 = .12;
                        double taxRate4 = .14;
                        
                            //if statements to sort through tax groups
                            if(income<=0){
                                System.out.println("you did not enter a positive int");
                                return;
                            }
                            
                            else if(income<20){
                                double tax$ = taxRate1*income*1000;
                                System.out.println("the tax rate on $"+income+",000 is 5.0%, and the tax is $"+tax$);
                            }
                            else if(income>=20&&income<40){
                                double tax$ = taxRate2*income*1000;
                                System.out.println("the tax rate on $"+income+",000 is 7.0%, and the tax is $"+tax$);
                            }
                            else if(income>=40&&income<78){
                                double tax$ = taxRate3*income*1000;
                                System.out.println("the tax rate on $"+income+",000 is 12.0%, and the tax is $"+tax$);
                            }
                            else if(income>=78){
                                double tax$ = taxRate4*income*1000;
                                System.out.println("the tax rate on $"+income+",000 is 14.0%, and the tax is $"+tax$);
                            }
                            
        }
    }