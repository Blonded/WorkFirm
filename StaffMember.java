//********************************************************************
//  StaffMember.java  
//
//  Represents a generic staff member.
//********************************************************************

// Runs through staffmembers profile, to check information and compatibility.
abstract public class StaffMember implements Payable, Comparable<StaffMember>
{
    protected String name;
    protected String address;
    protected String phone;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this staff member using the specified
    //  information.
    //-----------------------------------------------------------------
    public StaffMember(String eName, String eAddress, String ePhone)
    {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }

    //-----------------------------------------------------------------
    //  Returns a string including the basic employee information.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result = "Name: " + name + "\n";

        result += "Address: " + address + "\n";
        result += "Phone: " + phone;

        return result;
    }

    // Returns staffMembers name
    public String getName(){
        return name;
    }

   // Updates the next members name.
    public int compareTo(StaffMember otherMember)
   {
      return name.compareTo(otherMember.getName());
   }
   
  // Shows vacation time for employees.
   public abstract int vacation();

}
