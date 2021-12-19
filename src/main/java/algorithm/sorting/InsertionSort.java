package algorithm.sorting;

public final class InsertionSort {

  public static void sort(int[] arr) {
    for (int outer = 1; outer < arr.length; outer++) {
      int temp = arr[outer];
      int inner;
      for (inner = outer - 1; inner >= 0; inner--) {
        if (arr[inner] > temp) {
          arr[inner + 1] = arr[inner];
        } else {
          break;
        }
      }
      if (inner != outer - 1) {
        arr[inner + 1] = temp;
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

    InsertionSort.sort(arr);
    System.out.println("After sorting:");
    for (int i : arr) {
      System.out.printf("%4d", i);
    }
    System.out.println();
  }
}
