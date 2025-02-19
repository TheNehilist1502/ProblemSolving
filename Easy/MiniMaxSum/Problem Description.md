# Problem Description

Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

###### Example: 
arr = [1,3,5,7,9]
The minimum sum is 1+3+5+7= 16  and the maximum sum is 3+5+7+9= 24 . The function prints
```
16 24
```

## Sample input
```
1 2 3 4 5
```

## Sample output
```
10 14
```

## Explanation
```
The numbers are 1,2 ,3 ,4 and 5 . Calculate the following sums using four of the five integers:

* Sum everything except 1, the sum is 14.
* Sum everything except 2, the sum is 13.
* Sum everything except 3, the sum is 12.
* Sum everything except 4, the sum is 11.
* Sum everything except 5, the sum is 10.
```

