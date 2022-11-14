
public class Employee {
    String name;
    double salary;
    float hours;
    float rate;

    public Employee() {
        name = "Charandeep Singh";

        hours = 10;
        rate = 100;
        salary = rate * hours;
    }

    public void getInfo()
    {

        System.out.printf("Final Salary is $%,.2f\n",salary);

    }
}
