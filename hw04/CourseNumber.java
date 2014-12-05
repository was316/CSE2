//William Schwarz
//
//hw04
//program 3

//import scanner
import java.util.Scanner;

    //assign class
    public class CourseNumber {
        
        //main method
        public static void main(String [] args) {
    
      
            //set up scanner to accept input
            Scanner myScanner = new Scanner( System.in );
            
                //prompt the user for thier income
                System.out.print("Enter a six digit number giving the course semester ");
                
                //accept user input
                    int cRN = myScanner.nextInt();
                    //set values so you can figure out the year and semester from the big number
                    int years= cRN/100;
                    int semester=cRN- years*100;
                    
                        //test to see if it fits range
                        if(cRN<186510||cRN>201440){
                            System.out.println("the number was outside the range [186510, 201440]");
                            return;
                        }
                        //if it fits inside the range, 
                        else if(semester-40==0){
                            System.out.println("the course was offered in the fall of "+years);
                        
                        }
                         else if(semester-10==0){
                            System.out.println("the course was offered in the spring of "+years);
                        
                        }
                         else if(semester-30==0){
                            System.out.println("the course was offered in the summer(2) of "+years);
                        
                        }
                         else if(semester-20==0){
                            System.out.println("the course was offered in the summer(1) of "+years);
                        
                        }
                        else{
                            System.out.println("this is not a legitimate semester");
                        }
                        System.out.println("My Name is Will Schwarz and I like dudes");
                        
        }
    }