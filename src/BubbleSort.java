/**
 * Created by sappal on 08-08-2014.
 */
public class BubbleSort {
    public void bubbleSort () {
        int maxSize =100;
        ArrayBuB arr;
        arr = new ArrayBuB(maxSize);

        // Inserting the Values in the array
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(22);
        arr.insert(0);
        arr.insert(9);
        arr.insert(11);
        arr.insert(66);


        arr.display();

        // Applying sorting and then displaying the array

        System.out.println("After the sorting is applied "+ "\n");

        arr.sort();

        // Displaying the sorted Array

        arr.display();


    }



}

class ArrayBuB {
    private long[] a;
    private int nElems;

    public ArrayBuB(int max) {
       a = new long[max];
       nElems=0;
    }

    public void insert(long valueToBeInserted) {
        a[nElems]= valueToBeInserted; // insert the Element and increment the number of Elements present
        nElems++;
    }

    public void display() {
        for (int i =0; i< nElems;i++)
        {
            System.out.println(a[i]);
        }
    }

    public void sort () {
        // The Sorting through bubble sorting begins here
        int out, in;
        for (out = nElems -1 ;out >1; out--)
        {
            for (in= 0; in < out ; in++)
            {
                if(a[in]> a[in+1])
                {
                    swap(in, in+1);  // creating a separate method to swap the elements
                }
            }
        }


    }

    public void swap (int index1, int index2)
    {
        long temp;
        temp=a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }


}
