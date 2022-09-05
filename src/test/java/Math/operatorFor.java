package Math;

public class operatorFor {

    public static void main(String[] args) {
        for (int k = 100; k >= 0; k--)
            multiplicityFour(k);
    }

    public static void multiplicityFour(int k) {
        if (k % 4 == 0) {
            System.out.println(k);
        }

    }
}