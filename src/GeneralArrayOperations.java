/**
 * Created by sappal on 02-08-2014.
 */
public class GeneralArrayOperations {

public void demoOperations ()
{
    ArrayWrapper arrayWrapper = new ArrayWrapper(100);


}

}




class ArrayWrapper {
    private long a[];
    private int nELems ;

    public ArrayWrapper(int max)
    {
        a = new long[max];
        nELems=0;  // This represent the number of Elements Present in the Array

    }
    public boolean find (long searchKey)
    {
        int j;
        boolean present =false;
        for (j= 0 ;j <nELems;j++)
        {
            if(a[j]==searchKey)
            {
               present=true;
            }
            else
            {
                present=false;
            }


        }
        return present;
    }

    public void insert(long value)
    {
        a[nELems]= value;
        nELems++;
    }

    public boolean delete (long value)
    {
        boolean isDeleted =false;



        return isDeleted;

    }

}