
// The two standard imports that cover most useful classes.
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import java.util.*;
import java.io.*;

// import java.math.*; // BigInteger
public class S_2_Multiple_Choice // always use the problem name here
{
    // These two classes are rather fast for input and output.
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;

    // throw an IOException here so there is no need to handle errors later
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        // code here
        int N = nextInt();
        String ans = "";
        for(int i = 0; i < 2 * N; i++){ 
            ans += next();
        } 
        int count = 0;
        for(int j = 0, k = N; j < N; j++){
            if(ans.charAt(j) == ans.charAt(k)){
                count++;
            }
            k++;
        }



        out.println(count); // print out ans;
        out.close();
        //System.exit(0);
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(in.readLine());
        return st.nextToken();
    }

    // read input as integer
    static int nextInt() throws IOException {return Integer.parseInt(next());}

    // read input as long
    static long nextLong() throws IOException {return Long.parseLong(next());}

    // read input as double
    static double nextDouble() throws IOException {return Double.parseDouble(next());}
    
    //read input as a line of String
    static String nextLine() throws IOException {return in.readLine();}
}