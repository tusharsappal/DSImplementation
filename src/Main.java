/**
 * Created by sappal on 02-08-2014.
 */
public class Main {
    public static void main(String args[]) {

        // Implementing the General Array Implementations
        System.out.println("Displaying the general Array operations \n");
        GeneralArrayOperations generalArrayOperations = new GeneralArrayOperations();
        generalArrayOperations.demoOperations();

        System.out.println("Displaying the power of Bubble Sort");
        // Implementing the Bubble Sort Algorithm
        BubbleSort bubSort = new BubbleSort();
        bubSort.bubbleSort();

        System.out.println("Displaying the power of Selection Sort");
        //Implementing the Selection Sort
        SelectionSort selSort = new SelectionSort();
        selSort.SelectionSort();

        System.out.println("Displaying the power of Insertion Sort");
        // Implementing the Insertion Sort Algorithm
        InsertionSort inSort = new InsertionSort();
        inSort.InsertionSort();

        System.out.println("Displaying the power of general Stack Operations in Java");
        // Implementing the Basic Stack Operations in Java
        Stack stk = new Stack();
        stk.stackOpeartions();


        System.out.println("Checking for the delimiter's consistency");
        // Implementing the Logic to check for the syntax of the statement using the basic stack operations
        DelimiterChecker delimiterChecker = new DelimiterChecker("a{b(c]d}e");
        delimiterChecker.check();

        // Making Another Round of Checking

        DelimiterChecker delimiterChecker1 = new DelimiterChecker("{[(abc)]}");
        delimiterChecker1.check();

        // Implementing the Basic Queue Operations in Java
        System.out.println("Displaying the power of the general Queue Operations in Java");

        Queue que = new Queue();
        que.queueOperations();

        PriorityQueue pqueue = new PriorityQueue();
        pqueue.priorityQueueOperations();

        // Implementing the Basic Linked List Operations

        BasicLinkedList bList = new BasicLinkedList();
        System.out.println("---Basic Linked List Operations---");
        // Performing some of the Basic Linked List Operations
        bList.basicList();
        // Performing some of the advanced Linked List Operations
        System.out.println("---Advanced Linked List Operations---");
        bList.advList();

        // Performing the basic Stack operations using the Linked List
        System.out.println("---Stack Operations using the LinkedList----");
        bList.stackOperationsUsingLinkedList();

        // Performing the basic queue operations using the Linked List Infrastructure

        System.out.println("---Queue Operations using the LinkedList-----");
        bList.queueOpeartionsUsingLinkedList();

        // Displaying insertion , deletion and other operations using a Doubly Linked List
        DoublyLinkedList dbList = new DoublyLinkedList();
        // Calling the insertion and forward display function
        System.out.println("Calling insertion at First Location and displaying the list in forward direction");
        dbList.basicInsertionDoublyLinkedListFirst();
        System.out.println("Calling insertion at Last Location and displaying the list in forward direction");
        dbList.basicInsertionDoublyLinkedListLast();
        System.out.println("Calling insertion at First Location, deletion at first location and then  displaying the list in forward direction");
        dbList.basicDeletionFirstDoublyLinkedList();

    }

}
