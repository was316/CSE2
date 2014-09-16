//William Schwarz
//9/16/2014
//hw03
//
//import scanner
import java.util.Scanner;


    //asign class
    public class Bicycle {
        
        //main method
        public static void main(String [] args) {
            
            //set up scanner to accept input
            Scanner myScanner;
                
                //declare value for scanner
                myScanner = new Scanner( System.in );
                
                    //prompt the user for number of seconds
                    System.out.print("Enter the number of seconds (an integer > 0) :");
                    
                    //accept user input
                    int nSeconds = myScanner.nextInt();
                    
                    //prompt the user for number of counts
                    System.out.print("Enter the number of rotations (an integer > 0) :");
                    
                    //accept user input
                    int nCounts = myScanner.nextInt();
                        
                        
                        //create variables for constants and and for storing distances
                        double wheelDiameter=27.0;  //set diameter of wheel
                        double PI=3.14159; //set value for PI
                        double feetPerMile=5280;   //establish value for ft per mile
                        double inchesPerFoot=12;   //establish inches per foot
                        double secondsPerMinute=60;   //establish sssseconds peer minute
                        
                            //set up calculations
                            double distanceTrip=nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile;//counts*diameter*pi-->converted to miles
                            double minutes=(double) nSeconds/60;//convert to minutes
                            double averageMPH= distanceTrip/(minutes/60);//calculate average mph
                            
                            
                                //print out results
                                System.out.println("The distance was "+ distanceTrip +" and took "+ minutes +" minutes");
                                System.out.println("The average mph was "+ averageMPH);
                        
                    
        }
    }