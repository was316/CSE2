//william Schwarz

//lab 05
//enigma

import java.util.Scanner;

public class Enigma
{
  public static void main(String [] arg)
  {
    int n=40,k=60;
    String out="";
    switch(k%14)
    {
      case 12: 
         break;
      default: out+=40;
          n/=3;
          k-=7;
    }
    System.out.println(n+" "+k);
    
        if(n*k%12< 12)
        {
          n-=20;
          out+=n;
        }
            System.out.println(n);
        
        if(n*n>k)
        {
          n=42;
          out+=n+k;
        }
    
        
        else 
        {
          n=45;
          out+=n+k;
        }
            System.out.println(n+" "+k);
    
        switch(n+k)
        {
          case 114: 
            n-=11;
            k-=3;
            break;
          case 97:
            n-=14;
            k-=2;
            break;
          case 98:
            n/=5;
            k/=8;
          default:
            n-=3;
            k-=5;
        }
    System.out.println(n+" "+k);
    
    out+=1/n + 1/k;   
    System.out.println(out);
  }
}