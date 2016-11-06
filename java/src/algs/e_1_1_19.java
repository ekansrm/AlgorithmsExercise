package algs;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by ekansrm on 11/6/16.
 *
 */
public class e_1_1_19 {

    static long[] f;
    static boolean[] m;

    static {
        f = new long[100];
        m = new boolean[100];
        f[0] = 0;
        f[1] = 1;
        m[0] = true;
        m[1] = true;
    }

    public static long F(int N) {
        if (m[N]) {
            return f[N];
        }
        m[N] = true;
        f[N] = F(N-1) + F(N-2);
        return f[N];
    }
    public static void main(String[] args) {
        for (int N = 0; N < 100; N++) {
            StdOut.println(N + " " + F(N));
        }
    }



}
