# Stack

- [Stack](#stack)
  * [When and where is a stack used?](#when-and-where-is-a-stack-used)
  * [Complexity Analysis](#complexity-analysis)
  * [Example - Brackets](#example---brackets)
  * [Stack Implementation](#stack-implementation)

A stack is a one-ended linear data structure which models a real world stack by having two
primary operations, namely **push** and **pop**.

![stack](https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2013/03/stack.png)

## When and where is a stack used?

- Used by undo mechanisms in text editors.
- Used in compiler syntax checking for matching brackets and braces.
- Can be used to model a pile of books or plates.
- Used behind the scene to support recursion by keeping track of previous function calls.
- Can be used to do a Depth First Search (DFS) on a graph.

## Complexity Analysis
| Operation | Complexity |
| --- | --- |
| Pushing | O(1) |
| Popping | O(1) |
| Peeking | O(1) |
| Searching | O(n) |
| Size | O(1) |

## Example - Brackets
**Given a string made up of the following brackets: ()[]{}, determine whether the brackets properly match.**

| String | Status |
| --- | --- |
| [{}] | Valid |
| (()()) | Valid |
| {] | Invalid |
| [()]))() | Invalid |
| []{}({}) | Valid |

```pseudocode
Let S be a stack
For bracket in bracket_string:
    rev = getReversedBracket(bracket)
    If isLeftBracket(bracket):
        S.push(bracket)
    Else If S.isEmpty() or S.pop != rev:
        return false // invalid
return S.isEmpty() // valid if s is empty
```

- [Brackets.java](Brackets.java)
- [BracketsTest.java](./../../tests/stack/BracketsTest.java)

## Stack Implementation
- [Stack.java](Stack.java)
- [StackTest.java](./../../tests/stack/StackTest.java)
