//William Schwarz
//
//hw04
//program 3

//import scanner
import java.util.Scanner;

    //assign class
    public class TimePadding {
        
        //main method
        public static void main(String [] args) {
    
      
            //set up scanner to accept input
            Scanner myScanner = new Scanner( System.in );
            
                //prompt the user for thier income
                System.out.print("Enter the time in seconds : ");
                
                    //accept input
                    int time= myScanner.nextInt();
                    //convert input to broken down time
                    int hours= time/3600;
                    int minutes= (time- (3600*hours))/60;
                    int seconds= (time- (3600*hours))-minutes*60;
                    
                        //if statements to display the padded time
                        if(minutes>9&&seconds>9){
                            System.out.println("the time is - "+hours+" : "+minutes+" : "+seconds);
                        }
                        else if(minutes<10&&seconds>9){
                            System.out.println("the time is - "+hours+" : 0"+minutes+" : "+seconds);
                        }
                        else if(minutes>9&&seconds<10){
                            System.out.println("the time is - "+hours+" : "+minutes+" : 0"+seconds);
                        }
                        else if(minutes<10&&seconds<10){
                            System.out.println("the time is - "+hours+" : 0"+minutes+" : 0"+seconds);
                        }
        }
    }