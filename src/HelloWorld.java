/**
 * Print greetings to someone in the command line
 *
 * @author Victor
 */

public class HelloWorld {
    //Constant variable with many words is on upper case and
    //Separated with underscore "_"
    public static final String JAVA_VERSION = "11";


    public static void main(String[] args) {
        //Regular variable and functions use Lower Camel Case
        String greetingText = "Hello";

        //Array with fixed type and number of elements
        String[] oneDimension = new String[10];
        String[][] twoDimensions = new String[10][2]; // 1 array with 10 arrays inside that have 2 elements

        System.out.println( greetingText + ",");

        String name = "Victor";
        printName( name );
        printJavaVersion();

        //Working with custom object
        String email = "victor@mail.com";

        Doctor doctor1 = new Doctor( name, email );
        System.out.println(doctor1.getName());
        System.out.println(doctor1.getEmail());

        Doctor doctor2 = new Doctor( email );

        //Object assignation to another variable points to the same object and properties
        Doctor doctor3 = doctor1;
        doctor3.setEmail("another@mail.com");
        System.out.println(doctor3.getEmail());
        System.out.println(doctor1.getEmail());


    }

    /**
     * Print the name on command line
     * @param name Name to print
     * @author Victor
     */
    public static void printName( String name) {

        System.out.println(name);
    }

    /**
     * Get the static Java Version
     * @return JAVA_VERSION String
     * @author Victor
     */
    public static String getJavaVersion() {
        return JAVA_VERSION;
    }

    /**
     * Print the java version on command line
     * @author Victor
     */
    private  static  void printJavaVersion () {
        System.out.println( " " );
        System.out.println( "Printed with Java version: " + JAVA_VERSION );
    }
}
