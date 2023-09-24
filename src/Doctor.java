import java.sql.Time;

public class Doctor extends User implements Employee {

    int id;
    String name;
    String specialization;
    //Constructor
    //Method overload: declare same method with different params and returns
    public Doctor ( String email ) {
        super( email );
    }



    public Doctor( String name, String email ) {
        //Super call the parent class methods and properties
        super( email );

        this.name = name;
        System.out.println("Constructing doctor");

        Appointment appointment1 = new Doctor.Appointment( "00:00:00  \n"); // or just call new Appointment
        System.out.println(appointment1);
    }

    public String getName() {
        return name;
    }

    //Override the method of the implemented interface
    @Override
    public double commissions() {
        return 0;
    }

    @Override
    void showData() {
        System.out.println("show data");
    }


    //Inner static class is recommended over nested instantiated classes
    public  static  class Appointment {

        public static String time;
        Appointment( String time ) {
            Appointment.time = time;
        }

        //Override change the behavior of a method declared on the parent. So polymorphism
        @Override
        public String toString() {
            return "Have a appointment at: " + Appointment.time;
        }
    }


}
