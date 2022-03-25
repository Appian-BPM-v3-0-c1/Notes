public class MaxExample {
    public static void main(String[] args) {
        int[] arr = {10,5,3,7,20,1,2};
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }


    }
}
