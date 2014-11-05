//William Schwarz
//hw09


import java.util.Scanner;
    public class BlockedAgain{
        
        public static void main(String []s){
            int m;
            //force user to enter int in range 1-9, inclusive.
            m = getInt(Scanner); 
            allBlocks(m);
}


public static int getInt(Scanner scan){//prompt user to enter a number

       Scanner myScanner;
            myScanner= new Scanner(System.in);
      System.out.print("pick your number : ");
                     //check if user entered an integer
                     if(myScanner.hasNextInt() ){
                           
                            //accept user input
                        int r = myScanner.nextInt;   
                            return(checkRange(r));
                     }
                        
                        else{
                            System.out.println("you did not enter an int");
                            System.exit(0); //ends the program
                            return(0);
                        }
}

public static int checkRange(int r){
    
    if(r>=1&&r<=9){//check to see if its in the proper range
        return r;
    }
    else{
        System.out.println("you did not enter an int 1-9");
        System.exit(0);
        return 0;
    }
    
    
}

public static void allBlocks(int m){
     block=0; lines=0; space=0; numbers=0; dash=0;//set up the blocks
                        
                        do
                        { lines=0; dash=0;
                            do
                            { numbers=0; space=0;
                            
                                do
                                {
                                    System.out.print(" ");
                                    space++;
                                }while(space<=m-block);
                                
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
                            }while(space<=m-block);
                            
                                do
                                {
                                    System.out.print("-");
                                    dash++;
                                }while(dash<1+(block*2));
                                
                        System.out.println();
                        block++;
                        
                        }while(block<= m-1);
        }
    }