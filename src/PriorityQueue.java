/**
 * Created by sappal on 06-10-2014.
 */
public class PriorityQueue {


    public void priorityQueueOperations() {

        int size = 10;
        PriorityQueueOperations pqopr = new PriorityQueueOperations(size);

        System.out.println("Inserting 30");
        pqopr.insertIntoQueue(30);
        System.out.println("Inserting 50");
        pqopr.insertIntoQueue(50);
        System.out.println("Inserting 10");
        pqopr.insertIntoQueue(10);
        System.out.println("Inserting 40");
        pqopr.insertIntoQueue(40);
        System.out.println("Inserting 20");
        pqopr.insertIntoQueue(20);


        while (!pqopr.isEmpty()) // remove and display all items
        {

            long n = pqopr.removeItemFromQueue();
            System.out.print(n);
            System.out.println();
        }

        System.out.println();

    }


    class PriorityQueueOperations {

        private int queueSize;
        private long queue[];
        private int nItems;


        PriorityQueueOperations(int queueSize) {

            this.queueSize = queueSize;
            this.queue = new long[this.queueSize];
            this.nItems = 0;
        }

        public void insertIntoQueue(long item) {

            int j;
            if (nItems == 0) // if no items,
                queue[nItems++] = item; // insert at 0
            else // if items,
            {
                for (j = nItems - 1; j >= 0; j--) // start at end,
                {
                    if (item > queue[j]) // if new item larger,
                        queue[j + 1] = queue[j]; // shift upward

                    else // if smaller,
                        break; // done shifting
                } // end for
                queue[j + 1] = item; // insert it
                nItems++;
            } // end else (nItems > 0)

        }


        public long removeItemFromQueue() {

            return queue[--nItems];

        }


        public long peekMin() {

            return queue[nItems - 1];
        }


        public boolean isEmpty() {

            if (nItems == 0)
                return true;
            else
                return false;


        }


        public boolean isFull() {

            if (nItems == queueSize) {
                return true;
            } else {
                return false;
            }


        }

        public int size() {

            return nItems;

        }


        public void displayQueueContents() {

            for (int itr = 0; itr < nItems; itr++) {
                System.out.println("Has item" + queue[itr]);
            }
        }


    }


}
