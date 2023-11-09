import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
// The two standard imports that cover most useful classes.
import java.util.*;
import java.io.*;
// import java.math.*; // BigInteger

public class S_1_Voronoi_Villages //problem name here
{
    // These two classes are rather fast for input and output.
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;

    // throw an IOException here so there is no need to handle errors later
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        // code here
        int N = nextInt();
        double[] villages = new double[N];

        for (int i = 0; i < N; i++) {
            villages[i] = nextDouble();
        }
        Arrays.sort(villages);
        double size = Integer.MAX_VALUE;
        for(int i = 1; i < villages.length - 1; i++){
            double leftSize = (villages[i] / 2.0 - villages[i-1] / 2.0); 
            double rightSize = (villages[i + 1] / 2.0 - villages[i] / 2.0); 
            double villageSize = leftSize + rightSize;
            if(villageSize < size){
                size = villageSize;
            }
        }



        out.printf("%.1f", size); // print out ans;
        //out.print();
        out.close();
        //System.exit(0);
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()){ st = new StringTokenizer(in.readLine());
        return st.nextToken();}
        
        //indicate failure
        return null;
    }

    // read input as integer
    static int nextInt() throws IOException {return Integer.parseInt(next());}

    // read input as long
    static long nextLong() throws IOException {return Long.parseLong(next());}

    // read input as double
    static double nextDouble() throws IOException {return Double.parseDouble(next());}
    
    // read input as line
    static String nextLine() throws IOException {return in.readLine();}
}