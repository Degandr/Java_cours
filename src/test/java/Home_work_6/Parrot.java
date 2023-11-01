package Home_work_6;

public class Parrot extends Animal {
    private final String name;

    public Parrot(String location, String food, String name) {
        super(location, food);
        this.name = name;
    }

    @Override
    public String getLocation() {
        return "\n" + "My parrot " + name + " lives at the " + location;
    }

    @Override
    public String getFood() {
        return food + ", lovely food of the " + name + " parrot";
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " parrot make Chirik-Chirik noise");
        makeNoise("Krasivo povtoril");
    }

    public void makeNoise(String repeatWords) {
        System.out.println(repeatWords);
    }

    @Override
    public void eat() {
        System.out.println("You are trying to feed parrot " + name + " with " + getFood());
    }
}
