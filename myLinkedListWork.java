
package myLinkedListWork;

import java.util.Random;


public class myLinkedListWork {


    public static void main(String[] args) {
     
        MyLinkedList test = new MyLinkedList();
        Random random = new Random();
        
        //creating the random int values and putting them into the linkedlist
        for (int i = 0; i < 30; i++){
          int element = random.nextInt(101) + 20;
          test.addLast(element);  
        }
        
        //printing out the numbers
        test.print();
        
        //searching for number 20
        int found = test.searchRecursively(20);
        if (found != -1){
            System.out.println("\nFound\n");
        } else {
            System.out.println("\nNot found\n");
        }
        
        //sorting the list then displaying it
        test.sortList();
        test.print();
        
        //deleting a node
        test.deleteFirst();
        test.print();
        
        //inserting int 9999 into a position 7 
        test.insrtInto(6, 9999);
        test.print();
        
        //I know that these were not specificly asked for, i just wanted to test them to make sure they work
        System.out.println("\nnegatives: " + test.countNegative());
        System.out.println("largest: " + test.getLargest() + "\n");
        
        
        //deleteing the list
        while (test.isEmpty() != true){
            test.deleteFirst();
        }
        test.print();   //printing the list to make sure it is empty
        
        
    }
    
}
