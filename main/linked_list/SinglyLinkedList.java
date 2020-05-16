package linked_list;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings({"unchecked", "rawtypes"})
public class SinglyLinkedList<T> implements Iterable<T> {

  /**
   * list size
   */
  private int size = 0;
  /**
   * Head node
   */
  private Node<T> head;

  /**
   * Checks if the list is empty
   *
   * @return {@code true} if size is zero
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * @param element add new element to the list
   */
  public void add(T element) {
    Node<T> node = new Node<>(element);
    if (isEmpty()) {
      head = node;
    } else {
      getTailNode().setNext(node);
    }
    size++;
  }

  /**
   * @return the list size
   */
  public int getSize() {
    return size;
  }

  /**
   * @return the list head node
   */
  public T getHead() {
    return head.getData();
  }

  /**
   * @return the tail node
   */
  private Node<T> getTailNode() {
    Node<T> node = head;
    while (node.getNext() != null) {
      node = node.getNext();
    }
    return node;
  }

  /**
   * @return the last element in the list
   */
  public T getTail() {
    return getTailNode().getData();
  }

  /**
   * @param element the element to be added to the beginning
   */
  public void addToBeginning(T element) {
    Node<T> node = new Node(element);
    node.setNext(head);
    head = node;
    size++;
  }

  /**
   * @param element the element to search for
   * @return the index of the specified element
   */
  public int indexOf(T element) {
    Node<T> node = head;
    int index = 0;

    while (node != null) {
      if (node.getData() == element) {
        return index;
      }
      index++;
      node = node.getNext();
    }

    return -1;
  }

  /**
   * @param index the index to look for
   * @return the element at the specified index
   * @throws Exception if the index was out of bounds
   */
  public T get(int index) throws Exception {
    Node<T> node = head;
    int i = 0;
    while (node != null) {
      if (i == index) {
        return node.getData();
      }
      node = node.getNext();
      i++;
    }
    throw new Exception(String.format("%d is out of bounds of %d", index, size - 1));
  }

  /**
   * Clears the list
   */
  public void clear() {
    Node<T> node = head;
    while (node != null) {
      Node next = node.getNext();
      node.setData(null);
      node.setNext(null);
      node = next;
    }
    head = null;
    size = 0;
  }

  /**
   * removes the head node
   */
  private void removeHead() {
    if (!isEmpty()) {
      head.setNext(head.getNext());
      head = null;
      size--;
    }
  }

  /**
   * removes the tail node
   */
  private void removeTail() {
    if (!isEmpty()) {
      Node node = head;
      while (node.getNext().getNext() != null) {
        node = node.getNext();
      }
      node.setNext(null);
      size--;
    }
  }

  /**
   * removes the element at the specified index
   *
   * @param index the index to remove at
   * @throws Exception if the index was out of bounds
   */
  public void removeAt(int index) throws Exception {
    if (index >= size || index < 0) {
      throw new Exception(String.format("%d is out of bounds of %d", index, size - 1));
    }
    if (index == 0) {
      removeHead();
    } else if (index == size - 1) {
      removeTail();
    } else {
      Node prev = head;
      removeAt(index, prev);
    }
  }

  /**
   * @param index the index to remove at
   * @param head  the list head node
   */
  private void removeAt(int index, Node head) {
    for (int i = 0; i < index - 1; i++) {
      head = head.getNext();
    }
    head.setNext(head.getNext().getNext());
    size--;
  }

  /**
   * removes the specified element
   *
   * @param element the element to be removed
   * @throws Exception if the element was not found
   */
  public void remove(T element) throws Exception {
    int index = indexOf(element);
    if (index < 0) {
      throw new Exception(String.format("%s not found in list %s", element.toString(), toString()));
    } else {
      removeAt(index);
    }
  }

  @Override
  public String toString() {
    ArrayList<T> elements = new ArrayList<>();
    Node<T> node = head;
    while (node != null) {
      elements.add(node.getData());
      node = node.getNext();
    }
    return elements.toString();
  }

  @Override
  public Iterator<T> iterator() {
    return new Iterator<T>() {
      private Node<T> iterator = head;

      @Override
      public boolean hasNext() {
        return iterator != null;
      }

      @Override
      public T next() {
        T data = iterator.getData();
        iterator = iterator.getNext();
        return data;
      }
    };
  }

  /**
   * Node class
   *
   * @param <T>
   */
  static class Node<T> {

    /**
     * Node data
     */
    private T data;

    /**
     * Next element
     */
    private Node next;

    /**
     * Node constructor
     *
     * @param data node value
     */
    public Node(T data) {
      this.data = data;
      next = null;
    }

    /**
     * @return get node value
     */
    public T getData() {
      return data;
    }

    /**
     * @param o set the node value
     */
    public void setData(Object o) {
      data = (T) o;
    }

    /**
     * @return the next node
     */
    public Node getNext() {
      return next;
    }

    /**
     * @param node set the next node
     */
    public void setNext(Node<T> node) {
      next = node;
    }

    @Override
    public String toString() {
      return data.toString();
    }
  }

}
