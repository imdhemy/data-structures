package queue;

import dynamic_and_static_array.DynamicArray;

public class Queue<T> {

  private DynamicArray<T> list = new DynamicArray<T>();

  public boolean isEmpty() {
    return list.isEmpty();
  }

  public int getSize() {
    return list.getSize();
  }

  public void enqueue(T element) {
    list.add(element);
  }

  public T dequeue() throws Exception {
    return list.removeAt(0);
  }

  public boolean contains(T a) {
    return list.indexOf(a) >= 0;
  }

  public T peek() {
    return list.get(0);
  }

  public void clear() throws Exception {
    int size = list.getSize();
    for (int i = 0; i < size; i++) {
      dequeue();
    }
  }
}
