import java.util.Scanner;

public class TrafficLight {
    private Boolean color;
    private int duration;
    int Count=0;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        TrafficLight trafficLight = new TrafficLight(true, 10000);


        System.out.print("Press Enter to simulate changing the color...");
        sc.nextLine();

        // Changing the color and checking
        trafficLight.changeColor();
        trafficLight.checkColor();

        // Close the scanner
        sc.close();


    }

    public TrafficLight(boolean color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public boolean getColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    void checkColor(){
//        check color and print what color is displayed.
        if (color==Boolean.TRUE) {
            System.out.println("The traffic light is currently red.");
        } else if (color==Boolean.FALSE) {
            System.out.println("The traffic light is currently green.");
        } else {
            System.out.println("Invalid color.");
        }

    }
    void changeColor(){
        do {

                // Change the color to green after 10 seconds

            setDuration(5000); // Set duration to 30 seconds (standard for green)

                checkColor();
                try {
                    // Introduce a 10-second delay
                    Thread.sleep(duration);
                } catch (InterruptedException e) {
                    System.out.println("there is an error");
//                    e.printStackTrace();
                }
                System.out.println("10 seconds elapsed.");
                setColor(!color);
                setDuration(10000);
            Count++;
        } while (Count<10);
    }


    }

