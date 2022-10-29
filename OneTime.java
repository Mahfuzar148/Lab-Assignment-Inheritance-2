class Oneime extends Appointment

{

//class members

    private int year;

    private int month;

    private int day;

//define constructor Onetime()

    public Oneime(int year, int month, int day, String description)

    {

//set the value of class members

        setDescription(description);

        this.year = year;

        this.month = month;

        this.day = day;

    }

//define method occursOn()

    public boolean occursOn(int year, int month, int day)

    {

//return the result

        return year == this.year && month == this.month && day == this.day;

    }

}

