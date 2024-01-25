import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class JavaPractice {
    public static void main(String[] args) {
        System.out.println(" hi how are you");
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter your name");
        String a =sc.nextLine();
//        for (int b = 0; b<=50; b++){
//            System.out.println(a);
//
//        }
        int b=0;
        while ( b<=50){
            System.out.println(a);
            b++;
        }
    }
}
