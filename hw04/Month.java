//William Schwarz
//
//hw04
//program 2

//import scanner
import java.util.Scanner;

    //assign class
    public class Month {
        
        //main method
        public static void main(String [] args) {
    
      
            //set up scanner to accept input
            Scanner myScanner = new Scanner( System.in );
            
                   //prompt the user for thier income
                System.out.print("Enter an int giving the number of the month (1-12)");
                
                //accept user input
                    int month = myScanner.nextInt();
                    
                        //set up variables for days in a month
                        int daysGroup1 = 30;
                        int daysGroup2 = 31;
                        int february = 28;
                        int februaryLeap = 29;
                        
                            //if statements to settle the month
                            if(month>12||month<1){
                                System.out.println("you did not enter an int between 1 and 12");
                                return;
                            }
                            else if(month==2){
                                System.out.print("enter an int giving the year");
                                    int year = myScanner.nextInt();
                                    //nested if statement to see if int was entered
                                        if(year<0){
                                        System.out.println("you did not enter an int");
                                        return;
                                    }
                                        //see if it is a leap year
                                        else if(year%4==0){
                                            int days= februaryLeap;
                                            System.out.println("the month has "+days+" days");
                                        }
                                        else{
                                            int days= february;
                                            System.out.println("the month has "+days+" days");
                                        }
                                        }
                            //check for other months
                            else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
                                int days= daysGroup2;
                                System.out.println("the month has "+days+" days");
                            }
                            else{
                                int days= daysGroup1;
                                System.out.println("the month has "+days+" days");
                            
                            }
                              
                              
        }
    }