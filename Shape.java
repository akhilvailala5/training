public class Shape {
     public static int sides;
    private String name;

    Shape(int No_of_sides, String Name_of_shape){
        this.sides=No_of_sides;
        this.name=Name_of_shape;

    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Shape circle=new Shape(0,"circle1");
//using class variables
        System.out.println(circle.name);
        System.out.println(circle.sides);

//        using class methods
        System.out.println(circle.getName());
        System.out.println(circle.getSides());
    }
}





class Temp{
    public void tempMethod(){
        System.out.println(Shape.sides);
        Shape rectangle=new Shape(4, "rectangle1");
        System.out.println(rectangle.getName());




    }
}