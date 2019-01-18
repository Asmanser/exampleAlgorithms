package by.andersen.training.QuickSort;

public class Main {

    public static void main(String[] args) {
        int[] array = {10,7,3,2,6,1,2,9,5,4,8};
        QuickSort quickSort = new QuickSort(array);
        quickSort.sort(0,array.length - 1);
        System.out.println();
        quickSort.printArray();
    }

}
