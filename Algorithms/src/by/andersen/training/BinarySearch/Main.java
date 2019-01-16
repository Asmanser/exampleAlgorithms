package by.andersen.training.BinarySearch;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,7,8,10,15,76,265,876,987,988,999, 1200};
        BinarySearch binarySearch = new BinarySearch(array);
        int index = binarySearch.search(10);
        System.out.println(index);
        System.out.println(array[index]);
    }

}
