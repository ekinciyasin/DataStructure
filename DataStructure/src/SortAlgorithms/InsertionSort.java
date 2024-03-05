package SortAlgorithms;
/**
 * In-place algorithm
 * O(n2) time complexity- quadratic
 * IT will take 100 steps to sort 10 items, 10,000 steps to sort 100 items
 * Stable algorithm
 **/
public class InsertionSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement; i--){
                intArray[i] = intArray[i-1];
            }
            intArray[i] = newElement;
        }


            for(int i = 0; i< intArray.length;i++) {
                System.out.println(intArray[i]);
        }
    }


}
