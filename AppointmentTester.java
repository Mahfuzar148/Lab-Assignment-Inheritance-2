//define the method AppointmentTester

public class AppointmentTester {

//define main method

    public static void main(String[] args) {

//print the message

        System.out.print("Daily is subclass of Appointment: ");

//get the super class of appoinment, if it is Daily print true, false otherwise

        System.out.println(Daily.class.getSuperclass() == Appointment.class);

//print the expected result

        System.out.println("Expected: true");

//print the message

        System.out.print("Daily appointments have no extra fields:");

// if Daily has no extra fields print true

        System.out.println(Daily.class.getDeclaredFields().length == 0);

//print the expected value

        System.out.println("Expected: true");

// Try some appointments

        Appointment obj = new Daily("walk the dog");

//print the daily appoinment

        System.out.println("Checking daily appointment: " + obj);

//print the expected appoinment

        System.out.println("Expected: walk the dog");

//call the method occursOn on a particular date. print the result

        System.out.println(obj.occursOn(2016, 12, 25));

//print the expected result

        System.out.println("Expected: true");

    }
}

