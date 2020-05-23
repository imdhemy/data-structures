package queue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.stream.IntStream;
import org.junit.Before;
import org.junit.Test;

public class QueueTest {

  private Queue<String> queue;

  @Before
  public void setUp() {
    queue = new Queue<>();
  }

  @Test
  public void it_can_create_empty_list() {
    assertTrue(queue.isEmpty());
  }

  @Test
  public void it_can_get_the_list_size() {
    assertEquals(0, queue.getSize());
  }

  @Test
  public void it_can_enqueue_elements_to_the_list() {
    queue.enqueue("a");
    queue.enqueue("b");
    queue.enqueue("c");
    assertEquals(3, queue.getSize());
    assertFalse(queue.isEmpty());
  }

  @Test
  public void it_can_dequeue_elements_from_the_list() throws Exception {
    String[] elements = {"a", "b", "c"};
    IntStream.range(0, elements.length).forEach(i -> queue.enqueue(elements[i]));
    for (String element : elements) {
      assertEquals(element, queue.dequeue());
    }
  }

  @Test
  public void it_can_search_for_an_element() throws Exception {
    assertFalse(queue.contains("a"));
    queue.enqueue("a");
    assertTrue(queue.contains("a"));
    queue.dequeue();
    queue.enqueue("a");
  }

  @Test
  public void it_can_peek_the_list() {
    String[] elements = {"a", "b", "c"};
    IntStream.range(0, elements.length).forEach(i -> queue.enqueue(elements[i]));
    IntStream.range(0, elements.length).forEach(i -> assertEquals(elements[0], queue.peek()));
  }

  @Test
  public void it_can_clear_the_list() throws Exception {
    String[] elements = {"a", "b", "c"};
    IntStream.range(0, elements.length).forEach(i -> queue.enqueue(elements[i]));
    assertEquals(elements.length, queue.getSize());
    queue.clear();
    assertEquals(0, queue.getSize());
  }
}
