//William Schwarz
//
//hw05
//program 2
//boolean random

//import scanner
import java.util.Scanner;

    //assign class
    public class BoolaBoola {
        
        //main method
        public static void main(String [] args) {
    
      
            //set up scanner to accept input
            Scanner myScanner = new Scanner( System.in );
                
                //get random numbers to randomly assign true or false
                int randomValue1=(int)Math.random();
                int randomValue2=(int)Math.random();
                int randomValue3=(int)Math.random();
                
                    boolean boula1;
                    boolean boula2;
                    boolean boula3;
                    
                    
                    if(randomValue1==0){
                        boula1=true;
                    }
                    else{
                        boula1=false;
                    }
                    
                    if(randomValue2==0){
                        boula2=false;
                    }
                    else{
                        boula2=false;
                    }
                    
                    if(randomValue3==0){
                        boula3=true;
                    }
                    else{
                        boula3=false;
                    }
                    
                
                        //prompt the user for their guess
                        System.out.println("does "+boula1+" || "+boula2+" && "+boula3+" have the value true(T/t)or false(F/f)?");
                            char answer;
                            answer = myScanner.next().charAt(0);
                                //if statement to see if it is actually true or false
                                if((boula1||boula2&&boula3)==true){
                                    switch(answer){
                                        case 'T':
                                            System.out.println("correct");
                                            break;
                                        case 't':
                                            System.out.println("correct");
                                            break;
                                        case 'F':
                                            System.out.println("wrong, try again");
                                            return;
                                        case 'f':
                                            System.out.println("wrong, try again");
                                            return;
                                        default:
                                            System.out.println("wrong, try again");
                                            return;
                                            
                                    }
                                }
                                else{
                                    switch(answer){
                                        case 'F':
                                            System.out.println("correct");
                                            break;
                                        case 'f':
                                            System.out.println("correct");
                                            break;
                                        case 'T':
                                            System.out.println("wrong, try again");
                                            return;
                                        case 't':
                                            System.out.println("wrong, try again");
                                            return;
                                        default:
                                            System.out.println("wrong, try again");
                                            return;
                                    }
                                }
        }
    }
                