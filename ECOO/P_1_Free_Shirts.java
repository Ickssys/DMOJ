import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
// The two standard imports that cover most useful classes.
import java.util.*;
import java.io.*;
// import java.math.*; // BigInteger

public class P_1_Free_Shirts //problem name here
{
    // These two classes are rather fast for input and output.
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
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

    //read 2D Array
    static int[][] read2DArray(int r, int c) throws IOException {
        int[][] a = new int[r][c];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = nextInt();
            }
        }
        return a;
    }

    //exit System
    static void exit(){
        out.close();
        System.exit(0);
    }

    // throw an IOException here so there is no need to handle errors later
    public static void main(String[] args) throws IOException {
        //Loop through test cases
        for(int i = 1; i <= 10; i++){
            solve();
        }
        exit();
    }
    
    public static void solve() throws IOException {
        //code here
        int N = nextInt(), M = nextInt(), D = nextInt();
        int dL = 0, sT = N;
        int[] days = new int[D]; 
        for(int i = 1; i <= M; i++) {
            int eD = nextInt();
            days[eD - 1]++;
        }
        for(int i = 1; i <= D; i++) {
            if(N == 0){
                N = sT;
                dL++;
            }
            sT += days[i - 1];
            N += days[i - 1];
            N--;
        }
        out.println(dL);
    }
}