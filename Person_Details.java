import java.util.Scanner;

public class Person_Details {
   private String name;
   private int age;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the name and age of first Person_Details_Details: ");
        Person_Details p1=new Person_Details(sc.nextLine(),sc.nextInt());
        sc.nextLine();
        System.out.println(" enter the name and age of second Person_Details_Details: ");
        Person_Details p2=new Person_Details(sc.nextLine(),sc.nextInt());
        sc.nextLine();
        System.out.println("the name of person 1 is "+p1.getName());
        System.out.println("the name of person 2 is "+p2.getName());
        System.out.println("the age of person 1 is "+p1.getAge());
        System.out.println("the age of person 2 is "+p2.getAge());

    }
    public Person_Details (){

    }
    public Person_Details(String name, int age){
        this.name=name;
        this.age= age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
