//William Schwarz
//hw11
//pokerhands

import java.util.Scanner;
public class PokerHands{
    public static void main(String arg[]){
        int []hand= new int [5];
        int []suit=new int [5];
        Scanner myscanner= new Scanner(System.in);
        
        for(int i=0; i<5; i++){
            System.out.print("enter suit: 'c', 'd', 'h', 's': ");
            suit[i]=input.next();
            System.out.print(" Enter one of 'a', 'k', 'q', 'j', '10', '9'... '2': ");
            hand[i]=input.next();
        }

 
 //i ran out of time and had to submit!
 //thanks for grading my stuff all semester!!
 
 
 
 
 
 
 
 
 
 
 public static void showOneHand(int hand[]){
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ",              "Spades:   "};
	String face[]={
       "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
  	"4 ","3 ","2 "};
	String out="";
	for(int s=0;s<4;s++){
  	out+=suit[s];
  	for(int rank=0;rank<13;rank++)
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank];
  	out+='\n';
	}
	System.out.println(out);
  }
 
}