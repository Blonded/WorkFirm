//********************************************************************
//  Volunteer.java    
//
//  Represents a staff member that works as a volunteer.
//********************************************************************

// Checks to see if the staffmember is a volunteer.
public class Volunteer extends StaffMember
{
    //-----------------------------------------------------------------
    //  Constructor: Sets up this volunteer using the specified
    //  information.
    //-----------------------------------------------------------------
    public Volunteer(String eName, String eAddress, String ePhone)
    {
        super(eName, eAddress, ePhone);
    }

    //-----------------------------------------------------------------
    //  Returns a zero pay value for this volunteer.
    //-----------------------------------------------------------------
    public double pay()
    {
        return 0.0;
    }

    // Sets vacation days to 0.
    public int vacation()
    {
       return 0;
    }
}
