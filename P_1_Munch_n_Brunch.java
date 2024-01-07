// import static java.lang.Math.max;
// import static java.lang.Math.min;
// import static java.lang.Math.abs;
// The two standard imports that cover most useful classes.
import java.util.*;
import java.io.*;
// import java.math.*; // BigInteger

public class P_1_Munch_n_Brunch//problem name here
{
    // These two classes are rather fast for input and output.
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
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

    // throw an IOException here so there is no need to handle errors later
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        // code here
        int[] cost = {12,10,7,5};
        for(int i = 0; i < 10; i++){
            int goal = nextInt();
            double[] percentages = new double[4];
            for(int j = 0; j < percentages.length; j++){
                percentages[j] = nextDouble();
            }
            int studentsAttending = nextInt();
            int max = 0, maxIdx = 0;
            int totalRaised = 0, totalCounted = 0, studentsLost = 0;
            for(int k = 0; k < percentages.length; k++){
                int proportion = (int) Math.floor(studentsAttending * percentages[k]);
                if(proportion > max){
                    max = proportion;
                    maxIdx = k;
                }
                totalRaised += proportion * cost[k];
                totalCounted += proportion;
            }
            studentsLost = studentsAttending - totalCounted;
            totalRaised += studentsLost * cost[maxIdx];
            int totalProceeds = totalRaised / 2;
            out.println(totalProceeds < goal ? "YES" : "NO");
        }
        out.close();
        System.exit(0);
    }
}