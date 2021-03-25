package TUGAS_2;
public class NO_3 {
    public static void main(String[] args){
        int[][] a = {
            {5,8,9},
            {2,3,4}
        };
        int[][] b = {
            {2,5},
            {5,7},
            {6,9}
        };
        int jumlah =0;
        
        if(a[0].length == b.length){
            int[][] c = new int[a.length][b[0].length];
            for(int i=0; i <a.length; i++){
                for(int j=0; j<b[0].length;j++){
                    for(int k=0; k<b.length;k++){
                        jumlah = jumlah + a[i][k] * b[k][j];
                    }
                    c[i][j] = jumlah;
                    jumlah =0;
                }
            }
            for(int i = 0; i < c.length ; i++){
                for(int j =0; j < c[0].length; j++){
                    System.out.print(c[i][j] + "\t");
                }
                System.out.println();
            }
        }
        System.out.println("Mayoma Yonif");
    }
}
