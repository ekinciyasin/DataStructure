package SortAlgorithms;
/**
 * In-place algorithm
 * Difficult to nail down the time complexity because it will depend on the gap. Worst case: O(n2) time complexity- quadratic but it can perform much better than that.
 * Doesn't require as much shifting as insertion sort, so it usually performs better.
 * Unstable algorithm
 **/
public class MergeSort {

    public static void main(String[] args) {
        int[] intArray= {20, 35, -15, 7, 55, 1, -22};



        for(int i = 0; i< intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }

    public static void mergeSort(int[] input, int start, int end){
        if(end - start < 2){
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(input, start,mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);

    }

    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);


    }



}
