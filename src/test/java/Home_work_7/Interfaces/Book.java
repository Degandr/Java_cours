package Home_work_7.Interfaces;

public class Book implements Printable {

    private final String name;

    protected Book (String name) {
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println("Book's name is " + name);
    }
}
