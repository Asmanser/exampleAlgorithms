package by.andersen.training.BinarySearch;

public class BinarySearch {

    private int[] array;

    public BinarySearch(int[] array) {
        this.array = array;
    }

    public int search(int element) {
        int start = 0;
        int end = array.length - 1;
        while(start <= end) {
            int mid = (end + start) / 2;
            if(array[mid] == element) {
                return mid;
            }
            if(array[mid] > element) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

}
