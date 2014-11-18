import java.util.Scanner;
public class prepT{
    
    //add main method
    public static void main(String[] args)   {
        System.out.println("enter an int : ");
        int k=(new Scanner(System.in)).nextInt();  
//          for(int i=2; i<k;i++){
//        	    System.out.println("i :"+i);
//            }
            int i=2;
       do{
            
            System.out.println("i :"+i);
            i++;
        }while(i<k);
        
    }
}