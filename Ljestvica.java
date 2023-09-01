
// The two standard imports that cover most useful classes.
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import java.util.*;
import java.io.*;

// import java.math.*; // BigInteger
public class Ljestvica // always use the problem name here
{
    // These two classes are rather fast for input and output.
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;

    // throw an IOException here so there is no need to handle errors later
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        // code here
        String sequence = nextLine(), ans;
        int aTones = 0, cTones = 0;
        char ch = sequence.charAt(0);
        if (ch == 'A' || ch == 'D' || ch == 'E') {
            aTones++;
        } else if (ch == 'C' || ch == 'F' || ch == 'G') {
            cTones++;
        }
        for (int i = 1; i < sequence.length(); i++) {
            if (sequence.charAt(i) == '|' && (sequence.charAt(i + 1) == 'A' ||
                    sequence.charAt(i + 1) == 'D' || sequence.charAt(i + 1) == 'E')) {
                aTones++;
            } else if (sequence.charAt(i) == '|' && (sequence.charAt(i + 1) == 'C' ||
                    sequence.charAt(i + 1) == 'F' || sequence.charAt(i + 1) == 'G')) {
                cTones++;
            }
        }
        if(aTones == cTones){
            char lastCh = sequence.charAt(sequence.length()-1);
            if(lastCh == 'A'){
                ans = "A-mol";
            }else{
                ans = "C-dur";
            }
        }
        else if(aTones > cTones){
            ans = "A-mol";
        }else{ //aTones < cTones
            ans = "C-dur";
        }

        out.println(ans); // print out ans;
        out.close();
        // System.exit(0);
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(in.readLine());
        return st.nextToken();
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

    // read input as a line of String
    static String nextLine() throws IOException {
        return in.readLine();
    }
}