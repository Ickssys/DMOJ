import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
// The two standard imports that cover most useful classes.
import java.util.*;
import java.io.*;
// import java.math.*; // BigInteger

public class P_1_Baker_Brie //problem name here
{
    // These two classes are rather fast for input and output.
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st = new StringTokenizer("");
    
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()){ st = new StringTokenizer(in.readLine());}
        return st.nextToken();
    }

    // read input as integer
    static int nextInt() throws IOException {return Integer.parseInt(next());}

    // read input as long
    static long nextLong() throws IOException {return Long.parseLong(next());}

    // read input as double
    static double nextDouble() throws IOException {return Double.parseDouble(next());}
    
    // read input as line
    static String nextLine() throws IOException {return in.readLine();}
    
    // read Array
    static int[] readArray(int n) throws IOException {
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = nextInt();
        }
        return a;
    }
    static int[][] read2DArray(int r, int c) throws IOException {
        int[][] a = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                a[i][j] = nextInt();
            }
        }
        return a;
    }

    // throw an IOException here so there is no need to handle errors later
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        // code here
        int rowSum = 0, colSum = 0;
        for(int t = 0; t < 10; t++){
            int bd = 0;
            int F = nextInt(), D = nextInt();
            int[][] data = read2DArray(D, F);
            for(int i = 0; i < D; i++){
                rowSum = 0;
                for(int j = 0; j < F; j++){
                    rowSum += data[i][j];
                }
                if(rowSum % 13 == 0){
                    bd += rowSum;
                }
            }
            for(int i = 0; i < data[0].length; i++){
                colSum = 0;
                for(int j = 0; j < data.length; j++){
                    colSum += data[j][i];
                }
                if(colSum % 13 == 0){
                    bd += colSum;
                }
            }
            out.println(bd / 13);
        }
        out.close();
        System.exit(0);
    }
}