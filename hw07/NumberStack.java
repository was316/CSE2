//WilliamSchwarz
//hw07
//number stack

import java.util.Scanner;

    public class NumberStack {
        
        public static void main(String[] args) {
            
            Scanner myScanner;
            myScanner= new Scanner(System.in);
            int myVal;    
                System.out.println("choose a number between 1-9");//prompt user for a number
                
                    if(myScanner.hasNextInt() ){
                            //accept user input
                            myVal = myScanner.nextInt();
                                if(myVal<1||myVal>9){
                                    System.out.println("you did not enter an int [1-9]");
                                    return;//ends the program
                                }
                     }
                        
                        else{
                            System.out.println("you did not enter an int");
                            return; //ends the program)
                        }
                        
                    //using for loops
                    System.out.println("Using for loops : ");
                    System.out.println();
                        
                        for(int block=0; block<=(myVal-1); block++)
                        {
                            
                            for(int lines=0;lines<=block;lines++)
                            {//number of lines
                                
                                for(int space=0; space<=(myVal-block); space++)
                                {//number of spaces
                                    
                                    System.out.print(" ");
                                    
                                }
                                for(int numbers=0; numbers<=(block*2); numbers++)
                                {//number of numbers
                                    System.out.print(block+1);
                                }
                                    System.out.println();
                            }
                            for(int space=0; space<=(myVal-block); space++)
                            {//number of spaces after the number
                                System.out.print(" ");
                            }
                            for(int dash=0; dash<(1+(2*block)); dash++)
                            {//number of dashes
                                System.out.print("-");
                            }
                            System.out.println();
                        }
                        
                    System.out.println("Using while loops : ");
                    System.out.println();
                        
                        int block=0; int lines=0; int space=0; int numbers=0; int dash=0;
        
                            while(block<=myVal-1)
                            {
                                lines=0; dash=0;
                                    
                                    while(lines<=block)
                                    {
                                        numbers=0; space=0;
                                            
                                            while(space<=myVal-block)
                                            {
                                                System.out.print(" ");
                                                space++;
                                            }
                                            while(numbers<=block*2)
                                            {
                                                System.out.print(block+1);
                                                numbers++;
                                            }
                                            System.out.println();
                                            lines++;
                                    }
                                    space=0;
                                    
                                        while(space<=myVal-block)
                                        {
                                            System.out.print(" ");
                                            space++;
                                        }
                                        while(dash<1+(block*2))
                                        {
                                            System.out.print("-");
                                            dash++;
                                        }
                                        System.out.println();
                                        block++;
                            }
                    System.out.println("using do-while loops");
                    System.out.println();
                        
                        block=0; lines=0; space=0; numbers=0; dash=0;
                        
                        do
                        { lines=0; dash=0;
                            do
                            { numbers=0; space=0;
                            
                                do
                                {
                                    System.out.print(" ");
                                    space++;
                                }while(space<=myVal-block);
                                
                                    do
                                    {
                                        System.out.print(block+1);
                                        numbers++;
                                    }while(numbers<=block*2);
                                
                                System.out.println();
                                lines++;
                            
                            }while(lines<=block);
                            
                            space=0;
                            
                            do
                            {
                                System.out.print(" ");
                                space++;
                            }while(space<=myVal-block);
                            
                                do
                                {
                                    System.out.print("-");
                                    dash++;
                                }while(dash<1+(block*2));
                                
                        System.out.println();
                        block++;
                        
                        }while(block<= myVal-1);
        }
    }
    
                        
                        