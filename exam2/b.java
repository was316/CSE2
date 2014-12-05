public class b{
    public static void main(String[] args){
      
                
    int x[]= new int[4];
    x[1]=1;
    x[2]=10;
    x[3]=3;
    x[4]=7;
    int y[]= new int[6];
    y[1]=2;
    y[2]=3;
    y[3]=4;
    y[4]=5;
    y[5]=10;
    y[6]=6;
    overlap(x,y);
    
    }
    
    
    public static void overlap(int x[],int y[]){
        int overlap[]= new int [x.length];
        if(x.length<=y.length){
        for(int i=0;i<y.length;i++){
        for(int j=0;j<y.length;j++){
            if(x[i]==y[j]){
                overlap[i]=x[i];
            }
        }
    }
}
System.out.print(overlap[1]+overlap[2]+overlap[3]);
}
}
