public class b{
    public static void main(String[] args){
        
        int val=1;
            
            for(int i=0; i<4; i++){
                
                System.out.println(val);
                    
                    for(int j=0;j<i;j++){
                        
                        System.out.print(val);
                            
                            for(int k=0;k<=j;k++){
                                System.out.print(val);
                            }
                        System.out.println();
                    }
                    
                
                val*=2;
                
            }
        
    }
}