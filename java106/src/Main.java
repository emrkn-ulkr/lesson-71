import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, -4, -5};
        int[] list1 = {1, 2, 3, -4, -5};
        int[] list2 = {1141, 32, 23, 3451, 2215, 1236, 12431, 124556, 31, 3};
        double[] dList = {1.5, 421.1, 22.3, 3.41, 2.255, 155.6, 11.1, 231.6, 03.1, 39.0};

        System.out.println(Arrays.equals(list, list2));
//        int[] copyList = Arrays.copyOf(list, 2);
//        System.out.println(Arrays.toString(copyList));


        // System.out.println(Arrays.toString(list));
//        Arrays.sort(list);
//        System.out.println(Arrays.toString(list));
//        System.out.println(Arrays.binarySearch(list, -4));

        // System.out.println(Arrays.toString(list2));
        // System.out.println(Arrays.toString(dList));
    }
}
