public class Class_object {
    public static void main(String[] args) {
        animal ref=new animal();
        person p= new person();
        car c=new car();
        employee e=new employee();
        ref.useofeye();
        p.sex();
        c.display_model();
        e.employee_details();
        ref.age=27;
        System.out.println(ref.age);


    }
}
class animal {
    String Eyes;
    int age;
    float height;

    void useofeye(){
        System.out.println("hey i can see with the eyes");

    }
    void age_display(){
        System.out.println("hey here is my age");
    }
    void height_display(){
        System.out.println("hey here is my height");
    }



}
class person{
    String Food;
    int height;
    char gender;
    void eat(){
        System.out.println("i can eat food");
    }
    void  growth(){
        System.out.println("my height is 5.9 feet");
    }
    void sex(){
        System.out.println("my sex is male..!");
    }
}
class car{
    String model;
    int mileage;
    void display_model(){
        System.out.println("2016 is the model of the car");
    }
    void driven(){
        System.out.println("12234 miles driven");
    }

}
class employee{
    int id;
    String role;
    void employee_details(){
        System.out.println(" here are the details of the employee");
    }

}