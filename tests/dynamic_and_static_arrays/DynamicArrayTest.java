package dynamic_and_static_arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DynamicArrayTest {

  @Test
  public void test_it_creates_empty_list() {
    DynamicArray<Integer> list = new DynamicArray<>();
    assertTrue(list.isEmpty());
  }

  @Test
  public void test_id_add_elements_to_list() {
    DynamicArray<Integer> list = new DynamicArray<>();
    list.add(1);
    assertFalse(list.isEmpty());
  }

  @Test
  public void test_it_can_get_list_size() {
    DynamicArray<Integer> list = new DynamicArray<>();
    for (int i = 0; i < 5; i++) {
      list.add(i);
    }
    assertEquals(5, list.getSize());
  }

  @Test
  public void test_it_expands_if_reaches_max_capacity() {
    DynamicArray<Integer> list = new DynamicArray<>();
    int size = 200;
    for (int i = 0; i < size; i++) {
      list.add(i);
    }
    assertEquals(size, list.getSize());
  }

  @Test
  public void test_it_can_get_index_of_an_element() {
    DynamicArray<String> list = new DynamicArray<>();
    String[] elements = {"a", "b", "c"};
    for (String element : elements) {
      list.add(element);
    }
    assertEquals(-1, list.indexOf("z"));
    assertEquals(0, list.indexOf("a"));
    assertEquals(1, list.indexOf("b"));
    assertEquals(2, list.indexOf("c"));
  }

  @Test
  public void test_it_can_remove_an_element() {
    DynamicArray<String> list = new DynamicArray<>();
    String[] elements = {"a", "b", "c"};
    for (String element : elements) {
      list.add(element);
    }
    assertEquals(3, list.getSize());
    for (int i = 2; i >= 0; i--) {
      assertTrue(list.remove(elements[i]));
      assertEquals(i, list.getSize());
    }
  }

  @Test
  public void test_get_false_if_it_removes_unlisted_element() {
    DynamicArray<String> list = new DynamicArray<>();
    String[] elements = {"a", "b", "c"};
    for (String element : elements) {
      list.add(element);
    }
    assertEquals(3, list.getSize());
    assertFalse(list.remove("z"));
    assertEquals(3, list.getSize());
  }

  @Test
  public void test_get_negative_index_if_element_was_removed() {
    DynamicArray<String> list = new DynamicArray<>();
    String[] elements = {"a", "b", "c"};
    for (String element : elements) {
      list.add(element);
    }
    list.remove("a");
    assertEquals(-1, list.indexOf("a"));
  }
}
