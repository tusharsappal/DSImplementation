/**
 * Created by sappal on 24-11-2014.
 */
public class DoublyLinkedList {


    public void basicInsertionDoublyLinkedListFirst() {
        DoubleEndedLinkedList dbeList = new DoubleEndedLinkedList();
        // Inserting the Elements in the doubleEndedList
        dbeList.insertFirst(10);
        dbeList.insertFirst(20);
        dbeList.insertFirst(30);
        dbeList.insertFirst(40);
        dbeList.insertFirst(50);

        // Now displaying the list

        dbeList.displayForward();
    }

    public void basicInsertionDoublyLinkedListLast() {
        DoubleEndedLinkedList dbeList = new DoubleEndedLinkedList();
        dbeList.insertLast(10);
        dbeList.insertLast(20);
        dbeList.insertLast(30);
        dbeList.insertLast(40);
        dbeList.insertLast(50);

        // Now displaying the list items

        dbeList.displayForward();

    }

    public void basicDeletionFirstDoublyLinkedList() {
        DoubleEndedLinkedList dbeList = new DoubleEndedLinkedList();

        dbeList.insertFirst(10);
        dbeList.insertFirst(20);
        dbeList.insertFirst(30);
        dbeList.insertFirst(40);
        dbeList.insertFirst(50);
        dbeList.insertFirst(60);

        // Now we have inserted the elements we will be displaying them

        System.out.println("Displaying the Elememts in the List ");

        dbeList.displayForward();


        dbeList.deleteFirst();
        // Now the deletion starts
        dbeList.deleteFirst();
        dbeList.deleteFirst();
        dbeList.deleteFirst();
        dbeList.deleteFirst();

        // now displaying the lsit again

        dbeList.displayForward();

        // now removing the last item also

        dbeList.deleteFirst();

        // displaying the list again

        dbeList.displayForward();

    }
}


// This DoublyLink class id used to create a double ended Link , having pointers pointing in forward and backward directions

class DoublyLink {
    public long dData;
    public DoublyLink next;
    public DoublyLink previous;


    public DoublyLink(long d) {
        dData = d;

// initializing the data and the next is automatically set to null

    }

    public void displayLink() {
        System.out.print("{" + dData + "} ");
    }

// end of the class Link
}

class DoubleEndedLinkedList {

    DoublyLink first;
    DoublyLink last;

    public DoubleEndedLinkedList() {
        first = null;
        last = null;

    }

    public boolean isEmpty() {
        if (first == null) {
            return true;
        } else {
            return false;
        }
    }


    public void insertFirst(long d) {
        DoublyLink newLink = new DoublyLink(d);

        // If empty List
        if (isEmpty()) {

            first = newLink;
            last = newLink;
        } else {

            newLink.next = first;
            first = newLink;
            newLink.previous = first;

        }
    }


    public void insertLast(long d) {

        DoublyLink newLink = new DoublyLink(d);

        // If empty List
        if (isEmpty()) {
            first = newLink;
            last = newLink;

        } else {
            newLink.previous = last;
            last.next = newLink;
            last = newLink;

        }


    }

    public DoublyLink deleteFirst() {
        DoublyLink temp = first;
        if (first.next == null) // If I have only one element to play with
        {
            last = null;

        } else {
            first.next.previous = null;
        }

        first = first.next;

        return temp;
    }

    public void displayForward() {
        System.out.print("---------List (first-->last): -----------");
        DoublyLink current = first; // start at beginning
        while (current != null) // until end of list,
        {
            current.displayLink(); // display data
            current = current.next; // move to next link
        }
        System.out.println("");
    }
}