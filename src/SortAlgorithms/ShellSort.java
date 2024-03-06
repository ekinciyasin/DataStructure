package SortAlgorithms;
/**
 * In-place algorithm
 * Difficult to nail down the time complexity because it will depend on the gap. Worst case: O(n2) time complexity- quadratic but it can perform much better than that.
 * Doesn't require as much shifting as insertion sort, so it usually performs better.
 * Unstable algorithm
 **/
public class ShellSort {

    public static void main(String[] args) {
        int[] intArray= {20, 35, -15, 7, 55, 1, -22};

        for(int gap = intArray.length / 2; gap > 0; gap /= 2){

            for(int i = gap; i < intArray.length; i++){
                int newElement = intArray[i];

                int j = i;
                while(j >= gap && intArray[j-gap] > newElement){
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }
                intArray[j]= newElement;
            }
        }
        for(int i = 0; i< intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }

}
