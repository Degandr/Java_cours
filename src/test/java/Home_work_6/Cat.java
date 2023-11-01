package Home_work_6;

public class Cat extends Animal {
    private final String name;

    public Cat(String location, String food, String name) {
        super(location, food);
        this.name = name;
    }

    @Override
    public String getLocation() {
        return "\n" + "My cat " + name + " lives at the " + location;
    }

    @Override
    public String getFood() {
        return food + ", lovely food of the " + name + " cat";
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " cat make MaY-May noise");
    }

    @Override
    public void eat() {
        System.out.println("You are trying to feed cat " + name + " with " + getFood());
    }
}
