//WilliamSchwarz
//hw06
//roulette wheel

import java.util.Scanner;

    public class Roulette {
        
        public static void main(String[] args) {
            
            Scanner myScanner;
            myScanner= new Scanner(System.in);
            
                int counter=0;//set up variable for countin number of spins
                int myVal;
                int correct=0;
                int runTime=0;
                int profits=0;
                int totalLoss=0;
                    
                    System.out.println("pick your number [1-38] (37 stands for 0 on the wheel, 38-->00) : ");
                     //check if user entered an integer
                     if(myScanner.hasNextInt() ){
                            //accept user input
                            myVal = myScanner.nextInt();
                     }
                        
                        else{
                            System.out.println("you did not enter an int");
                            return; //ends the program
                        }
                        
                            if(myVal<1||myVal>38){
                                System.out.println("your number is not within the specified range");
                                return;     
                            }
                                //loop to run simulation 100 times
                                while(runTime<1000){
                                    //loop to spin 100 times
                                    while(counter<100){
                                        int randomNumber=(int) (Math.random()*39);
                    
                                        if(randomNumber==myVal){
                                            correct++;
                                        }
                                            if(correct>=3){
                                                profits++;
                                            }
                                            if(correct==0){
                                                totalLoss++;
                                            }
                                        counter++;
                                        }
                                        
                                runTime++;
                                }
                                
                                System.out.println("you made a profit "+profits+" times");
                                System.out.println("you lost everything "+totalLoss+" times");
                                
        }
    }