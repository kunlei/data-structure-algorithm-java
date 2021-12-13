package algorithm.sorting;

/**
 * This class implements the bubble sort algorithm.
 * @author Kunlei Lian
 */
public final class BubbleSort {
  public static void sort(int[] arr) {
    for (int outer = arr.length - 1; outer >= 1; outer--) {
      for (int inner = 0; inner < outer; inner++) {
        if (arr[inner] > arr[inner + 1]) {
          int temp = arr[inner];
          arr[inner] = arr[inner + 1];
          arr[inner + 1] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = {5, 4, 3, 2, 1};
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
