import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
// The two standard imports that cover most useful classes.
import java.util.*;
import java.io.*;

// import java.math.*; // BigInteger
public class takeANumber //problem name here
{
    // These two classes are rather fast for input and output.
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;

    // throw an IOException here so there is no need to handle errors later
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        // code here

        int N = nextInt();
        int taken = 0;
        int served = 0;
        String slip = next();
        if(slip.equals("TAKE")){
            taken++;
            N++;
            if(N > 999){
                N = 1;
            }
        }
        while(!slip.equals("EOF")){
            slip = next();
            if(slip.equals("TAKE")){
                taken++;
                N++;
                if(N > 999){
                    N = 1;
                }
            }
            else if(slip.equals("SERVE")){
                served++;
            }
            else if(slip.equals("CLOSE")){
                int studentsLeft = Math.abs(taken - served);
                int late = taken;
                out.println(late + " " + studentsLeft + " " + N);
                taken = 0;
                served = 0;
            }
            
        }

        // out.println(); // print out ans;
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