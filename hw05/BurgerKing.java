//William Schwarz
//
//hw05
//burger king order

//import scanner
import java.util.Scanner;

    //assign class
    public class BurgerKing {
        
        //main method
        public static void main(String [] args) {
    
      
            //set up scanner to accept input
            Scanner myScanner = new Scanner( System.in );
                
                //prompt the user for their order
                System.out.print("Enter a letter to indicate a choice of \n Burger (B or b) \n Soda (S or s) \n Fries (F or f)\n");
                
                    //accept user input
                    char order = myScanner.next().charAt(0);
                    char extras;
                    char soda;
                    char frySize;
                        switch (order){
                            
                            //if they want a  burger what do they want on  it?
                            case 'B':
                                System.out.print("enter A or a for 'all the fixins' \n enter C or c for cheese \n enter N or n for none of the above\n");//another switch for ad ons
                                    extras = myScanner.next().charAt(0);
                                    switch(extras){
                                        case'A' : 
                                            System.out.println("you ordered a burger with all the fixins");
                                            return;
                                        case'a':
                                            System.out.println("your ordered a burger with all the fixins");
                                            return;
                                        case 'C':
                                            System.out.println("you ordered a burger with cheese");
                                            return;
                                        case 'c':
                                            System.out.println("you ordered a burger with cheese");
                                            return;
                                        case 'N':
                                            System.out.println("you ordered a plain burger");
                                            return;
                                        case 'n':
                                            System.out.println("you ordered a plain burger");
                                            return;
                                        default :
                                            System.out.println("you entered an unexpected symbol");
                                            
                                            return;
                                            
                                    }
                            case 'b':
                                System.out.print("enter A or a for 'all the fixins' \n enter C or c for cheese \n enter N or n for none of the above\n");//another switch for ad ons
                                extras = myScanner.next().charAt(0);
                                    switch(extras){
                                        case'A' : 
                                            System.out.println("you ordered a burger with all the fixins");
                                            return;
                                        case'a':
                                            System.out.println("your ordered a burger with all the fixins");
                                            return;
                                        case 'C':
                                            System.out.println("you ordered a burger with cheese");
                                            return;
                                        case 'c':
                                            System.out.println("you ordered a burger with cheese");
                                            return;
                                        case 'N':
                                            System.out.println("you ordered a plain burger");
                                            return;
                                        case 'n':
                                            System.out.println("you ordered a plain burger");
                                            return;
                                        default :
                                            System.out.println("you entered an unexpected symbol");
                                            
                                            return;
                                            
                                    }
                            //if they choose sode must find out what type they want
                            case'S' :
                                System.out.print("Do you want a Pepsi? (P or p) \n Coke? (C or c) \n Sprite? (S or s) \n Mountain Dew? (M or m) \n ");
                                soda = myScanner.next().charAt(0);
                                    switch(soda){
                                        case 'P':
                                            System.out.println("you ordered a Pepsi");
                                            return;
                                        case 'p':
                                            System.out.println("you ordered a Pepsi");
                                            return;
                                        case 'C':
                                            System.out.println("you ordered a Coke");
                                            return;
                                        case 'c':
                                            System.out.println("you ordered a Coke");
                                            return;
                                        case 'S':
                                            System.out.println("you ordered a Sprite");
                                            return;
                                        case 's':
                                            System.out.println("you ordered a Sprite");
                                            return;
                                        case 'M':
                                            System.out.println("you ordered a Mountain Dew");
                                            return;
                                        case 'm':
                                            System.out.println("you ordered a Mountian Dew");
                                            return;
                                        default:
                                            System.out.println("you entered an unexpected symbol");
                                            
                                            return;
                                    }
                            case 's' :
                                System.out.print("Do you want a Pepsi? (P or p) \n Coke? (C or c) \n Sprite? (S or s) \n Mountain Dew? (M or m) \n ");
                                soda = myScanner.next().charAt(0);
                                    switch(soda){
                                        case 'P':
                                            System.out.println("you ordered a Pepsi");
                                            return;
                                        case 'p':
                                            System.out.println("you ordered a Pepsi");
                                            return;
                                        case 'C':
                                            System.out.println("you ordered a Coke");
                                            return;
                                        case 'c':
                                            System.out.println("you ordered a Coke");
                                            return;
                                        case 'S':
                                            System.out.println("you ordered a Sprite");
                                            return;
                                        case 's':
                                            System.out.println("you ordered a Sprite");
                                            return;
                                        case 'M':
                                            System.out.println("you ordered a Mountain Dew");
                                            return;
                                        case 'm':
                                            System.out.println("you ordered a Mountian Dew");
                                            return;
                                        default:
                                            System.out.println("you entered an unexpected symbol");
                                            
                                            return;
                                    }
                            case 'F' :
                                //set up another switch to see what size french fries they want
                                System.out.print("Do you want a large or small order of fries? (L,l,S, or s)");
                                frySize = myScanner.next().charAt(0);
                                    switch(frySize){
                                        case 'L':
                                            System.out.println("you ordered a large order of fries");
                                            return;
                                        case 'l':
                                            System.out.println("you ordered a large order of fries");
                                            return;
                                        case 'S':
                                            System.out.println("you ordered a small order of fries");
                                            return;
                                        case 's':
                                            System.out.println("you ordered a small order of fries");
                                            return;
                                        default :
                                            System.out.println("you entered an unexpected character");
                                            
                                            return;
                                    }
                            case 'f' :
                                System.out.print("Do you want a large or small order of fries? (L,l,S, or s)");
                                frySize = myScanner.next().charAt(0);
                                    switch(frySize){
                                        case 'L':
                                            System.out.println("you ordered a large order of fries");
                                            return;
                                        case 'l':
                                            System.out.println("you ordered a large order of fries");
                                            return;
                                        case 'S':
                                            System.out.println("you ordered a small order of fries");
                                            return;
                                        case 's':
                                            System.out.println("you ordered a small order of fries");
                                            return;
                                        default :
                                            System.out.println("you entered an unexpected character");
                                        
                                            return;
                                    }
                        }
        }
    }
                            
                        
                