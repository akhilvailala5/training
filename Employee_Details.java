public class Employee_Details {
    private String name;
    private String jobTitle;
    private double salary;

    
    public Employee_Details(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double percentage) {
        double raiseAmount = salary * (percentage / 100);
        salary += raiseAmount;
    }

    public void printEmployee_DetailsInfo() {
        System.out.println("Employee_Details Information:");
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {

        Employee_Details Employee_Details1 = new Employee_Details("Akhil", "FSD", 60000);


        Employee_Details1.printEmployee_DetailsInfo();


        Employee_Details1.raiseSalary(10);


        Employee_Details1.printEmployee_DetailsInfo();
    }
}
