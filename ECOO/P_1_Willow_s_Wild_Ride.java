import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
// The two standard imports that cover most useful classes.
import java.util.*;
import java.io.*;
// import java.math.*; // BigInteger

public class P_1_Willow_s_Wild_Ride //problem name here
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

    // throw an IOException here so there is no need to handle errors later
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        // code here
        for(int i = 0; i < 10; i++){
            int T = nextInt(), N = nextInt(), days = 0;
            for(int j = 1; j <= N; j++){
                String line = next();
                if(line.equals("B")){
                    if(j > days){
                        days = j + T - 1;
                    }else{
                        days += T;
                    }
                }
            }
            out.println(max(days - N, 0));
        }
        out.close();
        //System.exit(0);
    }
}