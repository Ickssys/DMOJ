
// The two standard imports that cover most useful classes.
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import java.util.*;
import java.io.*;

// import java.math.*; // BigInteger
public class S_1_Slot_Machines // always use the problem name here
{
    // These two classes are rather fast for input and output.
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;

    // throw an IOException here so there is no need to handle errors later
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        // code here
        int quaters = nextInt();
        int m1 = nextInt();
        int m2 = nextInt();
        int m3 = nextInt();

        int timesPlayed = 0;

        while (quaters >= 1) {
            int slotMachine = timesPlayed % 3;
            quaters--;
            if (slotMachine == 0) {
                m1++;
                if (m1 % 35 == 0) {
                    quaters += 30;
                }
            } else if (slotMachine == 1) {
                m2++;
                if (m2 % 100 == 0) {
                    quaters += 60;
                }
            } else if (slotMachine == 2) {
                m3++;
                if (m3 % 10 == 0) {
                    quaters += 9;
                }
            }
            timesPlayed++;
        }





        out.println("Martha plays " + timesPlayed + " times before going broke."); // print out ans;
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