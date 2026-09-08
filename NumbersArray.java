/* 

Given a non-empty Integer array and the values of the elements in the array are greater than 0.
Complete the following requirements in NumbersArray.java.

    • Write a method named findMax that returns the maximum value in the array
    • Write a method named findDuplicates that returns an array (Integer[]) containing the
      duplicate values in the array
    • Write a method named findUnique that returns an array (Integer[]) containing the unique
    values in the array

    For the given inputs in the main method, output expected is:
    
*/

import java.util.*;

public class NumbersArray {
    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,1,5};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input)));       
        
        System.out.println();

        input = new Integer[] {1,2,3,4,1,2,5,3};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input))); 
    }

    public static Integer findMax(Integer[] array) {

        int res = ;

        for (int num : array) {
            if(num > res){
                res = num;
            }
        }

        return res;

    }

    public static Integer[] findDuplicates(Integer[] array) {

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();

        for (int num : array){
            if(seen.contains(num)){
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }
        
        return duplicates.toArray(new Integer[0]);

    }

    public static Integer[] findUnique(Integer[] array) {

        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : array){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        Set<Integer> unique = new LinkedHashSet<>();

        for(int num: array){
            if (freq.get(num) == 1){
                unique.add(num);
            }
        }

        return unique.toArray(new Integer[0]);
    }

}