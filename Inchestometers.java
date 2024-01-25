import java.util.Scanner;

public class Inchestometers {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the values in inches: ");
        double inches= input.nextDouble();

        double meters= inches*0.0254;
        System.out.println(inches+" and it is also equal to in meters is:"+ meters);
    }
}
