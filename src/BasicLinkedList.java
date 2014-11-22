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


}