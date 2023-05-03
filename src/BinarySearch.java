public class BinarySearch {
    public static void main(String[] args) {

        int[] arrayNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int bin = binarySearch(arrayNumber, 5);
        System.out.println(bin);
    }

    private static int binarySearch(int[] number, int findNumber) {
        int left = 0;
        int right = number.length - 1; //last element in the array

        while (left <= right) {
            int middleValue = (left + right) / 2;
            int middleNumberIs = number[middleValue];
            if (middleNumberIs == findNumber) {
                System.out.println(middleNumberIs);
            } else if (findNumber < middleNumberIs) {
                right = middleNumberIs - 1;
            } else {
                left = middleNumberIs + 1;
            }
        }
        return 0;
    }
}
