package algs;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by ekansrm on 11/5/16.
 *
 */
public class e_1_1_9 {
    public static void main(String[] args) {

        int N = StdIn.readInt();
        String s = "";
        for (int n = N; n >0; n /=2)
            s = (n % 2) + s;
        StdOut.println(s);

        StdOut.println("1"+2+3);

    }
}
