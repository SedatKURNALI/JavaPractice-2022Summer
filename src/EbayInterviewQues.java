import java.util.Arrays;

public class EbayInterviewQues {
    public static void main(String[] args) {
        /*
            Ebay Interview Question
            Put all zeros to end in an integer array
            {3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
            {0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0}
        */
        int temp = 0;
        int[] arr = {3, 0, 4, 2, 0};
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == 0) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
