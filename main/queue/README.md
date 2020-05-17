# Queues

- [Queues](#queues)
  * [When and where is a queue used?](#when-and-where-is-a-queue-used)
  * [Complexity Analysis](#complexity-analysis)
  * [Example - BFS](#example---bfs)
  * [Queue Implementation](#queue-implementation)


A queue is a linear data structure which models real world queues by having two primary operations,
namely enqueue and dequeue.

![queue](https://miro.medium.com/max/1400/0*TRbfsq86lqDoqW6b.png)

## When and where is a queue used?
- Any waiting line models a queue, for example a lineup at a movie theatre.
- Can be used to efficiently keep track of the most recently added elements.
- Web server request management where you want first come first serve.
- Breadth First Search (BFS) graph traversal.

## Complexity Analysis
| Operation | Complexity |
| --- | --- |
| Enqueue | O(1) |
| Dequeue | O(1) |
| Peeking | O(1) |
| Contains | O(n) |
| Removal | O(n) |
| Is Empty | O(1) |

## Example - BFS

```
Let Q be a Queue
Q.enque(starting_node)
starting_node.visited = true
    While Q is not empty Do
        node = Q.dequeue()
        For neighbour in neighbours(node):
            If neighbour has not been visited:
               neighbour.visited = true
               Q.enqueu(neighbour)
```

## Queue Implementation
- [Queue.java](Queue.java)
- [QueueTest.java](../../tests/queue/QueueTest.java)
