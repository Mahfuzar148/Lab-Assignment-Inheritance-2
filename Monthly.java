public class Monthly extends Appointment{
//declare class member

    private int day;

//define constructor Monthly

    public Monthly(int day, String description)

    {

//call setDescription()

        setDescription(description);

//set day

        this.day = day;

    }

//define the method occursOn()

    public boolean occursOn(int year, int month, int day)

    {

//return the result

        return day == this.day;

    }

}
