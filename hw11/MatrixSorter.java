//William Schwarz
//hw11
//matrix sorter


public class MatrixSorter{
  public static void main(String arg[]){
    int [][][]mat3d;
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
   }
   
   public static void show(int[][][] x) {
        for(int i = 1; i <= x.length; i++) 
        {
            System.out.println("---------------Slab " + (i));
            
            for(int j = 1; j <= x[i].length; j++) 
            {
                System.out.println(x[i][j]); // print column
            }
        }
    }

    public static int[][][] buildMat3d(){
        int [][][]mat3d=new int [3][][];
        for(int i=0;i<mat3d.length; i++){
            mat3d[i]= new int [3+(2*i)];
            for(int j=0; j<mat3d[i].length;j++){
                mat3d[i][j]= new int [i+j+1];
            }
        }
        
        for(int i=0; i<mat3d.length; i++){
            for(int j=0; j<mat3d[i].length; j++){
                for(int k=0; k<mat3d[i][j].length; k++){
                    mat3d[i][j][k]=(int)(Math.random()*100);
                }
            }
        }return mat3d;
    
        
    }
    
    public static int findMin(int[][][] x){
        int myMin=10000000;
        
        for(int i=0; i<x.length; i++){
            
            for(int j=0; j<x[i].length; j++){
                
                for(int k=0; k<x[i][j].length; k++){
                    
                    if(x[i][j][k]<myMin){
                        myMin=x[i][j][k];
        }
        }
        }
        }
        return myMin;
    }
    
    public static void sort( int[] x )
    {
         int i, j, first, temp;  
         for ( i = x.length-1; i > 0; i-- )  
         {
              first = 0;   //initialize to subscript of first element
              for(j = 1; j <= i; j ++)   //locate smallest element between positions 1 and i.
              {
                   if( x[j] < x[first] )         
                     first = j;
              }
              temp = x[first];   //swap smallest found with element in position i.
              x[first] = x[i];
              x[i] = temp; 
          }           
    }
    
}