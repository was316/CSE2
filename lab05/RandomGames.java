//William Schwarz
//
//lab05
//random game generator

//import scanner
import java.util.Scanner;

    //assign class
    public class RandomGames {
        
        //main method
        public static void main(String [] args) {
    
      
            //set up scanner to accept input
            Scanner myScanner = new Scanner( System.in );
                
                //prompt the user for their game of choice
                System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");
                
                //accept user input
                    char game = myScanner.next().charAt(0);
                    
                        //set up the switch function
                        
                        switch( game ){
                            
                            case 'r':
                                int roulette=(int)(Math.random()*37)+1;//generate random number 
                                
                                System.out.println("Roulette : "+roulette);
                                
                               break; 
                            case 'R':
                                int roulette2=(int)(Math.random()*37)+1;
                                System.out.println("Roulette : "+roulette2);
                                
                                break;
                            case 'p':
                                int suit=(int)(Math.random()*4)+1;//generate number representative of suit
                                int card=(int)(Math.random()*13)+1;//generate card number
                                    String cardType= "";
                                    String suitType= "";
                                    switch( card ){
                                        
                                        case 1:
                                            cardType= "Ace";
                                            break;
                                        case 11:
                                            cardType= "Jack";
                                            break;
                                        case 12:
                                            cardType= "Queen";
                                            break;
                                        case 13:
                                            cardType= "King";
                                            break;
                                        
                                    }
                                    switch (suit){
                                        
                                        case 1:
                                            suitType= "diamonds";
                                            break;
                                        case 2:
                                            suitType= "clubs";
                                            break;
                                        case 3:
                                            suitType= "spades";
                                            break;
                                        case 4:
                                            suitType= "hearts";
                                            break;
                                    }
                                        //print the result
                                        System.out.println(cardType+" of "+suitType);
                                
                                break;
                            case 'P':
                                int suit2=(int)(Math.random()*4)+1;//generate number representative of suit
                                int card2=(int)(Math.random()*13)+1;//generate card number
                                    String cardType2= "";
                                    String suitType2= "";
                                    switch( card2 ){
                                        
                                        case 1:
                                            cardType2= "Ace";
                                            break;
                                        case 11:
                                            cardType2= "Jack";
                                            break;
                                        case 12:
                                            cardType2= "Queen";
                                            break;
                                        case 13:
                                            cardType2= "King";
                                            break;
                                        
                                    }
                                    switch (suit2){
                                        
                                        case 1:
                                            suitType2= "diamonds";
                                            break;
                                        case 2:
                                            suitType2= "clubs";
                                            break;
                                        case 3:
                                            suitType2= "spades";
                                            break;
                                        case 4:
                                            suitType2= "hearts";
                                            break;
                                    }
                                        //print the result
                                        System.out.println(cardType2+" of "+suitType2);
                                
                                break;
                            case 'c':
                                int dice1=(int)(Math.random()*6)+1;
                                int dice2=(int)(Math.random()*6)+1;
                                int myVal= dice1+dice2;
                                
                                System.out.println("Craps : "+dice1+" + "+dice2+" = "+myVal);
                                
                                break;
                            case 'C':
                                int dice3=(int)(Math.random()*6)+1;
                                int dice4=(int)(Math.random()*6)+1;
                                int myVal2= dice3+dice4;
                                
                                System.out.println("Craps : "+dice3+" + "+dice4+" = "+myVal2);
                                
                                break;
                                
                            default:
                                
                                System.out.println("character entered is not as expected");
                                break;
                                
                            
                                
                        }
                        
                        
        }
    }