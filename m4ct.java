import java.util.Scanner;                             //allows for user input

class Main {

    public static void main(String args[]) {

        double numbers[] = {0, 0, 0, 0, 0};           //initalization of the input number variables
        Scanner numReader = new Scanner(System.in);   //create scanner to allow user to input numbers
        System.out.println("Enter first number ");    //user prompt for number
        numbers[0] = numReader.nextDouble();          //store user input in variable, repeat 4 more times
        System.out.println("Enter second number ");
        numbers[1] = numReader.nextDouble();
        System.out.println("Enter third number ");
        numbers[2] = numReader.nextDouble();
        System.out.println("Enter fourth number ");
        numbers[3] = numReader.nextDouble();
        System.out.println("Enter fifth number ");
        numbers[4] = numReader.nextDouble();
        numReader.close();                            //close out the scanner
        
        double sum = 0;                               //initialization of all the output variables
        double average = 0;
        double maximum = numbers[0];
        double minimum = numbers[0];
        double interest = 0;
        for (double num : numbers) {                  //determining all the values needed for output
            sum = sum + num;
            if (num > maximum){
                maximum = num;
            }
            if (num < minimum){
                minimum = num;
            }
        }
        average = sum / 5;
        interest = sum * 0.20;

        System.err.println("The total of these numbers is: " + sum);        //final output lines
        System.err.println("The average of these numbers is: " + average);
        System.err.println("The maximum of these numbers is: " + maximum);
        System.err.println("The minimum of these numbers is: " + minimum);
        System.err.println("20% interest on the total of these numbers is: " + interest);

    }

}
