/**
 * Created by sappal on 22-11-2014.
 */
public class BasicLinkedList {
    // This is the starting point of execution of the linkedList application and it should be called from the main method
    public void basicList() {

        LinkList Llist = new LinkList();
        Llist.insertAtFirstPosition(22, 2.99);
        Llist.insertAtFirstPosition(44, 4.99);
        Llist.insertAtFirstPosition(66, 6.99);
        Llist.insertAtFirstPosition(88, 8.99);

        Llist.displayList();


        while (!Llist.isEmpty()) {
            Link aLink = Llist.deleteFirst();
            System.out.println("Link Deleted");
            aLink.displayLink();

        }
        System.out.println();
        Llist.displayList();

    }

    public void advList() {
// Now using the advanceed LinkedList Options

        LinkList Llist = new LinkList();
        Llist.insertAtFirstPosition(22, 2.99);
        Llist.insertAtFirstPosition(44, 4.99);
        Llist.insertAtFirstPosition(66, 6.99);
        Llist.insertAtFirstPosition(88, 8.99);

        System.out.println("Printing before the element is deleted");
        Llist.displayList();


        Link f = Llist.find(44);

        if (f != null) {
            System.out.println("Found the link with  key " + f.iData);

        } else {
            System.out.println("Could not find the desired entity");
        }

        Link d = Llist.delete(66);
        if (d != null) {
            System.out.println("Deleted the link with key " + d.iData);
        } else {
            System.out.println("Can't delete the link");
        }

        System.out.println("Printing After the element is deleted");
        Llist.displayList();


    }

    public void stackOperationsUsingLinkedList() {
// We will first use the insertFirst to Insert at the First position , this would be analogous to push operation

        LinkList stackLinkList = new LinkList();

        stackLinkList.insertAtFirstPosition(10, 10.5);
// Now the push operation continues
        stackLinkList.insertAtFirstPosition(20, 10.5);
        stackLinkList.insertAtFirstPosition(40, 10.5);
        stackLinkList.insertAtFirstPosition(60, 10.5);
        stackLinkList.insertAtFirstPosition(80, 10.5);
        // Displaying the list after the push operations
        System.out.println("After the push operations the stack is ------");
        stackLinkList.displayList();

        //Now the pop operations will follow , popping out individual eateries from the list
        // DeleteFirst Method will be analogous to popping out the elements form the list
        stackLinkList.deleteFirst();
        stackLinkList.deleteFirst();
        stackLinkList.deleteFirst();

// Now displaying the remaining list elements
        System.out.println("After the pop operations the stack is ------");
        stackLinkList.displayList();

    }


}


class Link {
    public int iData;
    public double dData;
    public Link next;


    public Link(int id, double dd) {
        iData = id;
        dData = dd;

// initializing the data and the next is automatically set to null

    }

    public void displayLink() {
        System.out.print("{" + iData + ", " + dData + "} ");
    }

// end of the class Link
}

class LinkList {

    private Link first;


    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        if (first == null) {
            return true;

        } else {
            return false;
        }
    }

    public void insertAtFirstPosition(int id, double dd) {

        Link newLink = new Link(id, dd);

        newLink.next = first;
        first = newLink;

    }


    public Link deleteFirst() {
        Link temp = first;
        first = first.next;  // saving the reference of the link , and then pointing the first to the next item
        return temp;
    }

    public void displayList() {
        System.out.println("Traversal from first to last");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }


    public Link find(int key) // find link with given key
    { // (assumes non-empty list)
        Link current = first; // start at ‘first’
        while (current.iData != key) // while no match,
        {
            if (current.next == null) // if end of list,
                return null; // didn’t find it
            else // not end of list,
                current = current.next; // go to next link
        }
        return current; // found it
    }

    public Link delete(int key) {
        Link current = first;

        while (current.next.iData != key && current.next != null) {

            current = current.next;

        }

// now we have found the  entity

        Link deletedLink = current.next;
        current.next = current.next.next;
        return deletedLink;


    }


}