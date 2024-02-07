import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.Math.floor;
import static java.lang.Math.ceil;
import static java.lang.Math.round;
// The two standard imports that cover most useful classes.
import java.util.*;
import java.io.*;
// import java.math.*; // BigInteger

public class S_2_Babbling_Brooks //problem name here
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
        solve();
        exit();
    }
    
    public static void solve() throws IOException {
        //code here
        ArrayList<Double> streams = new ArrayList<>();
        int N = nextInt();
        for(int i = 0; i < N; i++){
            streams.add(nextDouble());
        }
        int X = nextInt();
        while(X != 77){
            if(X == 99){
                int sN = nextInt();
                double sP = streams.get(sN - 1);            
                int per = nextInt();
                double lft = round(sP * per / 100);
                double rght = abs(lft - sP);
                streams.set(sN - 1, lft);
                streams.add(sN, rght);
            }
            else if(X == 88){
                int sN = nextInt();
                double sP = streams.get(sN - 1);
                double addStream = sP + streams.get(sN);
                streams.remove(streams.get(sN));
                streams.set(sN - 1, addStream);
            }
            X = nextInt();
        }
        for(int i = 0; i < streams.size(); i++){
            out.printf("%d ", round(floor(streams.get(i))));
        }
    }
}