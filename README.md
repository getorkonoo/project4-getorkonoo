Project 4
Due: Tuesday April 12, 2022 at noon

Assignment:  You need to write 4 classes:   
Node, Friend, SortedLinkedList, and SortedLinkedListTest.

**Purpose:** Write a sorted doubly linked list of Friend objects that simulates a simple address book.   
**Problem Description:** Write a Java program that supports a **sorted** linked list of Friend objects with **double links** and test your code.  The list is sorted in ascending order.  
**The included classes are:**	  
## Node class  
Similar to the Node class we used in class, but with a double link (forward and backwards) instead of a single link (forward only).  
Encapsulates a Node that can point forward and backwards and stores a Friend.  
Note: in the class example, a Node contains an int; in this project, a Node contains a Friend object. 
## Friend class   
It has 2 instance variables, for the name and the cell number of the Friend.  
You should include a method that compares two Friends.  
A Friend is greater than another Friend if its name is greater than the other Friend’s name.   
Note: You can look up the compareTo method of the String class.   

## SortedLinkedList class  
It includes the following instance variables and methods:  
### Instance variable: head; this list does not keep track of the number of items in the list  

### Methods:   
1. insert a Friend. This insert method inserts a Friend in such a way that the linked list is still sorted in ascending order after insertion (and is still a doubly linked list).  
The list is sorted in ascending order (you should use the method from the Friend class that compares two Friends).   
2. delete based on a cell phone value (return true or false).     
After a deletion, the list is still sorted in ascending order and is still a doubly linked list.     
3. retrieve a Friend based on the name (you can assume that no two Friends have the same name.   
4. update the cell phone (and only that) of a Friend based on the name of the Friend.   
5. selectAll Friends whose name starts with a given character (a parameter of the method) and return an ArrayList of Friend objects.   
6. toString.   
7. toStringInReverse. You cannot use recursion for this method.  
You need to traverse the list until you reach the last node and then traverse the list in reverse using the backwards links.   
8. numberOfFriends.   
All the methods in this class should include Javadoc comments.   

## SortedLinkedListTest class. It creates a linked list and inserts and deletes Friends
Test all situations for both methods; call toString and toStringInReverse after each method call to validate what happened.
Insert Friends in an empty list, at the end of the list (define your Friend object accordingly), at the beginning of the list (define your Friend object accordingly), in the middle of the list (define your Friend object accordingly).
Delete from an empty list, at the end of the list (define your Friend object accordingly), at the beginning of the list (define your Friend object accordingly), in the middle of the list (define your Friend object accordingly)
Once you have done that, offer a menu to the user to:  
1. Add a Friend
2. Update a Friend’s cell number (based on the email)
3. Select all Friends whose email end with edu
4. Exit the program  

After the user has selected an option, call the appropriate method and call toString to show the list. If the method returns an ArrayList, output the ArrayList. When asking the user to choose from the menu, ask the user to choose a number (1,2,3,4) and make sure that you list what the number means (Add a Friend, …)
 
Grading and what to submit 

Topic 	Points  
Node class as described above (Total: 8)	8  
Friend class as described above (Total: 8) 8  
SortedLinkedList class (Total: 66)	  
Instance variables	2  
Default Constructor 3  
Javadoc comments for all methods 3   
insert method	22  
delete based on a cell value method	15  
Update a Friend’s cell number based on name 5  
selectAll whose name starts with a certain character	5  
toString method 1  
getNumberOfItems 3  
toStringInReverse 3  
Javadoc comments for all methods	4  
SortedLinkedListTest class (Total: 18)  
Testing all insert scenarios  4  
Testing all delete scenarios  4  
Call toString	1  
Call toStringInReverse	1  
Menu	4  
Menu actions	4   

Your program should include **javadoc comments for all the methods in the SortedLinkedList class**, variables should have proper names, and style should be good (spacing, indentation, ..).  

**Testing**:  
You should test that your program produces the correct results, i.e. thoroughly test your program.  

1. GitHub: Completed .java files (including comments).  
2. Moodle: Same as above.  
