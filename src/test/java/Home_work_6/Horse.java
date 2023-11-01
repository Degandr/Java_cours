package Home_work_6;

public class Horse extends Animal {
    private final String name;

    public Horse(String location, String food, String name) {
        super(location, food);
        this.name = name;
    }

    @Override
    public String getLocation() {
        return "\n" + "My horse " + name + " lives at the " + location;
    }

    @Override
    public String getFood() {
        return food + ", lovely food of the " + name + " horse";
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " horse make I-Go-Go noise");
    }

    @Override
    public void eat() {
        System.out.println("You are trying to feed horse " + name + " with " + getFood());
    }
}