package dynamic_and_static_arrays;

/**
 * @param <T>
 */
public class DynamicArray<T> {

  public boolean isEmpty() {
    return true;
  }

  public void removeAt(int index) throws Exception {
    throw new Exception("Could not remove from empty list");
  }

  public void add(T element) throws Exception {
    throw new Exception("Out of bounds exception");
  }

  public void set(int index, T value) throws Exception {
    throw new Exception("Out of bounds exception");
  }

  public void get(int index) throws Exception {
    throw new Exception("Out of bounds exception");
  }
}
