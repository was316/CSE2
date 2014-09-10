//Will Schwarz
//lab02-Cyclometer
//September 5th 2014


//define class
public class Cyclometer {
    
    //main method
    public static void main(String[] args)  {
        
        //create variablesto store seconds per trip and the rotations for each trip
        int secsTrip1=480; //first trip time
        int secsTrip2=3220; //second trip time
        int countsTrip1=1561;   //counts for trip 1
        int countsTrip2=9037;   //counts for trip 2
        
            //create variables for constants and and for storing distances
            double wheelDiameter=27.0;  //set diameter of wheel
            double PI=3.14159; //set value for PI
            double feetPerMile=5280;   //establish value for ft per mile
            double inchesPerFoot=12;   //establish inches per foot
            double secondsPerMinute=60;   //establish sssseconds peer minute
            double distanceTrip1, distanceTrip2, totalDistance; //set up trip distances
                
                //print out the numbers that you have stores in the variables that store number of seconds and the counts
                System.out.println("Trip 1 took "+
                    (secsTrip1/secondsPerMinute)+" minutes and had "+
                    countsTrip1+" counts.");
                System.out.println("cd ~/workspaceTrip 2 took "+
                    (secsTrip2/secondsPerMinute)+" minutes and had "+
                    countsTrip2+ " counts.");
                
                    //run the calculations; store the values.
                    //we are using the diameter of the wheel and the counts(number of rotations)
                    //to figure out how far each trip was
                    distanceTrip1=countsTrip1*wheelDiameter*PI;
                    //above gives distance 
                    distanceTrip1/=inchesPerFoot*feetPerMile;   //converts to miles
                    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
                    totalDistance=distanceTrip1+distanceTrip2;
                    
                        //print out the data
                        System.out.println("Trip 1 was "+distanceTrip1+" miles");
                        System.out.println("Trip 2 was "+distanceTrip2+" miles");
                        System.out.println("The total distance was "+totalDistance+" miles");

    }
}