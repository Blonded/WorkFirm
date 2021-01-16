//********************************************************************
//  VacationTime.java    
// an interface to show how much vacation time a staff
// member will recieve. 
//********************************************************************

abstract public class VacationTime extends StaffMember
{
    // Set final vacation days tp 14.
    protected final int STANDARD_VACATION = 14; 
    public int vacation(){
        return vacationDays;
    }
}
