package algorithm.search;

public class BinarySearch {

  /**
   * find the index of the target in the sorted list
   * @param sortedList input list of sorted elements
   * @param target target element
   * @param <T> element type
   * @return index of the target element, -1 if not found
   */
  public static <T extends Comparable<T>> int find(T[] sortedList, T target) {
    return search(sortedList, 0, sortedList.length - 1, target);
  }

  /**
   * find the index of the target element from the given range of a sorted list
   * @param sortedList sorted list
   * @param startingIdx starting index, inclusive
   * @param endingIdx ending index, inclusive
   * @param target target element
   * @param <T> element type
   * @return index of the target, -1 if not found
   */
  public static <T extends Comparable<T>> int search(T[] sortedList, int startingIdx, int endingIdx, T target) {
    if (endingIdx < startingIdx) {
      return -1;
    }

    int midIdx = startingIdx + (endingIdx - startingIdx) / 2;
    int comparison = target.compareTo(sortedList[midIdx]);
    if (comparison == 0) {
      return midIdx;
    } else if (comparison < 0) {
      return search(sortedList, 0, midIdx -1, target);
    } else {
      return search(sortedList, midIdx + 1, endingIdx, target);
    }
  }

  public static void main(String[] args) {
    Integer[] array = new Integer[]{1, 3, 5, 9, 10, 15, 21, 100, 200};

    int target = 100;
    int idx = find(array, target);
    System.out.println("idx = " + idx);
  }
}
