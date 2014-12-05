//William Schwarz
//lab12

public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }

    public static double[] addArrays(double[] x, double[] y){
        
        int length=0;
        
        double s[]=new double[6];
        if(x.length>y.length){
        
        for(int i=0; i<x.length; i++){//if x is bigger than y only take the x values
            if(i >=y.length){
            s[i]=x[i];
             
        }
        else{
            s[i] = x[i] + y[i];
        }
        }
        }
        if(y.length>x.length){
        
        for(int i=0; i<x.length; i++){
            if(i >=x.length){
            s[i]=y[i];
        }
        
       else{
           s[i]= x[i]+y[i];
        
       }
        }
    }
    
        return s;
    }
    
    public static boolean equals(double[] x, double[] y){
        if(x.length==y.length){
            for(int j=0; j<x.length; j++){
                if(x[j]==y[j]){
                   return true; 
                }
            }
        }
       
        return false;
    
        
    }
}