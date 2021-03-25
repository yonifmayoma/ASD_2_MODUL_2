package TUGAS_2;
public class NO_4 {
    public static void main(String[] args){
        int[][] B = {
            {2,1,-5},
            {3,4,2}
        };
        int[][] Bt = new int[3][2];
        for(int i=0; i<B.length; i++){
            for(int j=0; j<B[0].length; j++){
                Bt[j][i] = B[i][j];
            }
        }
        for(int i=0; i<Bt.length; i++){
            for(int j=0; j<Bt[0].length; j++){
                System.out.print(Bt[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Mayoma Yonif");
    }
}