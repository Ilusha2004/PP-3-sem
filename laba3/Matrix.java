import java.util.Arrays;
import java.util.Formatter;

public class Matrix {
    private int N;
    private int[][] Array2D;

    Formatter form = new Formatter();

    public Matrix(int N){
        this.N = N;
        
        Array2D = new int[N][N];

        for(int i = 0; i < Array2D.length; i++){
            for(int k = 0; k < Array2D.length; k++){
                Array2D[i][k] = (int)(Math.random() * 1000); 
            }
        }
    }

    public void PrintMatrix(){
       
        for(int i = 0; i < Array2D.length; i++){
            form = new Formatter();
            for(int p: Array2D[i]){
                form.format("% 5d", p);
            }
            System.out.println(form.format(""));
            form.close();
        }
    }

    public int FindMaximalElementInMatrixAndDelete(){
        int max = Integer.MIN_VALUE;
        int MaxStroke = 0;
        int MaxS = 0;
        int[][] arr = new int[N - 1][N - 1];
        int ik = 0, ki = 0;

        for(int i = 0; i < N; i++){
            for(int k = 0; k < N; k++){
                if(Math.abs(Array2D[i][k]) > Math.abs(max)){
                    max = Array2D[i][k];
                    MaxStroke = i;
                    MaxS = k;
                }
            }
        }

        for(int i = 0; i < N; i++){
            Array2D[MaxStroke][i] = Integer.MAX_VALUE;
            Array2D[i][MaxS] = Integer.MAX_VALUE;
        }

        for(int i = 0; i < N; i++){
            if(i == MaxStroke){
                System.out.println(ik);
                continue;
            }
            for(int k = 0; k < N; k++){
                if(k == MaxS){
                    System.out.println(ki);
                    continue;
                }
                arr[ik][ki] = Array2D[i][k];
                ki++;
                System.out.println(ki);
            }
            
            ik++;
            ki = 0;
            System.out.println(ik);
        }

        for(int i = 0; i < Array2D.length; i++){
            for(int k = 0; k < Array2D.length; k++){
                System.out.print(Array2D[i][k] + " ");
            }
            System.out.println();
        }

        Array2D = arr;

        return 0;
    }

    int BinarySearchStroke(int i, int a){
        int[] arr = Array2D[i];
        Arrays.sort(arr); 
        int l = 0; int r = Array2D.length;
        System.out.println(a);
        while (l > r){
            int k = (l + r) / 2;
            System.out.println("1. " + arr[k] + " " + a + " " + k);
            if(arr[k] == a){
                return k;
            }
            else if(arr[k] <= a){
                l = k + 1; 
            }
            else if(arr[k] > a){
                System.out.println(arr[k] + " " + a);
                r = k;
            }
        }
        return -1;

    }
}