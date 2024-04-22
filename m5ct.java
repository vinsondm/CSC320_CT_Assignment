import java.util.*;

class Main {

    public static void main(String args[]) {
        //initalization of the day and temp arraylists
        ArrayList<String> Days = new ArrayList<String>();
        ArrayList<Double> Temps = new ArrayList<Double>();
        Days.add("Monday");
        Days.add("Tuesday");
        Days.add("Wednesday");
        Days.add("Thursday");
        Days.add("Friday");
        Days.add("Saturday");
        Days.add("Sunday");
        Temps.add(60.0);
        Temps.add(68.0);
        Temps.add(75.0);
        Temps.add(65.0);
        Temps.add(80.0);
        Temps.add(77.0);
        Temps.add(72.0);
        double aveTemp = (Temps.get(0) + Temps.get(1) + Temps.get(2) + Temps.get(3) + Temps.get(4) + Temps.get(5) + Temps.get(6))/7;
        //create selection var and scanner to allow user to input choices
        String choice = new String();
        Scanner scanner = new Scanner(System.in);
        //prompt user for day of week wanted
        System.err.println("Input day of week, or 'week' for summary:");
        choice = scanner.nextLine();
        switch (choice.toLowerCase()) {
            case "monday":
                System.err.println("The temperature on "+ Days.get(0) + " is: " + Temps.get(0) + " degrees.");
                break;
            case "tuesday":
                System.err.println("The temperature on "+ Days.get(1) + " is: " + Temps.get(1) + " degrees.");
                break;
            case "wednesday":
                System.err.println("The temperature on "+ Days.get(2) + " is: " + Temps.get(2) + " degrees.");
                break;
            case "thursday":
                System.err.println("The temperature on "+ Days.get(3) + " is: " + Temps.get(3) + " degrees.");
                break;
            case "friday":
                System.err.println("The temperature on "+ Days.get(4) + " is: " + Temps.get(4) + " degrees.");
                break;
            case "saturday":
                System.err.println("The temperature on "+ Days.get(5) + " is: " + Temps.get(5) + " degrees.");
                break;
            case "sunday":
                System.err.println("The temperature on "+ Days.get(6) + " is: " + Temps.get(6) + " degrees.");
                break;
            case "week":
                System.err.println("The temperature on "+ Days.get(0) + " is: " + Temps.get(0) + " degrees.");
                System.err.println("The temperature on "+ Days.get(1) + " is: " + Temps.get(1) + " degrees.");
                System.err.println("The temperature on "+ Days.get(2) + " is: " + Temps.get(2) + " degrees.");
                System.err.println("The temperature on "+ Days.get(3) + " is: " + Temps.get(3) + " degrees.");
                System.err.println("The temperature on "+ Days.get(4) + " is: " + Temps.get(4) + " degrees.");
                System.err.println("The temperature on "+ Days.get(5) + " is: " + Temps.get(5) + " degrees.");
                System.err.println("The temperature on "+ Days.get(6) + " is: " + Temps.get(6) + " degrees.");
                System.err.println("The average temperature for the week is: " + aveTemp + " degrees.");
                break;
            default:
                break;
        }
        //close out the scanner
        scanner.close();
    }
}
