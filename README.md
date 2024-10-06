# Project Overview:
This Java project implements a custom Singly Linked List to perform various operations such as insertion, deletion, searching, and sorting. The main purpose of this project is to demonstrate how to work with linked lists using object-oriented principles in Java.

# Files:
This is the main class that tests the functionality of the linked list.
It adds random elements to the list, performs searches, sorts the list, inserts and deletes elements, and prints the results.
MyLinkedList.java:

This class implements the linked list.
It supports adding, removing, sorting, and searching elements in the list.
Additional functionalities like counting negative numbers and finding the largest element in the list are also implemented.
Node.java:

This class defines the structure of a node in the linked list.
Each node contains an Object as its element and a reference to the next node.
Key Functionalities:
Adding Elements:

addFirst(Object element): Adds an element to the front of the list.
addLast(Object element): Adds an element to the end of the list.
Deleting Elements:

deleteFirst(): Deletes the first node of the list.
deleteLast(): Deletes the last node of the list.
Searching:

searchRecursively(int key): Recursively searches for a specified element in the list and returns the index if found, otherwise -1.
Sorting:

sortList(): Sorts the elements in the list using a bubble sort algorithm.
Other Functionalities:

insrtInto(int index, Object element): Inserts an element at a specified position in the list.
countNegative(): Counts the number of negative numbers in the list.
getLargest(): Finds the largest element in the list.
isEmpty(): Checks if the list is empty.

# How to Run:
Ensure that all three Java files (Lab3.java, MyLinkedList.java, Node.java) are in the same directory.
Compile the project using the following command:
bash
Copy code
javac Lab3.java
Run the program:
bash
Copy code
java myLinkedListWork.Lab3

# Example of Usage:
The program will:
Generate 30 random integers between 20 and 120 and add them to the linked list.
Print the initial list, search for the number 20, sort the list, and print the sorted list.
Demonstrate deleting and inserting nodes, counting negative values, and finding the largest value.
Finally, delete all nodes from the list and print the empty list.
Future Improvements:
Extend the list to support other types of traversal such as reverse printing.
Implement more efficient sorting algorithms like merge sort or quicksort.
Add methods for handling doubly linked lists or circular linked lists.
