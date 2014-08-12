/**
 * Created by sappal on 02-08-2014.
 */
public class Main {
    public static void main (String args[])
    {
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












    }




}
