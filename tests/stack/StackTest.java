package stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

  private Stack<String> stack;

  @Before
  public void setUp() {
    stack = new Stack<>();
  }

  @Test
  public void it_can_create_empty_stack() {
    assertTrue(stack.isEmpty());
  }

  @Test
  public void it_can_push_elements_stack() {
    stack.push("a");
    stack.push("b");
    stack.push("c");
    assertFalse(stack.isEmpty());
  }

  @Test
  public void it_can_convert_stack_to_string() {
    stack.push("a");
    stack.push("b");
    stack.push("c");
    assertEquals(Arrays.asList("a", "b", "c").toString(), stack.toString());
  }

  @Test
  public void it_can_pop_element_from_stack() throws Exception {
    List<String> items = Arrays.asList("a", "b", "c");

    for (String i : items) {
      stack.push(i);
    }

    ListIterator iterator = items.listIterator(items.size());
    while (iterator.hasPrevious()) {
      assertEquals(iterator.previous(), stack.pop());
    }
  }

  @Test
  public void it_can_get_stack_size() {
    List<String> items = Arrays.asList("a", "b", "c");

    for (String i : items) {
      stack.push(i);
    }

    assertEquals(items.size(), stack.getSize());
  }

  @Test
  public void it_can_iterate_elements() {
    List<String> items = Arrays.asList("a", "b", "c");

    for (String i : items) {
      stack.push(i);
    }

    ArrayList<String> list = new ArrayList<>();
    for (Object i : stack) {
      list.add((String) i);
    }

    ListIterator iterator = items.listIterator(items.size());
    Iterator stackIterator = stack.iterator();

    while (iterator.hasPrevious() && stackIterator.hasNext()) {
      assertEquals(iterator.previous(), stackIterator.next());
    }
  }

  @Test(expected = Exception.class)
  public void it_throws_exception_on_popping_from_empty_stack() throws Exception {
    stack.pop();
  }

  @Test(expected = Exception.class)
  public void it_throws_exception_on_popping_from_empty_stack_2() throws Exception {
    stack.push("a");
    stack.push("b");
    stack.push("c");

    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
  }

  @Test
  public void it_can_search_for_element() {
    stack.push("a");
    stack.push("b");
    stack.push("c");
    assertEquals(1, stack.indexOf("b"));
  }

  @Test
  public void it_can_search_for_element_2() {
    stack.push("a");
    stack.push("b");
    stack.push("c");
    assertEquals(-1, stack.indexOf("z"));
  }
}