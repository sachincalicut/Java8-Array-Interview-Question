import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;
import java.util.stream.IntStream;

public class Array_problem_solve {
// usage 1 : Given an array of Integers, write a Java8 program to find the seconds smallest Element.

    public static void fetchSecondSmallest(int[] arr){
        int secondSmallest = Arrays.stream(arr).distinct().sorted().skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException("The Array doesn't have a second smallest element:"));
            System.out.println("Second smallest element is the given array is:" + secondSmallest);
    }
// usage 2 : Given two arrays of integers, write a Java8 program to find the common elements between them.

    public static void fetchCommonElements(int[] arr1, int[] arr2){
      List<Integer> commonElements = Arrays.stream(arr1).filter(number -> Arrays.stream(arr2).anyMatch(arr2Number -> arr2Number==number)).boxed().collect(Collectors.toList());
        System.out.println("Second smallest element is the given set of array is:" + commonElements);
    }
// usage 3: Write a Java8 program to reverse an array of integers in place.
    public  static  void reverseGivenArrayInPlace(int[] arr){
        IntStream.range(0, arr.length/2).forEach(i -> {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        });
        System.out.println("Reverse Array in List:" + Arrays.toString(arr));
    }
// usage 4: Given an array of strings, write a java8 program to find the length of the longest string
    public static void fetchLengthofLongestStringArray(String[] strings){
       int maxLength =  Arrays.stream(strings).mapToInt(String::length).max().orElse(0);
        System.out.println("Length of the longest string is:" + maxLength);


    }



    public static void main (String[] args){

        System.out.println("*************************");
        // Output Results Usage 1
        int[] numbers = {5, 2, 8, 3, 1, 1};
        fetchSecondSmallest(numbers);

        // Output Results Usage 2
        System.out.println("*************************");
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        fetchCommonElements(array1, array2);

        // Output Results Usage 3
        System.out.println("*************************");
        int[] arr = {1, 2, 3, 4, 5};
        reverseGivenArrayInPlace(arr);

        // Output Results Usage 4
        System.out.println("*************************");
        String[] strings = {"Apple", "Banana", "Grape", "Orange", "Watermelon"};
        fetchLengthofLongestStringArray(strings);

    }

}
