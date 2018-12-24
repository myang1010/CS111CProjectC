# CS111CProjectC
Array-Based List Implementation

Implement the list interface described in Project B: Interfaces using an array-based implementation. As a reminder, that interface described a list that works like this:

entries can only be added to and removed from the beginning or end of the list
entries can be accessed in any position
entries begin at index 0
Your class header and instance data variables will be:

public class ArrayHeadTailList<T> implements HeadTailListInterface<T> 

private T[] listArray;
private int numberOfElements;
You must implement every method from the interface. Make sure to account for special conditions such as empty lists and singleton lists.

Use the interface file provided. I have also provided a tester file that displays the expected output.

ProjectCFiles.zip

Your implementation must contain these implemented methods. Follow the API descriptions from the interface file and the additional characteristics listed below.

constructor (4 points)
take an initial capacity in as a parameter
addFront (15 points)
when the array is full, expand the array by tripling (x3) the size
addBack (15 points)
when the array is full, expand the array by tripling (x3) the size
clear (4 points)
contains (8 points)
display (8 points)
see the tester program for the format of the output
the output should contain the size, the capacity, and all elements
getEntry (8 points)
isEmpty (4 points)
removeFront (15 points)
removeBack (15 points)
size (4 points)
Extra Credit (10 points)

Write a second class to implement HeadTailListInterface. (You still must complete the first class, above!)

Note that in the extra credit class, the add method won't triple the size of the behind-the-scenes object, that's okay. You also do not have to print the capacity of the list when using AList behind the scenes.

Instead of using an array, use an AList object as your instance data variable. In this way, you are using an existing data type (AList) to implement a new data type (HeadTailListInterface). Inside the methods of this class, invoke methods on the AList or LList object to accomplish the task. Note: some methods might look very simple... this does not mean they are wrong! 

The class header and instance data will be:

public class AListHeadTailList<T extends Comparable<? super T>> implements HeadTailListInterface<T>

ListInterface<T> aList; // initialize to type AList
Submitting

Remove any named package statements. Then zip together all .java files, even those that were not modified:

HeadTailListInterface (not modified)
ArrayHeadTailList
AListHeadTailList (if completing extra credit)
ListInterface (if completing extra credit, not modified)
AList (if completing extra credit, not modified)
ProjectCTester (not modified)
If submitting as a group, submit one assignment only through one group member's Canvas account. Put the names of all group members in Canvas comment box on the submission page.
