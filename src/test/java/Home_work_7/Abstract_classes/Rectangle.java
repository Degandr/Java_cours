package Home_work_7.Abstract_classes;

public class Rectangle extends Figure {

    @Override
    public void areaCalc(int width, int height) {
        int area = width * height;
        System.out.println("Area is " + area);
    }

    @Override
    public void pyrimeterCalc(int width, int height) {
        int pyrimeter = width + height;
        System.out.println("Pyrimeter is " + pyrimeter);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle ();
        rectangle.areaCalc(3,4);
        rectangle.pyrimeterCalc(5,6);
    }
}
