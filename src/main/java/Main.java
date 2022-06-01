import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(ListOperations.partition(Arrays.asList(1, 2, 3, 4, 5), 2));
        System.out.println(ListOperations.partition(Arrays.asList(1, 2, 3, 4, 5), 3));
        System.out.println(ListOperations.partition(Arrays.asList(1, 2, 3, 4, 5), 1));

    }
}
