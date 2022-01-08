package algorithm.search;

public class BinarySearch {

  public static <T extends Comparable<T>> int find(T[] sortedArray, T target) {
    return search(sortedArray, 0, sortedArray.length - 1, target);
  }

  public static <T extends Comparable<T>> int search(T[] sortedArray, int startingIdx, int endingIdx, T target) {
    if (endingIdx < startingIdx) {
      return -1;
    }

    int midIdx = startingIdx + (endingIdx - startingIdx) / 2;
    int comparison = target.compareTo(sortedArray[midIdx]);
    if (comparison == 0) {
      return midIdx;
    } else if (comparison < 0) {
      return search(sortedArray, 0, midIdx -1, target);
    } else {
      return search(sortedArray, midIdx + 1, endingIdx, target);
    }
  }

  public static void main(String[] args) {
    Integer[] array = new Integer[]{1, 3, 5, 9, 10, 15, 21, 100, 100};

    int target = 21;

    int idx = find(array, target);
    System.out.println("idx = " + idx);
  }
}
