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

        arrayWrapper.delete(00);
        //arrayWrapper.delete(55);
        //arrayWrapper.delete(99);

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