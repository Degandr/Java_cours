package Home_work_6;

public class Dog extends Animal {
    private final String name;

    public Dog(String location, String food, String name) {
        super(location, food);
        this.name = name;
    }

    @Override
    public String getLocation() {
        return "\n" + "My dog " + name + " lives at the " + location;
    }

    @Override
    public String getFood() {
        return food + ", lovely food of the " + name + " dog";
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " dog make GaV-GaV noise");
    }

    @Override
    public void eat() {
        System.out.println("You are trying to feed dog " + name + " with " + getFood());
    }
}
