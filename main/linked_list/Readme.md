# Linked List

- [Linked List](#linked-list)
  * [Definition](#definition)
  * [Where are linked lists used?](#where-are-linked-lists-used)
  * [Terminology](#terminology)
  * [Singly vs Doubly linked lists](#singly-vs-doubly-linked-lists)
  * [Singly and Doubly Linked lists Pros and Cons](#singly-and-doubly-linked-lists-pros-and-cons)
  * [Implementation Details](#implementation-details)
  * [complexity Analysis](#complexity-analysis)
  * [Source Code](#source-code)
  
## Definition
A linked list is a sequential list of nodes that hold data which points to other nodes also containing data.

![linked-list](https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2013/03/Linkedlist.png)

## Where are linked lists used?

- Used in many list, Queue & Stack implementations.
- Great for creating circular lists.
- Can easily model real world objects such as trains.
- Used in *separate chaining*, which is present in certain hashtable implementations to deal with hashing collisions.
- Often used in the implementation of adjacency for graphs.

## Terminology
<dl>
  <dt>Head:</dt>
  <dd>The first node in a linked list.</dd>
  
  <dt>Tail:</dt>
  <dd>The last node in a linked list.</dd>
  
  <dt>Pointer:</dt>
  <dd>Reference to another node.</dd>
  
  <dt>Node:</dt>
  <dd>An object containing data and pointer(s).</dd>
</dl>

## Singly vs Doubly linked lists

Singly linked lists only hold a reference to the next node. In the implementation you may always maintain
a reference to the *head* of the linked list and to the *tail* node for quick access, addiction and removal.

![singly-linked-list](https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2013/03/Linkedlist.png)

With a Doubly linked list each node holds a reference to the next and previous node. In the implementation you always maintain
a reference to the *head* and the *tail* nodes to do quick removals and additions from both ends of your list.

![doubly-linked-list](https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2014/03/DLL1.png)

## Singly and Doubly Linked lists Pros and Cons
| Type | Pros | Cons |
| --- | --- | --- |
| **Singly Linked List** | <ul><li>Uses less memory</li> <li>Simpler implementation</li></ul> | <ul><li>Can not easily access previous elements</li></ul>|
| **Doubly Linked List** | <ul><li>Can be traversed backwards</li></ul> | <ul><li>Takes 2x memory</li></ul> | <ul><li> |

## Implementation Details
//TODO: Add Implementation Details

## complexity Analysis
|  Operation | Singly Linked List | Doubly Linked List |
| --- | --- | --- |
| Search | O(n) | O(n) |
| Insert at head | O(1) | O(1) |
| Insert at tail | O(1) | O(1) |
| Remove at head | O(1) | O(1) |
| Remove at tail | O(n)| O(1) |
| Remove in middle | O(n) | O(n)|

## Source Code
- [SinglyLinkedList](SinglyLinkedList.java)
    + [SinglyLinkedListTest](./../../tests/linked_list/SinglyLinkedListTest.java)
- [DoublyLinkedList](DoublyLinkedList.java)
    + [DoublyLinkedListTest](./../../tests/linked_list/DoublyLinkedListTest.java)
