import java.util.Scanner;
public class MoreLoops{
	public static void main(String[] arg){
    Scanner scan=new Scanner(System.in);
    int n=0;

    System.out.print("Enter an int- ");
//    while(!scan.hasNextInt()){
//    	scan.next(); //get rid of the junk entered by user
//    	System.out.print("You did not enter an int; try again- ");
//    }
    //COMMENT OUT THE ABOVE 5 LINES AND REPLACE THE CODE WITH A
    //DO-WHILE LOOP
      do{
          scan.next();
          
      }
            while(!scan.hasNextInt());{
                System.out.print("You did not enter an int; try again- ");
            }
    	n=scan.nextInt();

//    for(int j=0;j<n && j<40;j++){
//    	for(int k=0;k<j+1;k++){
//   	 System.out.print('*');
//    	}
//    	System.out.println();
//    }
    //COMMENT OUT THE ABOVE SIX LINES OF CODE AND REPLACE WITH
    //WHILE STATEMENTS
 	int j=0; int k=0;
 	
 	while(j<n && j<40){
 	    j++;
 	    while(k<(j+1)){
 	        k++;
 	        System.out.print('*');
 	    }
 	System.out.println();    
 	    
 	}
 	
 	
 	
 	
 	
 	
 	
 	
 	 
    k=4;

//    do{
//    	System.out.println("k="+k);
//    	k++;
//    }
//    	while(k<4);
    	//COMMENT OUT THE ABOVE FIVE LINES AND REPLACE THE CODE
    //WITH A WHILE LOOP
        while(k<=4){
            System.out.println("k="+k);
            k++;
        }




    	int count=0;
    	while(true){
    	switch(n){
    	default: System.out.println(n + " is > 5 or <1");
   	 break;
    	case 1:
    	case 2: System.out.print("Case 2 ");
   	 continue;
    	case 3: break;
    	case 4: System.out.println("Case 4");
    	case 5: System.out.println("Case 5");
   	 break;
    	}
    	count++;
    	if(count>10)
   	 break;
    }

}
}