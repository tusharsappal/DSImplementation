/**
 * Created by sappal on 08-08-2014.
 */
public class SelectionSort {
    public void SelectionSort () {
        int maxSize =100;
        ArraySelection arr;
        arr = new ArraySelection(maxSize);

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

        arr.selectionSort();

        // Displaying the sorted Array

        arr.display();


    }



}

class ArraySelection {
    private long[] a;
    private int nElems;

    public ArraySelection(int max) {
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

    public void selectionSort()
    {
        int out, in, min;
        for(out=0; out<nElems-1; out++) // outer loop
        {
            min = out; // minimum
            for(in=out+1; in<nElems; in++) // inner loop
                if(a[in] < a[min] ) // if min greater,
                    min = in; // we have a new min
            swap(out, min); // swap them
        } // end for(out)
    }

    public void swap (int index1, int index2)
    {
        long temp;
        temp=a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }


}
