import java.util.ArrayList;
import java.util.Scanner;

public class Array_Ds  {
    public static void main(String[] args) {
        ArrayList<String> actorslist= new ArrayList<>();
        Scanner n = new Scanner(System.in);
        while(actorslist.size()<2){
            System.out.println(" enter your favourite actors names: ");
            String input= n.nextLine();
            if(!input.isEmpty()){
                actorslist.add(input);
            }else{
                System.out.println(" please enter a valid name");
            }
        }
        n.close();
        System.out.println("here the list of actors:"+actorslist);

    }
}
