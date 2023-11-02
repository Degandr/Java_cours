package Home_work_7.Interfaces;

public class Magazine implements Printable {

    private final String name;

    protected Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Magazine's name is " + name);
    }
}