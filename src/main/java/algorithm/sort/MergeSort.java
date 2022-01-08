package algorithm.sort;

public final class MergeSort {
  public static void sort(int[] arr) {
    mergeSort(arr, 0, arr.length - 1);
  }

  /**
   * perform merge sort on an array
   * @param arr array to be sorted
   * @param leftIdx starting index of the array
   * @param rightIdx ending index of the array
   */
  public static void mergeSort(int[] arr, int leftIdx, int rightIdx) {
    if (leftIdx < rightIdx) {
      int middleIdx = leftIdx + (rightIdx - leftIdx) / 2;
      mergeSort(arr, leftIdx, middleIdx);
      mergeSort(arr, middleIdx + 1, rightIdx);
      merge(arr, leftIdx, middleIdx, rightIdx);
    }
  }

  public static void merge(int[] arr, int leftIdx, int middleIdx, int rightIdx) {
    int leftArraySize = middleIdx - leftIdx + 1;
    int rightArraySize = rightIdx - middleIdx;

    int[] leftCopy = new int[leftArraySize];
    int[] rightCopy = new int[rightArraySize];

    for (int i = 0; i < leftArraySize; i++) {
      leftCopy[i] = arr[leftIdx + i];
    }
    for (int i = 0; i < rightArraySize; i++) {
      rightCopy[i] = arr[middleIdx + 1 + i];
    }

    int i = 0, j = 0;
    int k = 0;
    while (i < leftArraySize && j < rightArraySize) {
      if (leftCopy[i] <= rightCopy[j]) {
        arr[leftIdx + k] = leftCopy[i];
        i++;
      } else {
        arr[leftIdx + k] = rightCopy[j];
        j++;
      }
      k++;
    }

    while (i < leftArraySize) {
      arr[leftIdx + k] = leftCopy[i];
      i++;
      k++;
    }

    while (j < rightArraySize) {
      arr[leftIdx + k] = rightCopy[j];
      j++;
      k++;
    }
  }

  public static void main(String[] args) {
    int[] arr = {5, 4, 3, 2, 1};
    System.out.println("Before sorting:");
    for (int i : arr) {
      System.out.printf("%4d", i);
    }
    System.out.println();

    MergeSort.sort(arr);
    System.out.println("After sorting:");
    for (int i : arr) {
      System.out.printf("%4d", i);
    }
    System.out.println();
  }
}
