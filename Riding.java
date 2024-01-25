public class Riding {
    public static void main(String[] args) {

        Honda ref = new Honda();
        ref.bike();

        Riding temp=new Riding();
        temp.bike();


    }

    public void bike() {
        System.out.println("mahender is riding bike");
    }
}

class Honda extends Riding {
    @Override
    public void bike() {
        System.out.println("Honda car runs smoothly");
    }
}


