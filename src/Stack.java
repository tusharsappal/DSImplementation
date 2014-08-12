/**
 * Created by sappal on 12-08-2014.
 */
public class Stack {
    public void stackOpeartions () {
        int size = 10;
        StackOperations stkOpr = new StackOperations(size);
        stkOpr.push(10);
        stkOpr.push(20);
        stkOpr.push(30);
        stkOpr.push(40);
        stkOpr.push(50);
        stkOpr.push(60);

        System.out.println("---------------- Now the Popping Starts-----------------");

        // Popping out all the elements
        while(! stkOpr.isEmpty())
        {
            long value = stkOpr.pop();
            System.out.println("value Popped is "+ value);
        }

    }

}


class StackOperations {
    // Initializing the stack with the size
    long [] arr;
    int top;
    int maxSize;

    public StackOperations(int size) {
        maxSize=size;
        arr = new long[maxSize];
        top =-1;
    }

    public void push(long elementToBePushed) {
        if(top > maxSize)
            return;
        else
        {
            arr[++top]= elementToBePushed;
            System.out.println("Element Pushed is "+ elementToBePushed);

        }

    }

    public long pop () {
        return arr[top--];
    }

    public void peek () {

        System.out.println(arr[top]);
    }

    public boolean isEmpty () {
        if (top == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public boolean isFull () {
        if(top == maxSize -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}
