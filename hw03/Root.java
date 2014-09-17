//William Schwarz
//9/16/2014
//hw03
//Root
//import scanner
import java.util.Scanner;

    //assign class
    public class Root {
        
        //main method
        public static void main(String [] args) {
            
    
        
            //set up scanner to accept input
            Scanner myScanner = new Scanner( System.in );
            
                //prompt the user for a number
                System.out.print("Enter a double,  and I print its cube root :");
                
                    //accept user input
                    double number = myScanner.nextDouble();
                    
                        //start guessing
                        double guess1 = number/3;
                        double guess2 = (2*guess1*guess1*guess1+number)/(3*guess1*guess1);
                        double guess3 = (2*guess2*guess2*guess2+number)/(3*guess2*guess2);
                        double guess4 = (2*guess3*guess3*guess3+number)/(3*guess3*guess3);
                        double guess5 = (2*guess4*guess4*guess4+number)/(3*guess4*guess4);
                        double guess6 = (2*guess5*guess5*guess5+number)/(3*guess5*guess5);
                        double guess7 = (2*guess6*guess6*guess6+number)/(3*guess6*guess6);
                        double guess8 = (2*guess7*guess7*guess7+number)/(3*guess7*guess7);
                        
                        
                            //see if it works
                            double finalTest = (guess8*guess8*guess8);
                        
                            //print result
                            System.out.println(" The cube root is : "+guess8);
                            System.out.println( guess8+"*"+guess8+"*"+guess8+"="+finalTest);
                            
                            
                            
        }
    }