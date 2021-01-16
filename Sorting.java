//********************************************************************
//  Sorting.java   
//
//  Demonstrates the selection sort and insertion sort algorithms.
//********************************************************************

// Sorting method to sort through employees information, etc.
public class Sorting // angle brackets <T> threw errors
{
    //-----------------------------------------------------------------
    //  Sorts the specified array of objects using the selection
    //  sort algorithm.
    //-----------------------------------------------------------------
    public void selectionSort(Comparable[] list) // comparable <T>
    {
        int max;
        Comparable temp; // Comparable <T>

        for (int index = 0; index < list.length-1; index++)
        {
            max = index;
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo(list[max]) > 0)
                    max = scan;

            // Swap the values
            temp = list[max];
            list[max] = list[index];
            list[index] = temp;
        }
    }

    //-----------------------------------------------------------------
    //  Sorts the specified array of objects using the insertion
    //  sort algorithm.
    //-----------------------------------------------------------------
    public void insertionSort (Comparable[] list) //Comparable <T>
    {
        for (int index = 1; index < list.length; index++)
        {
            Comparable key = list[index]; // Comparable <T>
            int position = index;

            //  Shift larger values to the right
            while (position > 0 && key.compareTo(list[position-1]) < 0)
            {
                list[position] = list[position-1];
                position--;
            }

            list[position] = key;
        }
    }
}
