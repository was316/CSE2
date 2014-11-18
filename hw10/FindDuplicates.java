//William Schwarz
//hw10
//playing poker

import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");//assign variables in the array
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){//print whether or not the array has duplicates
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){//call method "exactlyOneDup
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){//lists the array
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }

    public static boolean hasDups(int num[]){
        for(int x=0; x<num.length; x++){
            for(int y=0; y<num.length; y++){
                if(num[y]==num[x]){
                    return true;
                }
            
                }
                
            }
            
        
      return false;
    }
    
    public static boolean exactlyOneDup(int num[]){
        int counter=0;
        for(int a=0; a<num.length; a++){
            for(int b=0; b<num.length; b++){
                if(num[b]==num[a]){
                   counter+=1;
                }
                
                }
                
            }
            if(counter>1){
              return true;
            }
            
        return false;
      
    }
    }