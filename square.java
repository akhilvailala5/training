public class square {
    private static int sides=4;
    private String name;
    private int  length;

    square(int length, String name){
        this.name=name;
        this.length=length;

    }

    public static int getSides() {
        return sides;
    }

    public static void setSides(int sides) {
        square.sides = sides;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static void main(String[] args) {

        square square1=new square(4, "square2");

        System.out.println("what is my name: "+ square1);
        square1.setName("pentagon ");

        System.out.println("what is my name: "+ square1);
        square.setSides(5);
        square1.perimeter();

        square pentagon =new square(4,"pentagon1");


    }
    public int perimeter(){
        int sum=0;
        for(int i=0;i<=sides;i++){
            sum+=this.length;

        }
    return sum;

    }


}
