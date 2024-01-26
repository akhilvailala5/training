import java.util.Scanner;

public class Factorial {
    static int number;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        number= sc.nextInt();
        Factorial f=new Factorial();
        f.logicFactorial();

    }
    void logicFactorial(){
        int r=1;
        for (int i=1;i<=number;--number){
             r*=number;

        }
        System.out.println(r);

    }
}
