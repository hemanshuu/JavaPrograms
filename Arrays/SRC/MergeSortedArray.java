import java.util.Arrays;
public class MergeSortedArray {
   public static void main(String[] args) {
      int[] arr1 = { 1, 18, 22, 100, 105, 1002 };
      int[] arr2 = { 16, 17, 19, 21, 1001 };
      int[] arr3 = new int[arr1.length + arr2.length];
      int i = 0, j = 0, k = 0;
      while (i < arr1.length && j < arr2.length) {
           if (arr1[i] < arr2[j]) {
               arr3[k] = arr1[i];
               i++;
           } else {
               arr3[k] = arr2[j];
               j++;
           }
           k++;
      }
 
      if (i < arr1.length) {
         System.arraycopy(arr1, i, arr3, k, (arr1.length - i));
      }
 
      if (j < arr2.length) {
         System.arraycopy(arr2, j, arr3, k, (arr2.length - j));
      }
      System.out.println("Merged Sorted Array" + Arrays.toString(arr3));
   }
}