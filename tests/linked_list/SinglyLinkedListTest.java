package linked_list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SinglyLinkedListTest {

  private SinglyLinkedList<String> list;

  @Before
  public void setUp() {
    list = new SinglyLinkedList<>();
  }

  @Test
  public void it_can_create_empty_list() {
    assertTrue(list.isEmpty());
  }

  @Test
  public void it_can_add_element_to_list_tail() {
    list.add("A");
    assertFalse(list.isEmpty());
  }

  @Test
  public void it_can_get_list_size() {
    list.add("a");
    list.add("b");
    list.add("c");
    assertEquals(3, list.getSize());
  }

  @Test
  public void it_can_get_the_value_of_the_head_element() {
    list.add("a");
    list.add("b");
    list.add("c");
    assertEquals("a", list.getHead());
  }

  @Test
  public void it_can_get_the_value_of_the_tail_element() {
    list.add("a");
    list.add("b");
    list.add("c");
    assertEquals("c", list.getTail());
  }

  @Test
  public void it_can_add_element_to_beginning_of_list() {
    list.add("a");
    list.add("b");
    list.addToBeginning("c");
    assertEquals("c", list.getHead());
  }

  @Test
  public void it_can_get_string_representation() {
    list.add("a");
    list.add("b");
    list.add("c");
    assertEquals("[a, b, c]", list.toString());
  }

  @Test
  public void it_can_search_for_an_element() {
    list.add("a");
    list.add("b");
    list.add("c");
    assertEquals(2, list.indexOf("c"));
  }

  @Test
  public void it_can_get_value_by_index() throws Exception {
    list.add("a");
    list.add("b");
    list.add("c");
    assertEquals("b", list.get(1));
  }

  @Test(expected = Exception.class)
  public void it_throws_exception_if_index_was_out_of_bounds() throws Exception {
    list.add("a");
    list.add("b");
    list.add("c");
    assertEquals("b", list.get(7));
  }

  @Test(expected = Exception.class)
  public void it_throws_exception_if_index_was_a_negative_value() throws Exception {
    list.add("a");
    list.add("b");
    list.add("c");
    assertEquals("b", list.get(-1));
  }

  @Test
  public void it_can_search_for_null_element() {
    list.add("a");
    list.add(null);
    list.add("c");
    assertEquals(1, list.indexOf(null));
  }

  @Test
  public void it_can_clear_list() {
    list.add("a");
    list.add("b");
    list.add("c");
    assertEquals(3, list.getSize());

    list.clear();

    assertTrue(list.isEmpty());
    assertEquals(-1, list.indexOf("a"));
    assertEquals(0, list.getSize());
  }

  @Test
  public void it_can_remove_the_head_element() throws Exception {
    list.add("a");
    list.add("b");
    list.add("c");
    String head = list.getHead();
    list.removeAt(0);
    assertEquals(-1, list.indexOf(head));
  }

  @Test
  public void it_can_remove_the_tail_element() throws Exception {
    list.add("a");
    list.add("b");
    list.add("c");
    String tail = list.getTail();
    list.removeAt(2);
    assertEquals(-1, list.indexOf(tail));
  }

  @Test
  public void it_can_remove_at_a_particular_index_from_the_list() throws Exception {
    list.add("a");
    list.add("b");
    list.add("c");
    list.removeAt(1);
    assertEquals(-1, list.indexOf("b"));
  }

  @Test(expected = Exception.class)
  public void it_throws_exception_on_removal_if_index_was_out_of_bounds() throws Exception {
    list.add("a");
    list.add("b");
    list.add("c");
    list.removeAt(3);
  }

  @Test(expected = Exception.class)
  public void it_throws_exception_on_removal_if_index_was_negative() throws Exception {
    list.add("a");
    list.add("b");
    list.add("c");
    list.removeAt(-1);
  }

  @Test
  public void it_can_remove_arbitrary_element_from_the_list() throws Exception {
    list.add("a");
    list.add("b");
    list.add("c");
    list.remove("a");
    assertEquals(-1, list.indexOf("a"));
  }

  @Test(expected = Exception.class)
  public void it_throws_exception_on_removal_of_arbitrary_element_if_element_was_not_found()
      throws Exception {
    list.add("a");
    list.add("b");
    list.add("c");
    list.remove("z");
  }

  @Test
  public void it_can_remove_null_element() throws Exception {
    list.add(null);
    list.add("a");
    assertEquals(0, list.indexOf(null));
    list.remove(null);
    assertEquals(-1, list.indexOf(null));
  }
}
