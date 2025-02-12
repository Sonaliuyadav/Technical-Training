public class TowerOfHanoiMoves {
    public static int minMoves(int n) {
        if (n == 1) {
            return 1;
        }
        return 2 * minMoves(n - 1) + 1;
    }

    public static void main(String[] args) {
        int disks = 4;
        System.out.println("Minimum moves required: " + minMoves(disks));
    }
}
