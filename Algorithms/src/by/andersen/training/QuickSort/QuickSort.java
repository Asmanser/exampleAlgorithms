package by.andersen.training.QuickSort;

public class QuickSort {

    private int[] array;

    public QuickSort() {}

    public QuickSort(int[] array) {
        this.array = array;
    }

    public void sort(int start, int end) {
        if (start >= end)
            return;
        int current = (start + end) / 2;
        int  i = start;
        int j = end;
        while(i < j) {
            while(i < current && array[current] >= array[i])
                i++;
            while(j > current && array[current] <= array[j])
                j--;
            if(i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if(i == current) {
                    current = j;
                } else {
                    if(j == current) {
                        current = i;
                    }
                }
            }
            printArray();
            System.out.println();
        }
        sort(start, current);
        sort(current + 1, end);
    }

    public void printArray() {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

}
