import java.util.Scanner;

public class Table {
    int number;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to see the table: ");
        int number=sc.nextInt();
        Table t=new Table();
        t.calculation(number);
    }
    void calculation(int number){
        for (int i = 1; i<=10; i++){
            System.out.println(i*number);

        }
    }
}
