import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
// The two standard imports that cover most useful classes.
import java.util.*;
import java.io.*;

// import java.math.*; // BigInteger
public class P_1_When_You_Eat_Your_Smarties// problem name here
{
    // These two classes are rather fast for input and output.
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;

    // throw an IOException here so there is no need to handle errors later
    public static void main(String[] args) throws IOException {
        // PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        // code here

        int numCases = 10;
        for (int num = 0; num < numCases; num++) {
            int[] smartiesArr = new int[8];
            int handFull = 7;
            int nonRedTime = 13;
            int redTime = 16;
            String smarties = nextLine();
            while (!smarties.equals("end of box")) {
                if (smarties.equals("orange")) {
                    smartiesArr[0]++;
                }
                if (smarties.equals("blue")) {
                    smartiesArr[1]++;
                }
                if (smarties.equals("green")) {
                    smartiesArr[2]++;
                }
                if (smarties.equals("yellow")) {
                    smartiesArr[3]++;
                }
                if (smarties.equals("pink")) {
                    smartiesArr[4]++;
                }
                if (smarties.equals("violet")) {
                    smartiesArr[5]++;
                }
                if (smarties.equals("brown")) {
                    smartiesArr[6]++;
                }
                if (smarties.equals("red")) {
                    smartiesArr[7]++;
                }
                smarties = nextLine();
            }
            int totalTime = 0;
            int redSmartiesTime = smartiesArr[7] * redTime;
            totalTime += redSmartiesTime;

            for (int i = 0; i < smartiesArr.length - 1; i++) {
                totalTime += smartiesArr[i] / handFull * nonRedTime;
                if(smartiesArr[i] % handFull > 0){
                    totalTime += nonRedTime;
                }
            }
            System.out.println(totalTime); // print out ans;
            // // out.print();
            // out.close();
            // System.exit(0);
        }
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine());
            return st.nextToken();
        }

        // indicate failure
        return null;
    }

    // read input as integer
    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    // read input as long
    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    // read input as double
    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    // read input as line
    static String nextLine() throws IOException {
        return in.readLine();
    }
}