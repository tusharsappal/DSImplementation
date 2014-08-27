/**
 * Created by sappal on 26-08-2014.
 */
public class DelimiterChecker {

    private String input;

    public DelimiterChecker (String in)
    {
        input = in;
    }


    public void check () {
        int stackSize = input.length();
        DelimiterOperations delOpr = new DelimiterOperations(stackSize);


        for (int i = 0 ; i< stackSize ; i++)
        {
            char ch = input.charAt(i);
            switch (ch)
            {
                case '{':
                case '[':
                case '(':
                   delOpr.push(ch);
                   break;

                case '}':
                case ']':
                case  ')':
                    if (! delOpr.isEmpty())
                    {
                        char charPopped = delOpr.pop();

                        if ( (ch == '}' && charPopped!= '{') || ( ch == ']' && charPopped!= '[' )
                                || ( ch == ')' && charPopped != '(') )
                        {
                            System.out.println("Error: "+ch+" at "+i);
                        }

                    }

                    else
                    {    // Prematurely empty
                        System.out.println("Error: "+ch+" at "+i);
                    }
                    break;

                default:
                    break;


            }
        }

        if(!delOpr.isEmpty())
        {
            System.out.println("There exists a  delimiter whose closing end is not found ");
        }
    }

}

class DelimiterOperations {
    // Initializing the stack with the size
    char [] arr;
    int top;
    int maxSize;

    public DelimiterOperations(int size) {
        maxSize=size;
        arr = new char[maxSize];
        top =-1;
    }

    public void push(char characterToBePushed) {
        if(top > maxSize)
            return;
        else
        {
            arr[++top]= characterToBePushed;
            System.out.println("Element Pushed is "+ characterToBePushed);

        }

    }

    public char pop () {

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