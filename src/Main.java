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
    }




}
