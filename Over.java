public class Over {
    public static void main(String[] args) {
        Over ref= new Over();
        ref.eat();
        ref.drink();
        ref.drink("rajsheker");

    }

    public void eat() {
        System.out.println("eating chicken");
    }

    public void drink() {
        System.out.println("we are drinking water");
    }
    public void drink(String person){
        System.out.println(person+" is " +
                " drinking water");
    }
}