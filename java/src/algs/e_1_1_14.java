package algs;

/**
 * Created by ekansrm on 11/6/16.
 *
 */
public class e_1_1_14 {
    public static int lg(int N) {
        int n = 0;
        for(int i = N; i > 0; i /=2) {
            n++;
        }
        return n-1;
    }
    public static void main(String[] args) {
        System.out.println(lg(1));
        System.out.println(lg(2));
        System.out.println(lg(3));
        System.out.println(lg(4));
        System.out.println(lg(5));
    }
}
