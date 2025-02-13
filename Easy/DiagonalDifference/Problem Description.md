# Problem Description

Given a square matrix, calculate the absolute difference between the sums of its diagonals.

###### Example: 
the square matrix arr is shown below:
``` 
1 2 3
4 5 6
9 8 9  
```
The left-to-right diagonal = 1+5+9 = 15. The right to left diagonal = 3+5+9 =17 . Their absolute difference is |15-17| = 2.

## Sample input
```
3
11 2 4
4 5 6
10 8 -12
```

## Sample output
```
15
```

## Explanation

The primary diagonal is:
```
11
   5
     -12

```
Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:
```
     4
   5
10

```
Sum across the secondary diagonal: 4 + 5 + 10 = 19
Difference: |4 - 19| = 15

