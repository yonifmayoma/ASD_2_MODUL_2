package LATIHAN;
public class matrix_2 {
    public static void main (String[] args) {
    int [][] A = {
        {3, 7, 1},
        {2, 4, 6},
        {5, 8, 9}
    };
    
    int [][] B ={
        {6, 2, 4},
        {3, 5, 1},
        {8, 7, 9}
    };
    
    if ((A.length == B.length) && (A[0].length == B[0].length)){
        int[][] C = new int[A.length][A[0].length];
        for (int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                C[i][j] = A[i][j] + B[i][j] ;
            }
        }
        for (int i=0; i<C.length; i++){
            for(int j=0; j<C[0].length; j++){
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }  
            System.out.println(C[1][2]);
        }
        else {
            System.out.println("Ukuran matrix tidak sama");
       }    
    }
}
