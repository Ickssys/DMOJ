import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
// The two standard imports that cover most useful classes.
import java.util.*;
import java.io.*;

// import java.math.*; // BigInteger
public class Ptice //problem name here
{
    // These two classes are rather fast for input and output.
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;

    // throw an IOException here so there is no need to handle errors later
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        // code here
        
        int N = nextInt();
        String aKey = next();

        String A = "ABC";
        String B = "BABC";
        String G = "CCAABB";

        int aCount = 0;
        int bCount = 0;
        int gCount = 0;

        for(int i = 0; i < N; i++){
            if(aKey.charAt(i) == A.charAt(i%3)){
                aCount++;
            }
            if(aKey.charAt(i) == B.charAt(i%4)){
                bCount++;
            }
            if(aKey.charAt(i) == G.charAt(i%6)){
                gCount++;
            }

        }
        int maxCount = max(max(aCount, bCount), gCount);
        out.println(maxCount); // print out ans;

        if(maxCount == aCount){
            out.println("Adrian");
        }
        if(maxCount == bCount){
            out.println("Bruno");
        }
        if(maxCount == gCount){
            out.println("Goran");
        }

        out.close();
        //System.exit(0);
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()){ st = new StringTokenizer(in.readLine());
        return st.nextToken();}
        return null;
    }

    // read input as integer
    static int nextInt() throws IOException {return Integer.parseInt(next());}

    // read input as long
    static long nextLong() throws IOException {return Long.parseLong(next());}

    // read input as double
    static double nextDouble() throws IOException {return Double.parseDouble(next());}
}
