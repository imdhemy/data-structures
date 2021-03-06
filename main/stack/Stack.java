package stack;

import dynamic_and_static_array.DynamicArray;
import java.util.Iterator;

@SuppressWarnings("rawtypes")
public class Stack<T> implements Iterable {

  private int size;

  private DynamicArray<T> list;

  public Stack() {
    size = 0;
    list = new DynamicArray<>();
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void push(T element) {
    list.add(element);
    size++;
  }

  public T pop() throws Exception {
    if (isEmpty()) {
      throw new Exception("The stack is empty");
    }
    return list.removeAt(--size);
  }

  public int getSize() {
    return size;
  }

  @Override
  public String toString() {
    return list.toString();
  }

  @Override
  public Iterator iterator() {
    return new Iterator() {
      private int pointer = size - 1;

      @Override
      public boolean hasNext() {
        return pointer >= 0;
      }

      @Override
      public Object next() {
        return list.get(pointer--);
      }
    };
  }

  public int indexOf(T element) {
    return list.indexOf(element);
  }
}
