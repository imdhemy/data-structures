# Dynamic And Static Arrays

- [Discussion and Examples about arrays](#discussion-and-examples-about-arrays)
    - [What is an array?](#what-is-a-static-array)
    - [When and Where is an Array used?](#when-and-where-is-an-array-used)
    - [Complexity](#complexity)
    - [Static array usage example](#static-array-usage-example)
- [Dynamic Array implementation details](#dynamic-and-static-arrays)
- [Code Implementation](#code-implementation)

## Discussion and Examples about arrays

### What is a static array?
**A static array** is a fixed length container containing `n` elements indexed from the range `[0, n-1]`.

**Q: What is meant by `indexed`?**
>A: This is means that each slot/index in the array can be referenced with a number.

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

#### Static Array

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
+ 
A[0] => 44
A[1] => 12
A[4] => 6
A[7] => 9
- 
A[9] => index out of bounds!
```

### Static array usage example

## Dynamic Array implementation details
## Code Implementation