import java.util.*;

class program76_2 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Marks Percent :");
        int MarksPercent = sobj.nextInt();

        System.out.println("Enter Attendance Percent :");
        int AttendancePercent = sobj.nextInt();

        System.out.println("Enter Family Income :");
        long FamilyIncome = sobj.nextLong();

        if( MarksPercent < 0 || MarksPercent > 100 && 
            AttendancePercent < 0 || AttendancePercent > 100 && 
            FamilyIncome < 0)
        {
            System.out.println("Invalid Input ");
            return;
        }

        if( MarksPercent >= 80 && AttendancePercent >= 75 && FamilyIncome <= 300000 )
        {
            System.out.println("Scholarship Approved \n");
        }

        if(MarksPercent < 80)
        {
            System.out.println("Scholarship Rejected : Marks less than 80%");
        }
        if(AttendancePercent < 75)
        {
            System.out.println("Scholarship Rejected : Attendance percent less than 75%");
        }
        if(FamilyIncome > 300000)
        {
            System.out.println("Scholarship Rejected : Family Income is Gerater than 3,00,000");
        }

    }    
}
