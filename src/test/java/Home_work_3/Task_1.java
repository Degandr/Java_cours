package Home_work_3;

public class Task_1 {
    public String name;
    public String surname;
    public String position;
    public int salary;

    public Task_1(String name, String surname, String position, int salary) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
    }

    public void info() {
        System.out.println("My first name is " + name + ".\n My last name is " + surname + ".\n My position is " + position + ".\n My salary is " + salary + "\n");
    }
}
