import java.util.ArrayList;
import java.util.Scanner;

public class Participants {
    static ArrayList <member> list;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        list= new ArrayList<>();
        member m1=new member();

//        System.out.println(m1);


        int a=0;

        do {
            System.out.println("please enter any number to do the operation");
            System.out.println("1-->add a new participant");
            System.out.println("2-->search a participnat by name");
            System.out.println("3-->delete a participant by id");
            System.out.println("4-->display the participants already registered");
            System.out.println("5-->update a participant details");
            System.out.println("6-->exit");
            a=sc.nextInt();
            sc.nextLine();
            switch (a){
                case 1:
                    System.out.println("enter the participants name,id,domain:");
                    String name=sc.nextLine();

                    int id=sc.nextInt();
                    sc.nextLine();
                    String domain=sc.nextLine();

                    addNewParticipant(name,domain,id);
                    break;
                case 4:
                    displayAllParticipants();
                    break;
                default:
                    System.out.println("enter the right number:....");
            }


        }while (a!=6);
        System.out.println("thank you...");

    }

    private static void displayAllParticipants() {
        System.out.println("list of the participants are:");
        if (list.size()>=1){
            list.forEach(System.out::println);
        }else
            System.out.println("no members are registered...!");

    }


    static void addNewParticipant(String name, String domain, int id) {
        member newParticipant = new member(name, id, domain);
        list.add(newParticipant);
        System.out.println("new member is successfully registered");
    }
}
 class member {
    private String name;
    private int id;
    private String domain;
    public member(){

    }

    public member(String name, int id, String domain) {
        this.name = name;
        this.id = id;
        this.domain = domain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

     @Override
     public String toString() {
         return "hey the details are:"+"[name: "+this.getName()+", domain: "+this.getDomain()+", id: "+this.getId()+"]";
     }

     //    public void add(member list) {
//    }
}
