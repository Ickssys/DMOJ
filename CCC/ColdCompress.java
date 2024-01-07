import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
// The two standard imports that cover most useful classes.
import java.util.*;
import java.io.*;

// import java.math.*; // BigInteger
public class ColdCompress // problem name here
{
    // These two classes are rather fast for input and output.
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;

    // throw an IOException here so there is no need to handle errors later
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        // code here
        int N = nextInt();
        for (int c = 0; c < N; c++) {
            String str = next();
            String strOutput = "";
            int next = 1;
            for (int i = 0; i < str.length(); i = next) {
                int count = 1;
                int j = i + 1;
                while (j < str.length() && str.charAt(i) == str.charAt(j)) {
                    count++;
                    j++;
                }
                next = j;
                strOutput += count + " " + str.charAt(i) + " ";
            }
            out.println(strOutput);
        }

        // out.println(); // print out ans;
        out.close();
        System.exit(0);
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
