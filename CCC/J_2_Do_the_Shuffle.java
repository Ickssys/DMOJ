
// The two standard imports that cover most useful classes.
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import java.util.*;
import java.io.*;

// import java.math.*; // BigInteger
public class J_2_Do_the_Shuffle // always use the problem name here
{
    // These two classes are rather fast for input and output.
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;

    // throw an IOException here so there is no need to handle errors later
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        // code here
        int button = nextInt();
        int nTimes = nextInt();
        String playList = "ABCDE";

        while(button != 4){
            while(nTimes > 0){
                if(button == 1){
                    playList = playList.substring(1) + playList.charAt(0);
                }else if(button == 2){
                    playList = playList.substring(playList.length()-1) + playList.substring(0,playList.length()-1);
                }else if(button == 3){
                    playList = playList.substring(1,2) + playList.substring(0,1) + playList.substring(2);
                }
                nTimes--;
            }
            button = nextInt();
            nTimes = nextInt();
        }

        out.println(playList.charAt(0) + " " + playList.charAt(1) + " " + playList.charAt(2) + " " + playList.charAt(3) + " " + playList.charAt(4) + " "); // print out ans;
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