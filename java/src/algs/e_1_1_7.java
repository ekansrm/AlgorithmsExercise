package algs;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by ekansrm on 11/5/16.
 */
public class e_1_1_7 {
    public static void main(String[] args) {

        double t  = 9.0;
        while (Math.abs(t - 9.0/t) > 0.001)
        {
            t = (9.0/t + t)/2;
        }
        StdOut.printf("%.5f\n", t);

        int sum = 0;
        for (int i=1; i< 1000; i *= 2)
            for (int j = 0; j < i; j++)
                sum++;
        StdOut.println(sum);


    }
}
