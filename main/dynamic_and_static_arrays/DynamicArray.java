package dynamic_and_static_arrays;

/**
 * @param <T>
 */
@SuppressWarnings("unchecked")
public class DynamicArray<T> {

  /**
   * internal array
   */
  private T[] list;

  /**
   * List size
   */
  private int size;

  /**
   * actual capacity
   */
  private int capacity;

  /**
   * DynamicArray Constructor
   */
  public DynamicArray() {
    capacity = 1;
    list = (T[]) new Object[capacity];
    size = 0;
  }


  /**
   * checks if list is empty
   *
   * @return {@code true} if size is zero
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * adds new element to the list
   *
   * @param element the element to be added
   */
  public void add(T element) {
    if (size + 1 >= capacity) {
      expandListCapacity();
    }
    list[size++] = element;
  }

  /**
   * Expands internal list capacity
   */
  private void expandListCapacity() {
    capacity *= 2;
    T[] doubleSizedList = (T[]) new Object[capacity];
    System.arraycopy(list, 0, doubleSizedList, 0, size);
    list = doubleSizedList;
  }

  /**
   * Get list size
   *
   * @return get list size
   */
  public int getSize() {
    return size;
  }

  /**
   * finds index of the specified element
   *
   * @param element element to search for
   * @return return {-1} if element not found, and returns zero or more if found
   */
  public int indexOf(T element) {
    for (int i = 0; i < size; i++) {
      if (element == list[i]) {
        return i;
      }
    }
    return -1;
  }

  /**
   * removes the specified element from the list
   *
   * @param element the element to be removed
   * @return {@code true} if removed
   */
  public boolean remove(T element) {
    int index = indexOf(element);
    if (index == -1) {
      return false;
    }
    removeAt(index);
    return true;
  }

  /**
   * removes the element at the specified index
   *
   * @param remIndex the index to be removed
   */
  private void removeAt(int remIndex) {
    T[] newList = (T[]) new Object[capacity];
    for (int index = 0, newIndex = 0; index < size; index++, newIndex++) {
      if (index == remIndex) {
        newIndex--;
      } else {
        newList[newIndex] = list[index];
      }
    }
    size--;
    list = newList;
  }
}
