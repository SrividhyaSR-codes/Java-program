package Arrays;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Array length:"+arr.length);
        System.out.println(arr[0]);
        arr[0] = 10;
        System.out.println(arr[0]);

        int ar[] = {2,3,4,5,6,7,8,1,0};
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.binarySearch(ar, 5));

        int ar1[] = new int[ar.length];
        //ar1=copyOf(ar, 4);
        ar1 = Arrays.copyOfRange(ar, 2 , 5);
        System.out.println(Arrays.toString(ar1));

        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,3,4,5};
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.compare(arr1, ar1));
        System.out.println(Arrays.mismatch(arr1, arr2));
    }

}
