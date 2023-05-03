import java.util.Scanner;

public class BinaryySearch {
    public static void main(String[] args) {

        int[] ints = {0,1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(ints , 9));

    }

    public static int binarySearch(int [] numbers, int findNumber) {
        int right = 0;
        int left = numbers.length - 1;

        while (right <= left) {
            int middlePosition = (left + right) / 2;
            int middleNumber = numbers[middlePosition];

            if (findNumber == middleNumber){
                return middleNumber;
            }else if(findNumber < middleNumber){
                left = middleNumber - 1;
            }else{
                right  = middleNumber + 1;
            }
        }
        return right;
    }
}

