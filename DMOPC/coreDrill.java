// The two standard imports that cover most useful classes.
import java.util.*;
import java.io.*;

// import java.math.*; // BigInteger
public class Main // always use the problem name here
{
    // throw an IOException here so there is no need to handle errors later
    public static void main(String[] args) throws IOException {
        // These two classes are rather fast for input and output.
         MyScanner sc = new MyScanner();
         int r = sc.nextInt();
         int h = sc.nextInt();

         double result = Math.PI * (r * r) * h / 3;
         PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));


        out.println(result); //print out result
        out.close();
        System.exit(0);
    }

    public static class MyScanner {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(in.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        //read input as integer
        int nextInt() {
            return Integer.parseInt(next());
        }

        //read input as long
        long nextLong() {
            return Long.parseLong(next());
        }

        //read input as double 
        double nextDouble() {
            return Double.parseDouble(next());
        }

    }

}