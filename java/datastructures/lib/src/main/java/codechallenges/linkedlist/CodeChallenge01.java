package codechallenges.linkedlist;
import java.util.Arrays;
public class CodeChallenge01 {


//This function takes an array of integers as an argument and returns an array with the elements in reversed order. It creates a new array of the same length as the orginal array with the same integers but in reversed order.



public static void main (String[] args) {
int[] arr1 = {1, 2, 3, 4, 5, 6};
int[] reversedArr1 = reverseArray(arr1);
System.out.println(Arrays.toString(reversedArr1)); // [6, 5, 4, 3, 2, 1]
}

public static int[] reverseArray(int[] arr1) {
  return null;
}

int[] arr2 = {89, 2354, 3546, 23, 10, -923, 823, -12};
int[] reversedArr2 = reverseArray(arr2);
System.out.println(Arrays.toString(reversedArr2)); // [-12, 823, -923, 10, 23, 3546, 2354, 89]

int[] arr3 = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};
int[] reversedArr3 = reverseArray(arr3);
System.out.println(Arrays.toString(reversedArr3)); // [199, 197, 193, 191, 181, 179, 173, 167, 163, 157, 151, 149, 139, 137, 131, 127, 113, 109, 107, 103, 101, 97, 89, 83, 79, 73, 71, 67, 61, 59, 53, 47, 43, 41, 37, 31, 29, 23, 19, 17, 13, 11, 7, 5, 3, 2]



}










 //INPUT
// [1, 2, 3, 4, 5, 6]
// [89, 2354, 3546, 23, 10, -923, 823, -12]
// [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199]

 //OUTPUT
// [6, 5, 4, 3, 2, 1]
// [-12, 823, -923, 10, 23, 3546, 2354, 89]
// [199, 197, 193, 191, 181, 179, 173, 167, 163, 157, 151, 149, 139, 137, 131, 127, 113, 109, 107, 103, 101, 97, 89, 83, 79, 73, 71, 67, 61, 59, 53, 47, 43, 41, 37, 31, 29, 23, 19, 17, 13, 11, 7, 5, 3, 2]
