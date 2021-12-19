package algorithm.sorting;

public final class InsertionSort {

  public static void sort(int[] arr) {
    for (int outer = 1; outer < arr.length; outer++) {
      int temp = arr[outer];
      for (int i = outer - 1; i >= 0; i--) {
        if (arr[i] > temp) {
          arr[i + 1] = arr[i];
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = {5, 4, 3, 2, 1, 6, 10, 9, 8, 7};
    System.out.println("Before sorting:");
    for (int i : arr) {
      System.out.printf("%4d", i);
    }
    System.out.println();

    SelectionSort.sort(arr);
    System.out.println("After sorting:");
    for (int i : arr) {
      System.out.printf("%4d", i);
    }
    System.out.println();
  }
}
