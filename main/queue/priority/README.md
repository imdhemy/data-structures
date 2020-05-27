# Priority Queue
A Priority queue is an abstract data type (ADT) that operates similar to a normal queue 
except that each element has a certain priority. The priority queue of the elements in the priority queue
determine the order in which elements are removed from the PQ.

**Note:** Priority queue only support comparable data, meaning the data inserted into the priority
queue must be able to be ordered in some way either from least to greatest or greatest to least. This
is so that we are able to assign relative priorities to each element. Heaps form the canonical 
underlying DS for priority queues.

## What is a heap?
A heap is a tree based DS that satisfies the heap invariant (also called heap property):
If A is a parent node of B the A is ordered with respect to B for all nodes A, B in the heap.
![heap](https://www.geeksforgeeks.org/wp-content/uploads/MinHeapAndMaxHeap.png)

## When and where is a PQ used?
- Used in certain implementations of Dijkstra's Shortest Path algorithm.
- Anytime you need the dynamically fetch the 'next best' or 'next worst' element.
- Used in Huffman coding (which is often used ofr lossless compression).
- Best First Search (BFS) algorithms such as A* use PQs to continuously grab the next most promising node.
- Used by Minimum Spanning Tree (MST) algorithms.

## Complexity PQ with binary heap
| Operation | Complexity |
| --- | --- |
| Binary heap construction | O(n) |
| Polling | O(log(n)) |
| peeking | O(1) |
| Adding | O(log(n)) |
| Naive Removing | O(n) |
| Advanced removing with help from a hash table * | O(log(n)) |
| Naive contains | O(n) |
| Contains check with help of a hash table * | O(1)

**Note:** Using a hash table to help optimize these operations does take up linear space
and also adds some overhead to the binary heap implementation.
