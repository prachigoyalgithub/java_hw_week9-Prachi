import java.util.HashSet;

public class Programme8_Integer {
    public static void main(String[] args) {
        HashSet<Integer> numberSet = new HashSet<>();
        numberSet.add(4);
        numberSet.add(7);
        numberSet.add(8);

        System.out.println("Numbers in the set: " + numberSet);

        System.out.print("Numbers between 1 and 10 in the set: ");
        for (int i = 1; i <= 10; i++) {
            if (numberSet.contains(i)) {
                System.out.print(i + " ");
            } else {
                // You can optionally add an else block to print numbers that are not in the set.
                // System.out.print(i + " (not in the set) ");
            }
        }
    }
}
