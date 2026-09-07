import java.util.*;

public class NumbersArray {
    public static void main(String[] args) {
        Integer[] input = { 1, 2, 3, 4, 1, 5 };

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " +
                Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input)));

        System.out.println();

        input = new Integer[] { 1, 2, 3, 4, 1, 2, 5, 3 };

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " +
                Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input)));
    }

    // Write your methods here

    public static Integer findMax(Integer[] numbers) {

        Integer max = numbers[0];
        for (Integer num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static Integer[] findDuplicates(Integer[] numbers) {
        Integer[] temp = new Integer[numbers.length];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (numbers[i].equals(numbers[j])) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate) {
                boolean alreadyAdded = false;

                for (int j = 0; j < count; j++) {
                    if (numbers[i].equals(temp[j])) {
                        alreadyAdded = true;
                        break;
                    }
                }

                if (!alreadyAdded) {
                    temp[count] = numbers[i];
                    count++;
                }
            }
        }

        Integer[] result = new Integer[count];

        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static Integer[] findUnique(Integer[] numbers) {
        Integer[] temp = new Integer[numbers.length];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean unique = true;

            for (int j = 0; j < numbers.length; j++) {
                if (i != j && numbers[i].equals(numbers[j])) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                temp[count] = numbers[i];
                count++;
            }
        }

        Integer[] result = new Integer[count];

        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }
    // public static Integer[] findDuplicates(Integer[] numbers) {

    // Set<Integer> traversed = new HashSet<>();
    // Set<Integer> duplicates = new LinkedHashSet<>();

    // for (Integer num : numbers) {
    // if (traversed.contains(num)) { // if (!traversed.add(num))
    // duplicates.add(num);
    // }
    // traversed.add(num);
    // }

    // return duplicates.toArray(new Integer[0]);
    // }

    // public static Integer[] findUnique(Integer[] numbers) {
    // if (numbers == null || numbers.length == 0) {
    // return null; // or throw an exception
    // }

    // Set<Integer> traversed = new HashSet<>();
    // Set<Integer> duplicates = new HashSet<>();

    // for (Integer num : numbers) {
    // if (!traversed.add(num)) {
    // duplicates.add(num);
    // }
    // }

    // List<Integer> uniqueList = new ArrayList<>();
    // for (Integer num : numbers) {
    // if (!duplicates.contains(num)) {
    // uniqueList.add(num);
    // }
    // }

    // return uniqueList.toArray(new Integer[0]);
    // }
}