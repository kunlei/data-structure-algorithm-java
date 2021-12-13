package algorithm.sorting;

/**
 * This class implements the selection sort algorithm
 */
public final class SelectionSort {

  public static void sort(int[] arr) {
    for (int outer = 0; outer < arr.length - 1; outer++) {
      int smallestIdx = outer;
      for (int inner = outer + 1; inner < arr.length; inner++) {
        if (arr[inner] < arr[smallestIdx]) {
          smallestIdx = inner;
        }
      }
      if (arr[outer] > arr[smallestIdx]) {
        int temp = arr[outer];
        arr[outer] = arr[smallestIdx];
        arr[smallestIdx] = temp;
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

    SelectionSort.sort(arr);
    System.out.println("After sorting:");
    for (int i : arr) {
      System.out.printf("%4d", i);
    }
    System.out.println();
  }
}
