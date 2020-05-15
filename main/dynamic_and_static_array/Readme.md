# Dynamic And Static Arrays

- [Dynamic And Static Arrays](#dynamic-and-static-arrays)
  * [Discussion and Examples about arrays](#discussion-and-examples-about-arrays)
    + [When and Where is an Array used?](#when-and-where-is-an-array-used)
    + [Complexity](#complexity)
  * [What is a static array?](#what-is-a-static-array)
    + [Static Array Example](#static-array-example)
  * [What is a Dynamic Array?](#what-is-a-dynamic-array)
    + [Q: How can we implement a dynamic array?](#q-how-can-we-implement-a-dynamic-array)
    + [Dynamic Array Example](#dynamic-array-example)
  * [Dynamic Array Code](#dynamic-array-code)
---
## Discussion and Examples about arrays
### When and Where is an Array used?
- Sorting and accessing sequential data.
- Temporarily storing objects.
- Used by IO routines as buffers.
- Lookup tables and inverse lookup tables.
- Can be used to return multiple values from a function
- Used in dynamic programming to cache answers to sub-problems.

### Complexity
| Type | Access | Search | Insertion | Appending | Deletion |
|:---|:---:|:---:|:---:|:---:|:---:|
| **Static Array** | O(1) | O(n) | N/A | N/A | N/A |
| **Dynamic Array**| O(1) | O(n) | O(n) | O(1) | O(n) |

## What is a static array?
**A static array** is a fixed length container containing `n` elements indexed from the range `[0, n-1]`.

**Q: What is meant by `indexed`?**
>A: This is means that each slot/index in the array can be referenced with a number.

### Static Array Example

```
    ╔════╦════╦════╦════╦═══╦═══╦═══╦═══╦═════╗
    ║ 44 ║ 12 ║ -5 ║ 17 ║ 6 ║ 0 ║ 3 ║ 9 ║ 100 ║
A = ╠════╬════╬════╬════╬═══╬═══╬═══╬═══╬═════╣
    ║ 0  ║ 1  ║ 2  ║ 3  ║ 4 ║ 5 ║ 6 ║ 7 ║ 8   ║
    ╚════╩════╩════╩════╩═══╩═══╩═══╩═══╩═════╝
```

Elements in A are referenced by their index. There is no other way to access elements in an array. 
Array indexing is **zero-based**, meaning the first element is found position zero.

```diff
+ A[0] => 44
+ A[1] => 12
+ A[4] => 6
+ A[7] => 9
- A[9] => index out of bounds!
```

## What is a Dynamic Array?
The dynamic array can **grow** and **shrink** in size.

```
    ╔════╦═══╗
A = ║ 34 ║ 4 ║
    ╚════╩═══╝

              ╔════╦═══╦════╗
A.add(-7) A = ║ 34 ║ 4 ║ -7 ║
              ╚════╩═══╩════╝

              ╔════╦═══╦════╦════╗
A.add(34) A = ║ 34 ║ 4 ║ -7 ║ 34 ║
              ╚════╩═══╩════╩════╝

                ╔════╦════╦═══╗
A.remove(4) A = ║ 34 ║ -7 ║ 4 ║
                ╚════╩════╩═══╝
```

### Q: How can we implement a dynamic array?
**A: One way is to use a static array!**
1. Create a static array with an initial capacity.
2. Add elements to the underlying static array, keeping track of the number of elements.
3. If adding another element will exceed the capacity, then create a new static array with twice the capacity and copy the original elements into it.

### Dynamic Array Example
**Suppose we create a dynamic array with an initial capacity of two and then begin adding elements to it.**

```
╔═══╦═══╗ 
║ ∅ ║ ∅ ║
╚═══╩═══╝
╔═══╦═══╗
║ 7 ║ ∅ ║
╚═══╩═══╝ 
╔═══╦════╗
║ 7 ║ -9 ║
╚═══╩════╝
╔═══╦════╦═══╦═══╗
║ 7 ║ -9 ║ 3 ║ ∅ ║
╚═══╩════╩═══╩═══╝
╔═══╦════╦═══╦════╗
║ 7 ║ -9 ║ 3 ║ 12 ║
╚═══╩════╩═══╩════╝
╔═══╦════╦═══╦════╦═══╦═══╦═══╦═══╗
║ 7 ║ -9 ║ 3 ║ 12 ║ 5 ║ ∅ ║ ∅ ║ ∅ ║
╚═══╩════╩═══╩════╩═══╩═══╩═══╩═══╝
╔═══╦════╦═══╦════╦═══╦════╦═══╦═══╗
║ 7 ║ -9 ║ 3 ║ 12 ║ 5 ║ -6 ║ ∅ ║ ∅ ║
╚═══╩════╩═══╩════╩═══╩════╩═══╩═══╝
```

## Dynamic Array Code
- [DynamicArray.java](DynamicArray.java)
- [DynamicArrayTest.java](../../tests/dynamic_and_static_array/DynamicArrayTest.java)
