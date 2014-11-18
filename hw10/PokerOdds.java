//William Schwarz
//hw10
//poker odds
import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
//  simulateOdds();
  }


 public static void showHands(){
        String ans="";
       do{
            int deck []= new int [52];
            for(int i=0;i<52;i++){//generates the cards in the deck
               deck[i]=i;
            }
           
            int hand []= new int [5];
            for(int i=0;i<5;i++){//generates an array for your hand
                hand[i]=-1;
            }
            
            for(int i=0; i<5;i++){//filling your hand
                
                    int target= (int) ((52-i)*Math.random() );
                    
                    int temp = deck[target];
                    hand[i]=deck[target];
                    deck[52-i]=-1;
                   
            }
            
            
            System.out.print("Clubs : ");
            for(int i=0;i<5;i++){
                
                
                if(((int) hand[i]/13)==0){//tests for clubs/spades/diamonds/hearts
                    switch(hand[i]%13){//tests for face value
                    case 0 : 
                        System.out.print("A, ");
                        return;
                    case 1 :
                        System.out.print("K, ");
                        return;
                    case 2 :
                        System.out.print("Q, ");
                        return;
                    case 3 :
                        System.out.print("J, ");
                        return;
                    default:
                        System.out.print((hand[i]%13)+", ");
                        return;
                }
            }
            }
            System.out.println();
            
            System.out.print("Diamonds : ");
            for(int i=0;i<5;i++){
                
                
                if(((int) hand[i]/13)==1){
                    switch(hand[i]%13){
                    case 0 : 
                        System.out.print("A, ");
                        return;
                    case 1 :
                        System.out.print("K, ");
                        return;
                    case 2 :
                        System.out.print("Q, ");
                        return;
                    case 3 :
                        System.out.print("J, ");
                        return;
                    default:
                        System.out.print((hand[i]%13)+", ");
                        return;
                }
            }
            }
            System.out.println();
            
            System.out.print("Spades : ");
            for(int i=0;i<5;i++){
                
                
                if(((int) hand[i]/13)==2){
                    switch(hand[i]%13){
                    case 0 : 
                        System.out.print("A, ");
                        return;
                    case 1 :
                        System.out.print("K, ");
                        return;
                    case 2 :
                        System.out.print("Q, ");
                        return;
                    case 3 :
                        System.out.print("J, ");
                        return;
                    default:
                        System.out.print((hand[i]%13)+", ");
                        return;
                }
            }
            }
            System.out.println();
            
            System.out.print("Hearts : ");
            for(int i=0;i<5;i++){
                
                
                if(((int) hand[i]/13)==3){
                    switch(hand[i]%13){
                    case 0 : 
                        System.out.print("A, ");
                        return;
                    case 1 :
                        System.out.print("K, ");
                        return;
                    case 2 :
                        System.out.print("Q, ");
                        return;
                    case 3 :
                        System.out.print("J, ");
                        return;
                    default:
                        System.out.print((hand[i]%13)+", ");
                        return;
                }
            }
            }
            System.out.println();
            
           
           Scanner myScanner;
            myScanner= new Scanner(System.in);
           
           System.out.println("Go again? Enter 'y' or 'Y', anything else to quit-");
            ans = myScanner.nextLine();
        }while(ans.equals("Y") || ans.equals("y"));
 
 }
}