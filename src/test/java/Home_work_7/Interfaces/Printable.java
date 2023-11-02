package Home_work_7.Interfaces;

public interface Printable {
    void print();

    static void main(String[] args) {
        Printable[] arrs = new Printable[4];
        arrs[0] = new Book("Book_1");
        arrs[1] = new Book("Book_2");
        arrs[2] = new Magazine("Magazine_1");
        arrs[3] = new Magazine("Magazine_2");
        for (Printable arr : arrs) {
            arr.print();
        }
    }
}
