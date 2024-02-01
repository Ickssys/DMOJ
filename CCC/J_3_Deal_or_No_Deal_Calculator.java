import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
// The two standard imports that cover most useful classes.
import java.util.*;
import java.io.*;
// import java.math.*; // BigInteger

public class J_3_Deal_or_No_Deal_Calculator //problem name here
{
    // These two classes are rather fast for input and output.
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st = new StringTokenizer("");
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    
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
        out.println(solve()); 
        exit();
    }
    
    public static String solve() throws IOException {
        //code here
        int[] briefCases = new int[] {100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000};
        int n = nextInt(), sum = 0;
        int[] openCases = new int[n];
        for(int i = 0; i < n; i++){
            openCases[i] = nextInt();
            sum -= briefCases[openCases[i] - 1];
        }
        for(int j = 0; j < briefCases.length; j++){
            sum += briefCases[j];
        }
        int bankersOffer = nextInt();
        return bankersOffer > (sum / (briefCases.length - n)) ? "deal" : "no deal";
    }
}