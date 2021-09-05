package Linked_List;

public class ReadMe {
}

/* Reverse a linked list

    1. Three pointer
    2. Two pointer.
    3. One pointer.

 */

/* Kth element from the last

1. Fast and Slow pointer approach : Move the fast pointer k distance apart. When it reaches k distance apart start moving slow pointer also.
   at last when fast pointer reaches at the end the slow pointer will be k distance apart.
   Complexity: - O(n)
 */

/* Intersection of two LinkedList

1. Brute force :
    for in linked list 1{
        for in linked list 2 {
        }
    }
    Complexity : Time - O(n*m), Space - O(1).

2.  HashMap : Add all the elements of the 1st linked list and check if the element
              of second linked list exist in first linked list or not.
    Complexity : Time - O(m+n), Space - O(n) or O(m)

3.  Stack : Add all the elements of linked list 1 and linked list 2 in the stack 1 and stack 2.
            And after that pop element one by one from  both the linked list and the last time
            they were the same is the intersection point.
    Complexity : Time - O(m+n), Space - O(m+n)

4. Two Pointer :- Drive 1st car from linked list 1 and 2nd car from linked list 2 and when they reach the end.
                  Then restart again from the opposite side and at the end you will meet at the intersection point.
                  Because you have travelled same distance from both the cars.
   Complexity : Time - O(m+n), Space - O(1).

5.  Subtraction Approach : Calculate the side of both LinkedList and Subtract the size of bigger linked list with smaller
        and then on bigger linked list travel the subtracted difference and after that travel a single step in both the linked list
        and at last you will get the intersection point.

 */

/* K-reverse
1. Recursion + Reverse
2. Stack

 */

