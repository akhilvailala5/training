import java.util.Scanner;

class methodsum {
    int a,b,addition;

    public static void main(String[] args) {
        new methodsum().takeinput();
    }
/* instance variables inka local variables*/

    void takeinput(){

    Scanner sc=new Scanner(System.in);
    System.out.println("enter two numbers: ");
    a=sc.nextInt();
    b=sc.nextInt();
    sum();
}

    void sum( ){

     addition= (a+b);
    display();


}
    void display(){
        System.out.println("the addition of two numbers:"+ addition);

}
}


