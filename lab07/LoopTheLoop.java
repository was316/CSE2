//WilliamSchwarz
//lab07
//loop the loop

import java.util.scanner;

    public class LooptheLoop {
        
        public static void main(String[] args) {
            
            Scanner MyScanner;
            MyScanner= new Scanner(System.in);
            
                int nStars;//set up variable for number of stars
                
                    System.out.println("enter an integer for the number of starts[1-15] : ");
                    
                        if(myScanner.hasNextInt() )
                            //accept user input
                            nStars = myScanner.nextInt();
                            
                        else{
                            System.out.println("you did not enter an int");
                            return; //ends the program
                        }
                        
                        //check whether user input is a positive integer
                        if(nStars<1||nStars>15){
                            System.out.println("you did ont enter an int in the range [1-15]");
                            return;
                        }
                        
                            
                
                
        }
    }