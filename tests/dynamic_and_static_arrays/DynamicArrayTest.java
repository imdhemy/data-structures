package dynamic_and_static_arrays;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DynamicArrayTest {

  @Test
  public void test_empty_list() {
    DynamicArray<Integer> list = new DynamicArray<>();
    assertTrue(list.isEmpty());
  }

  @Test(expected = Exception.class)
  public void test_expects_exception_on_removing_from_empty_list() throws Exception {
    DynamicArray<Integer> list = new DynamicArray<>();
    list.removeAt(0);
  }

  @Test(expected = Exception.class)
  public void test_index_out_of_bounds_on_remove() throws Exception {
    DynamicArray<Integer> list = new DynamicArray<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.removeAt(3);
  }

  @Test(expected = Exception.class)
  public void test_index_out_of_bounds_on_set() throws Exception {
    DynamicArray<Integer> list = new DynamicArray<>();
    list.set(-1, 5);
  }

  @Test(expected = Exception.class)
  public void test_index_out_of_bounds_on_get() throws Exception {
    DynamicArray<Integer> list = new DynamicArray<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.get(3);
  }

  @Test(expected = Exception.class)
  public void test_index_out_of_bounds_on_get_with_negative_index() throws Exception {
    DynamicArray<Integer> list = new DynamicArray<>();
    list.get(-1);
  }
}
