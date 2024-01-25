public class BioData {
    public static void main(String[] args) {
        String[] names = {"Akhil", "Vickram", "Mahender", "Praveen"};
        int[] ages = {24, 30, 33, 45};
        float[] heights = {5.0f, 5.9f, 4.8f, 5.8f};
        double[] weights = {79.2, 33, 88, 99};
        char[] genders = {'M', 'F', 'M', 'M'};


        for (int i = 0; i < names.length; i++) {

            String name = names[i];
            int age = ages[i];
            float height = heights[i];
            double weight = weights[i];
            char gender = genders[i];


            System.out.println("\nStudent " + (i + 1) + " Details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Height: " + height);
            System.out.println("Weight: " + weight);
            System.out.println("Gender: " + gender);
        }
    }
}
