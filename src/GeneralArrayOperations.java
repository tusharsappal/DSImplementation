/**
 * Created by sappal on 02-08-2014.
 */
public class GeneralArrayOperations {

    public void demoOperations() {
        int maxSize = 100;
        ArrayWrapper arrayWrapper = new ArrayWrapper(maxSize);
        arrayWrapper.insert(77);
        arrayWrapper.insert(99);
        arrayWrapper.insert(44);
        arrayWrapper.insert(55);
        arrayWrapper.insert(22);
        arrayWrapper.insert(88);
        arrayWrapper.insert(11);
        arrayWrapper.insert(00);
        arrayWrapper.insert(66);
        arrayWrapper.insert(33);

        // Displaying the list of the array Elements

        arrayWrapper.display();

        int searchKey = 35;
        if (arrayWrapper.find(searchKey)) {
            System.out.println("Found " + searchKey);
        } else {
            System.out.println("Not found " + searchKey);
        }
        // trying to find the number by binary search

        if (arrayWrapper.findByBinarySearch(55)) {
            System.out.println("Number 55 is present in the list");
        } else {
            System.out.println("Number 55 is not present in the list");
        }

        if (arrayWrapper.findByBinarySearch(1000)) {
            System.out.println("Number 1000 is present in the list");
        } else {
            System.out.println("Number 1000 is not present in the list");
        }

        arrayWrapper.delete(00);
        arrayWrapper.delete(55);
        arrayWrapper.delete(99);

        // Now displaying the array

        arrayWrapper.display();

    }

}


class ArrayWrapper {
    private long a[];
    private int nELems;

    public ArrayWrapper(int max) {
        a = new long[max];
        nELems = 0;  // This represent the number of Elements Present in the Array

    }

    // This find method iterates the list sequentially item by item , if the list grows the search time would increase
    public boolean find(long searchKey) {
        int j;
        boolean present = false;
        for (j = 0; j < nELems; j++) {
            if (a[j] == searchKey) {
                present = true;
            } else {
                present = false;
            }


        }
        return present;
    }

    // A more optimized method of searching is to apply binary searching to find the elements ,
    // applying divide and conquer techniques
    public boolean findByBinarySearch(long searchKey) {

        int lowerBound = 0;
        int upperBound = nELems - 1;
        int curIn;
        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey)
                return true; // found it
            else if (lowerBound > upperBound)
                return false; // can’t find it
            else // divide range
            {
                if (a[curIn] < searchKey)
                    lowerBound = curIn + 1; // it’s in upper half
                else
                    upperBound = curIn - 1; // it’s in lower half
            } // end else divide range
        } // end while
    } //


    public void insert(long value) {
        a[nELems] = value;
        nELems++;
    }

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nELems; j++) // look for it
            if (value == a[j])
                break;
        if (j == nELems) // can’t find it
            return false;
        else // found it
        {
            for (int k = j; k < nELems; k++) // move higher ones down
                a[k] = a[k + 1];
            nELems--; // decrement size
            return true;

        }


    }

    public void display() {
        for (int i = 0; i < nELems; i++) {
            System.out.println(a[i]);
        }
    }


}



