public abstract class Appointment {




//declare the class member description

    private String description;

//define the constructor

    public Appointment()

    {

//initialize description

        description = "";

    }

//define a method to set the value of description

    public void setDescription(String description)

    {

//set the value of description

        this.description = description;

    }

//define an abstact method occursOn()

    public abstract boolean occursOn(int year, int month, int day);

//define a method toString()

    public String toString()

    {

//return the value of description

        return description;

    }

}
