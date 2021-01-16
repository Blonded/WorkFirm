//********************************************************************
// FileName: Firm.java 
//
// Polymorphism
// Demonstrates polymorphism via inheritance.
//
// THIS IS THE DRIVER PROGRAM. 
// This program runs through each staffmember listed.
// it then checks to see who the employee is,
// what their hourly is,
// if they are volunteers,
// and sorts through each employee to display their information to the screen
// including their vacation days.
//
//********************************************************************

public class Firm
{
    //-----------------------------------------------------------------
    //  Creates a staff of employees for a firm and pays them.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        Staff personnel = new Staff();

        personnel.sort();   //call sort method before payday
        personnel.payday();
    }
}

