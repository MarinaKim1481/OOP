package Math;

public class mainFor {
    public static void main(String[] args) {
        multiplicityFour();
    }

    public static void multiplicityFour() {
        for (int k = 100; k >= 0; k--) {
            if (k % 4 == 0) {
                System.out.println(k);
            }
        }
    }
}
