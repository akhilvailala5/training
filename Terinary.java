import java.util.ArrayList;
import java.util.Scanner;

public class Terinary {
    public static void main(String[] args) {
        Scanner inputs =new Scanner(System.in);
//        System.out.println(" enter a number 1: ");
//        int num1= inputs.nextInt();
//        System.out.println(" enter a number 2: ");
//        int num2= inputs.nextInt();
//        System.out.println(" enter a number 3: ");
//        int num3= inputs.nextInt();
//        System.out.println(" enter a number 4: ");
//        int num4= inputs.nextInt();
        int [] intArray=new int[4];

        for (int i = 0;i < 4; i++) {
            System.out.print("Enter number " + (int)(i+1)  + ": ");
            intArray[i]=inputs.nextInt();
        }
        String st=((intArray[0] == intArray[1]) == (intArray[1] == intArray[2]) ==(intArray[2] == intArray[3])) ?  "all the number are equal ":"all the numbers are not equal";
        System.out.println(st);
    }
}
