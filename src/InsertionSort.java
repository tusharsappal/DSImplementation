/**
 * Created by sappal on 08-08-2014.
 */
public class InsertionSort {
    public void InsertionSort () {
        int maxSize =100;
        ArrayInsertionSort arr;
        arr = new ArrayInsertionSort(maxSize);

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

        arr.insertionSort();

        // Displaying the sorted Array

        arr.display();


    }



}

class ArrayInsertionSort {
    private long[] a;
    private int nElems;

    public ArrayInsertionSort(int max) {
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

    public void insertionSort()
    {
       int in,out;

        for (out =1; out<nElems;out++)
        {
            long temp = a[out];
            in =out;

            while (in > 0 && a[in-1]>= temp)
            {
              a[in]= a[in-1];
                in--;
            }
            a[in] = temp;

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
