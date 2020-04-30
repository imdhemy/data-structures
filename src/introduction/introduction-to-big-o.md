# Introduction to Big-O
As programmers, we often find ourselves asking the same two questions over and over again:
> - How much time does this algorithm need to finish?
> - How much space does this algorithm need fot its computation?

Big-O Notation gives an upper bound of the complexity in the **worst case**, helping to quantify the performance as the input size becomes **arbitrarily large**.

## List of complexities
Time | Function
---|---
Constance Time | O(1)
Logarithmic Time | O(Log(n))
Linear Time | O(n)
Linear-Logarithmic Time | O(nLog(n))
Quadratic Time | O(n<sup>2</sup>)
Cubic Time | O(n<sup>3</sup>)
Exponential Time | O(b<sup>n</sup>), b > 1
Factorial Time| O(n!)

## Big-O Properties

>O(n+c) = O(n)

>O(cn) = O(n), c > 0

Let f be a function that describes the running time of a particular algorithm for an input of size n:

>f(n) = 7log(n)<sup>3</sup> + 15n<sup>2</sup> + 2n<sup>3</sup> +8

>O(f(n)) = O(n^3) (The biggest, most dominant term in this function)

## Big-O Examples
<details>
<summary>Run in constant time: O(1)</summary>
<p>

```
a := 1
b := 2
c := a + 5 * b
```

```
i := 0
while 1 < 11
  i = i + 1
```

</p>
</details>

<details>
<summary>Run in linear time: O(n)</summary>
<p>

```
i := 0
while i < n
  i = i + 1
```
```
i := 0
while i < n
  i = i + 3
```
</p>
</details>

<details>
<summary>Run in quadratic time O(n<sup>2</sup>)</summary>
<p>

```
for(i := 0; i < n; i = i + 1)
  for(j := 0; j < n; j = j + 1)
```
```
for(i := 0; i < n; i = i + 1)
  for(j := i; j < n; j = j + 1)
```
</p>
</details>

### Extra notes
- Finding all subsets of a set: O(2<sup>n</sup>)
- Finding all permutations of a string: O(n!)
- Sorting using merge-sort: O(nLog(n))
- Iterating over all the cells in a matrix of size n by m: O(nm)
