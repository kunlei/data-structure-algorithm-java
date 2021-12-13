package algorithm.sorting;

public class BubbleSort {
  public static void sort(int[] arr) {
    int size = arr.length;
    for (int i = size - 1; i >= 1; i--) {
      for (int j = 0; j < i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = {5, 4, 3, 2, 1, 7, 6, 9, 10, 13, 11, 12};
    System.out.println("Before sorting:");
    for (int i : arr) {
      System.out.printf("%4d", i);
    }
    System.out.println();

    BubbleSort.sort(arr);
    System.out.println("After sorting:");
    for (int i : arr) {
      System.out.printf("%4d", i);
    }
    System.out.println();
  }
}
