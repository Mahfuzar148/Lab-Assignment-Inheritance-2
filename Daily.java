public class Daily extends Appointment

{

//define the constructor

    public Daily(String description)

    {

//call setDescription()

        setDescription(description);

    }

//define the method occursOn()

    public boolean occursOn(int year, int month, int day)

    {

//return true

        return true;

    }

}
