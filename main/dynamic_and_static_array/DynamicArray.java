package dynamic_and_static_array;

import java.util.Arrays;

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
  public boolean remove(T element) throws Exception {
    if (isEmpty()) {
      throw new Exception("The list is empty");
    }
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
  public T removeAt(int remIndex) throws Exception {
    if (remIndex < 0 || remIndex > size - 1) {
      throw new Exception(String.format("%d is out of bounds of length %d", remIndex, size));
    }

    T element = list[remIndex];
    list = removeElementAt(remIndex);
    size--;

    return element;
  }

  private T[] removeElementAt(int remIndex) {
    T[] newList = (T[]) new Object[capacity];
    for (int index = 0, newIndex = 0; index < size; index++, newIndex++) {
      if (index == remIndex) {
        newIndex--;
      } else {
        newList[newIndex] = list[index];
      }
    }
    return newList;
  }

  /**
   * Get element by index
   *
   * @param index the index to look for
   * @return the value stored in the specified index
   */
  public T get(int index) {
    return list[index];
  }

  @Override
  public String toString() {
    return Arrays.toString(Arrays.copyOf(list, size));
  }
}
