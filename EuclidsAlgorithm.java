public class EuclidsAlgorithm {
    public static void main(String[] args) {

        gcdByEuclidsAlgorithm(100,15);
    }

    static int gcdByEuclidsAlgorithm(int n1, int n2) {
        System.out.println("--- n1: " + n1 + " n2: " + n2);
        if (n2 == 0) {
            return n1;
        } else
            return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }
}
