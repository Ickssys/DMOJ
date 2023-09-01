
// The two standard imports that cover most useful classes.
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import java.util.*;
import java.io.*;

// import java.math.*; // BigInteger
public class Kemija // always use the problem name here
{
    // throw an IOException here so there is no need to handle errors later
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        // code here
        Scanner in = new Scanner(System.in);
        
        while(in.hasNext()){
            String token = in.next();
            StringBuilder nString = new StringBuilder(token);
            for(int i = 0; i < nString.length(); i++){
                if(nString.charAt(i) == 'a' || nString.charAt(i) == 'e' 
                || nString.charAt(i) == 'i' || nString.charAt(i) == 'o' || nString.charAt(i) == 'u'){
                    nString.delete(i, i + 2);
                }
            }
            out.print(nString + " ");
        }
        // out.println();
        out.close();
    }
}