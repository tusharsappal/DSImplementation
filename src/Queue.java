/**
 * Created by sappal on 28-09-2014.
 */
public class Queue {


    public void queueOperations() {

        int size = 10;
        QueueOperations qopr = new QueueOperations(size);

        System.out.println("Inserting 10");
        qopr.insertIntoQueue(10);
        System.out.println("Inserting 20");
        qopr.insertIntoQueue(20);
        System.out.println("Inserting 30");
        qopr.insertIntoQueue(30);
        System.out.println("Inserting 40");
        qopr.insertIntoQueue(40);

        // Now removing the elements from the queue


        qopr.removeItemFromQueue();
        qopr.removeItemFromQueue();
        qopr.removeItemFromQueue();


        // Now inserting more elements in the queue


        System.out.println("Inserting 50");
        qopr.insertIntoQueue(50);
        System.out.println("Inserting 60");
        qopr.insertIntoQueue(60);
        System.out.println("Inserting 70");
        qopr.insertIntoQueue(70);
        System.out.println("Inserting 80");
        qopr.insertIntoQueue(80);

        // Displaying the Queue Elements

        qopr.displayQueueContents();


        while (!qopr.isEmpty()) // remove and display all items
        {

            long n = qopr.removeItemFromQueue();
            System.out.print(n);
            System.out.println();
        }


        System.out.println();


    }


    class QueueOperations {

        private int queueSize;
        private long queue[];
        private int front;
        private int rear;
        private int nItems;


        QueueOperations(int queueSize) {

            this.queueSize = queueSize;
            this.queue = new long[this.queueSize];
            this.front = 0;
            this.rear = -1;
            this.nItems = 0;
        }

        public void insertIntoQueue(long item) {

            if (rear == queueSize - 1) // We will wrap around
            {
                rear = -1;
            }

            queue[++rear] = item;
            nItems++;

        }


        public long removeItemFromQueue() {

            long itemRemoved = queue[front++];

            if (front == queueSize) {

                front = 0;
            }

            nItems--;
            return itemRemoved;

        }


        public long peekFront() {

            return queue[front];
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
