//WilliamSchwarz
//hw06
//find square root

import java.util.Scanner;

    public class Root {
        
        public static void main(String[] args) {
            
            Scanner myScanner;
            myScanner= new Scanner(System.in);
            
              double low=0;
              double high;
              double middle;
              int myVal;
              
              System.out.print("pick your number : ");
                     //check if user entered an integer
                     if(myScanner.hasNextInt() ){
                            //accept user input
                            myVal = myScanner.nextInt();
                     }
                        
                        else{
                            System.out.println("you did not enter an int");
                            return; //ends the program
                        }
                        
                        high=myVal+1;
                        middle=(high+low)/2;
                       
                            while((high-low)>.0000001){
                        
                        
                                if((middle*middle)>myVal){
                                    high=middle;
                                }
                                else{
                                    low=middle;
                                }
                                
                                middle=(high+low)/2;
                            }
        
        System.out.println(middle);
            
            
            
            
            
            
            
        }
    }