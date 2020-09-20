package com.dataStructure.arrays.highArray;

public class HighArray {

    private final long[] a; // ref to array a
    private int nElements; // number of data items
    //-----------------------------------------------------------
    public HighArray(int max) // constructor
    {
        a = new long[max]; // create the array
        nElements = 0; // no items yet
    }
    //-----------------------------------------------------------
    public boolean find(long searchKey)
    { // find specified value
        int j;
        for(j=0; j< nElements; j++) // for each element,
            if(a[j] == searchKey) // found item?
                break; // exit loop before end
        // gone to end?
        // no, found it
        return j != nElements; // yes, can’t find it
    } // end find()
    //-----------------------------------------------------------
    public void insert(long value) // put element into array
    {
        a[nElements] = value; // insert it
        nElements++; // increment size
    }
    //-----------------------------------------------------------
    public boolean delete(long value)
    {
        int j;
        for(j=0; j< nElements; j++) // look for it
            if( value == a[j] )
                break;
        if(j== nElements) // can’t find it
            return false;
        else // found it
        {
            // g move higher ones down
            if (nElements - j >= 0) System.arraycopy(a, j + 1, a, j, nElements - j);
            nElements--; // decrement size
            return true;
        }
    } // end delete()
    //-----------------------------------------------------------
    public void display() // displays array contents
    {
        for(int j = 0; j< nElements; j++) // for each element,
            System.out.print(a[j] + " "); // display it
        System.out.println(" ");
    }
//-----------------------------------------------------------
}
