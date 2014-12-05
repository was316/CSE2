//WilliamSchwarz
//lab07
//loop the loop

  import java.util.Scanner; // import the scanner class

public class LoopTheLoop{
    
    public static void main(String[] args) {
        
        Scanner myScanner;  //declare scanner
        
        myScanner=new Scanner(System.in);   //instance of scanner 
        
        int nStars=10;
        
        System.out.print("Enter an int (1-15)"); //prompt user input
        
        while (myScanner.hasNextInt()){
            
            int input = myScanner.nextInt();
            
            for (int counter1 = 1; counter1<(input + 1); counter1++ ){ 
                
                for (int counter2 = 0; counter2<counter1; counter2++){
                    String star = "*"; 
                    System.out.print(star); //print *
                }
                System.out.println(); //switch line
            }    
            myScanner.nextLine(); //makes next input readable
            
            System.out.print("Would you like to go again? (Y/y/N/n)"); //prompt user
            
            String answer = myScanner.nextLine(); 
            
            if (answer.equals("Y") || answer.equals("y")){ 
                //run again
                System.out.print("Enter an int (1-15)"); //prompt user input
            }
            else if (answer.equals("N") || answer.equals("n")){
                
                break;
            }
            
            else{
                
                System.out.println("You did not enter a valid choice. Program terminated.");
                break;
            }
        
        }
    
    }

}