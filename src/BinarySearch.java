import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};

        findNumberInBinarysearch(arr1,13);
    }//main

    public static void  findNumberInBinarysearch( int arr[], int n){
        int low = 0;
        int high = arr.length -1;

        while(low <= high){
            double mid = Math.ceil((low + high)/2);
            int guess = arr[(int)mid];
            if(guess == n){
                System.out.println("the number is" + mid);
                break;
            } else if(guess > n) {
                high = (int)mid -1;
            } else if (guess < n){
                low = (int)mid +1;
            }
        }//while

    }//findInNumber
}//binarysearch
