import java.util.Scanner;

public class evenodd {
    static int num;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");

        num= sc.nextInt();
       evenodd e=new evenodd();
        System.out.println("the sum of first even "+num+" is: " +e.logic());
        System.out.println("the sum of first odd "+num+" is: "+e.oddlogic());


    }
    int logic(){
        int sum=0;
        for (int i=0;i<=num;i++){
            if (i%2==0){
                sum+=i;
            }

        }
        return sum;
    }
    int oddlogic(){
        int sum=0;
        for (int i=0;i<=num;i++){
            if (i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }
}
