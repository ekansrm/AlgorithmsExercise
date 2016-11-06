package algs;
import edu.princeton.cs.algs4.*;

/**
 * Created by ekansrm on 11/5/16.
 *
 */
public class e_1_1_3 {
    public static void main(String[] args) {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();

        if ((a == c) && (a == b)){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }
}
