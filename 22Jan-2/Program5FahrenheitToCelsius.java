import java.util.Scanner;

public class Program5FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsius + " Celsius");
    }
}
