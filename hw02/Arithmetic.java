//William Schwarz
//HW02

//define class
public class Arithmetic {
    
    //main method
    public static void main(String[] args)  {
        
        //set variables
        //number of pairs of socks
        int nSocks=3;
        //cost per pair of socks
        //('$' is a part of the variable name)
        double sockCost$=2.58;
        
        //number of drinking glasses
        int nGlasses=6;
        //cost per glass
        double glassCost$=2.29;
        
        //number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        
        //PA sales tax
        double taxPercent=.06;
        
        //set variables for outputs
        //total cost of each item
       
        //total sock cost
        double totalSockCost$;
        //total sock taxes
        double totalSockTax$;
        
        //total glasses cost
        double totalGlassCost$;
        //total tax on glasses
        double totalGlassTax$;
        
        //total cost of envelopes
        double totalEnvelopeCost$;
        //total tax on envelopes
        double totalEnvelopeTax$;
        
        //total cost of purchases (before tax)
        double totalItemCost$;
        //total cost of bill, including tax
        double totalBill$;
        
            //do calculations
            
            //sock calculations
            totalSockCost$= nSocks*sockCost$;
            totalSockTax$= totalSockCost$*taxPercent;
            
            //glasses calculations
            totalGlassCost$= nGlasses*glassCost$;
            totalGlassTax$= totalGlassCost$*taxPercent;
            
            //envelope cost calculations
            totalEnvelopeCost$= nEnvelopes*envelopeCost$;
            totalEnvelopeTax$= totalEnvelopeCost$*taxPercent;
            
            //calculations for totals
            totalItemCost$= totalSockCost$+totalEnvelopeCost$+totalGlassCost$;
            
            //define variable for total tax
            double totalTax$= totalSockTax$+totalGlassTax$+totalEnvelopeTax$;
            
            //total bill cost
            totalBill$=totalItemCost$+totalTax$;
            
                //print out results
                System.out.println("Socks");
                System.out.println("Number of socks ="+ nSocks);
                System.out.println("Price per sock="+ sockCost$);
                System.out.println("Total cost of socks ="+ totalSockCost$);
                System.out.println("Tax on sock purchase ="+ totalSockTax$);
                System.out.println("                                        ");
                
                
                System.out.println("Envelopes");
                System.out.println("Number of envelopes ="+ nEnvelopes);
                System.out.println("Price per envelope ="+ envelopeCost$);
                System.out.println("Total cost of envelopes ="+ totalEnvelopeCost$);
                System.out.println("Tax on envelope purchase ="+ totalEnvelopeTax$);
                System.out.println("                                        ");
                
                
                System.out.println("Glasses");
                System.out.println("Number of glasses ="+ nGlasses);
                System.out.println("Price per glass ="+ glassCost$);
                System.out.println("Total cost of glasses ="+ totalGlassCost$);
                System.out.println("Tax on glasses purchase ="+ totalGlassTax$);
                System.out.println("                                        ");
                
                
                
                System.out.println("-------------------------------------");
                System.out.println("Totals");
                System.out.println("Total Cost of Purchases (before tax) ="+ totalItemCost$);
                System.out.println("Total Sales Tax ="+ totalTax$);
                System.out.println("Total Bill ="+ totalBill$);
                
                
                
            
            
        
        
    }
}